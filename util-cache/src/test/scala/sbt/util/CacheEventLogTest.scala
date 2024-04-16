package sbt.util

import sbt.internal.util.{ ActionCacheEvent, CacheEventLog }
import verify.BasicTestSuite

object CacheEventLogTest extends BasicTestSuite:
  test("summary of 0 events") {
    val logger = CacheEventLog()
    val expectedSummary = ""
    assertEquals(logger.summary, expectedSummary)
  }

  test("summary of 1 disk event") {
    val logger = CacheEventLog()
    logger.append(ActionCacheEvent.Found("disk"))
    val expectedSummary = "cache 100%, 1 disk cache hit"
    assertEquals(logger.summary, expectedSummary)
  }

  test("summary of 2 disk events") {
    val logger = CacheEventLog()
    logger.append(ActionCacheEvent.Found("disk"))
    logger.append(ActionCacheEvent.Found("disk"))
    val expectedSummary = "cache 100%, 2 disk cache hits"
    assertEquals(logger.summary, expectedSummary)
  }

  test("summary of 1 disk, 1 miss event") {
    val logger = CacheEventLog()
    logger.append(ActionCacheEvent.Found("disk"))
    logger.append(ActionCacheEvent.NotFound)
    val expectedSummary = "cache 50%, 1 disk cache hit, 1 onsite task"
    assertEquals(logger.summary, expectedSummary)
  }

  test("summary of 1 disk, 2 remote, 1 miss event") {
    val logger = CacheEventLog()
    logger.append(ActionCacheEvent.Found("disk"))
    logger.append(ActionCacheEvent.Found("remote"))
    logger.append(ActionCacheEvent.Found("remote"))
    logger.append(ActionCacheEvent.NotFound)
    val expectedSummary = "cache 75%, 1 disk cache hit, 2 remote cache hits, 1 onsite task"
    assertEquals(logger.summary, expectedSummary)
  }

  test("summary of 1 disk event after clear") {
    val logger = CacheEventLog()
    logger.append(ActionCacheEvent.Found("disk"))
    logger.clear()
    logger.append(ActionCacheEvent.Found("disk"))
    val expectedSummary = "cache 100%, 1 disk cache hit"
    assertEquals(logger.summary, expectedSummary)
  }
end CacheEventLogTest