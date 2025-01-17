/*
 * sbt
 * Copyright 2011 - 2018, Lightbend, Inc.
 * Copyright 2008 - 2010, Mark Harrah
 * Licensed under Apache License 2.0 (see LICENSE)
 */

package sbt

import java.io.File

import sbt.io.IO
import sbt.protocol.testing.TestResult
import java.util.concurrent.ConcurrentHashMap

import scala.collection.concurrent

// Assumes exclusive ownership of the file.
private[sbt] class TestStatusReporter(f: File) extends TestsListener {
  private lazy val succeeded: concurrent.Map[String, Long] = TestStatus.read(f)

  def doInit(): Unit = ()
  def startGroup(name: String): Unit = { succeeded remove name; () }
  def testEvent(event: TestEvent): Unit = ()
  def endGroup(name: String, t: Throwable): Unit = ()
  def endGroup(name: String, result: TestResult): Unit = {
    if (result == TestResult.Passed)
      succeeded(name) = System.currentTimeMillis
  }
  def doComplete(finalResult: TestResult): Unit = {
    TestStatus.write(succeeded, "Successful Tests", f)
  }
}

private[sbt] object TestStatus {
  import java.util.Properties
  def read(f: File): concurrent.Map[String, Long] = {
    import scala.jdk.CollectionConverters.*
    val properties = new Properties
    IO.load(properties, f)
    val result = new ConcurrentHashMap[String, Long]()
    properties.asScala.iterator.foreach { case (k, v) => result.put(k, v.toLong) }
    result.asScala
  }

  def write(map: collection.Map[String, Long], label: String, f: File): Unit = {
    val properties = new Properties
    for ((test, lastSuccessTime) <- map)
      properties.setProperty(test, lastSuccessTime.toString)
    IO.write(properties, label, f)
  }
}
