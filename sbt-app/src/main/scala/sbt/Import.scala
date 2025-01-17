/*
 * sbt
 * Copyright 2011 - 2018, Lightbend, Inc.
 * Copyright 2008 - 2010, Mark Harrah
 * Licensed under Apache License 2.0 (see LICENSE)
 */

package sbt

trait Import {
  type Setting[T] = Def.Setting[T]
  type ScopedKey[T] = Def.ScopedKey[T]
  type SettingsDefinition = Def.SettingsDefinition
  type File = java.io.File
  type URI = java.net.URI
  type URL = java.net.URL

  @deprecated("Will be removed in sbt 2", "1.0.0-RC3")
  def Seq2Vector[T](s: Seq[T]): Vector[T] = s.toVector

  // sbt
  val StdoutOutput = sbt.OutputStrategy.StdoutOutput
  type BufferedOutput = sbt.OutputStrategy.BufferedOutput
  val BufferedOutput = sbt.OutputStrategy.BufferedOutput
  type LoggedOutput = sbt.OutputStrategy.LoggedOutput
  val LoggedOutput = sbt.OutputStrategy.LoggedOutput
  type CustomOutput = sbt.OutputStrategy.CustomOutput
  val CustomOutput = sbt.OutputStrategy.CustomOutput
  val AllRequirements = sbt.PluginTrigger.AllRequirements
  val NoTrigger = sbt.PluginTrigger.NoTrigger

  // sbt.testing
  type TestResult = sbt.protocol.testing.TestResult
  val TestResult = sbt.protocol.testing.TestResult

  // sbt.io
  val AllPassFilter = sbt.io.AllPassFilter
  val CopyOptions = sbt.io.CopyOptions
  type CopyOptions = sbt.io.CopyOptions
  val DirectoryFilter = sbt.io.DirectoryFilter
  type ExactFilter = sbt.io.ExactFilter
  val ExistsFileFilter = sbt.io.ExistsFileFilter
  val FileFilter = sbt.io.FileFilter
  type FileFilter = sbt.io.FileFilter
  val GlobFilter = sbt.io.GlobFilter
  val Hash = sbt.io.Hash
  val HiddenFileFilter = sbt.io.HiddenFileFilter
  val IO = sbt.io.IO
  type Mapper = sbt.io.Mapper
  val NameFilter = sbt.io.NameFilter
  type NameFilter = sbt.io.NameFilter
  val NothingFilter = sbt.io.NothingFilter
  val Path = sbt.io.Path
  val PathFinder = sbt.io.PathFinder
  type PathFinder = sbt.io.PathFinder
  type PatternFilter = sbt.io.PatternFilter
  type RichFile = sbt.io.RichFile
  type SimpleFileFilter = sbt.io.SimpleFileFilter
  type SimpleFilter = sbt.io.SimpleFilter
  type WatchSource = sbt.internal.io.Source
  val WatchSource = sbt.internal.io.Source

  // sbt.nio
  val ** = sbt.nio.file.**
  val * = sbt.nio.file.*
  val AnyPath = sbt.nio.file.AnyPath
  type ChangedFiles = sbt.nio.file.ChangedFiles
  val ChangedFiles = sbt.nio.file.ChangedFiles
  type FileChanges = sbt.nio.FileChanges
  val FileChanges = sbt.nio.FileChanges
  type Glob = sbt.nio.file.Glob
  val Glob = sbt.nio.file.Glob
  type PathFilter = sbt.nio.file.PathFilter
  val PathFilter = sbt.nio.file.PathFilter
  type RelativeGlob = sbt.nio.file.RelativeGlob
  val RelativeGlob = sbt.nio.file.RelativeGlob
  val RecursiveGlob = sbt.nio.file.RecursiveGlob
  val Watch = sbt.nio.Watch

  // sbt.util
  type AbstractLogger = sbt.util.AbstractLogger
  type BasicCache[I, O] = sbt.util.BasicCache[I, O]
  type BasicCacheImplicits = sbt.util.BasicCacheImplicits
  type Cache[I, O] = sbt.util.Cache[I, O]
  val Cache = sbt.util.Cache
  val CacheImplicits = sbt.util.CacheImplicits
  @deprecated("Use Tracked.inputChanged and Tracked.outputChanged instead", "1.0.1")
  type Changed[O] = sbt.util.Changed[O]
  type ChangeReport[T] = sbt.util.ChangeReport[T]
  val ChangeReport = sbt.util.ChangeReport
  type ControlEvent = sbt.util.ControlEvent
  val ControlEvent = sbt.util.ControlEvent
  type Difference = sbt.util.Difference
  val Difference = sbt.util.Difference
  type EmptyChangeReport[T] = sbt.util.EmptyChangeReport[T]
  val FileFunction = sbt.util.FileFunction
  type FileInfo = sbt.util.FileInfo
  val FileInfo = sbt.util.FileInfo
  type FilesInfo[F <: FileInfo] = sbt.util.FilesInfo[F]
  val FilesInfo = sbt.util.FilesInfo
  type HashFileInfo = sbt.util.HashFileInfo
  type HashModifiedFileInfo = sbt.util.HashModifiedFileInfo
  val Level = sbt.util.Level
  type Log = sbt.util.Log
  type LogEvent = sbt.util.LogEvent
  type Logger = sbt.util.Logger
  val Logger = sbt.util.Logger
  type ModifiedFileInfo = sbt.util.ModifiedFileInfo
  type PlainFileInfo = sbt.util.PlainFileInfo
  type SetLevel = sbt.util.SetLevel
  type SetSuccess = sbt.util.SetSuccess
  type SetTrace = sbt.util.SetTrace
  type Show[T] = sbt.util.Show[T]
  val Show = sbt.util.Show
  type ShowLines[A] = sbt.util.ShowLines[A]
  val ShowLines = sbt.util.ShowLines
  type Success = sbt.util.Success
  type Timestamp = sbt.util.Timestamp
  type Trace = sbt.util.Trace
  type Tracked = sbt.util.Tracked
  val Tracked = sbt.util.Tracked

  // sbt.internal.util
  type AbstractRMap[K[_], V[_]] = sbt.internal.util.AbstractRMap[K, V]
  type AlreadyHandledException = sbt.internal.util.AlreadyHandledException
  val AttributeEntry = sbt.internal.util.AttributeEntry
  type AttributeEntry[T] = sbt.internal.util.AttributeEntry[T]
  val AttributeKey = sbt.internal.util.AttributeKey
  type AttributeKey[T] = sbt.internal.util.AttributeKey[T]
  val AttributeMap = sbt.internal.util.AttributeMap
  type AttributeMap = sbt.internal.util.AttributeMap
  val Attributed = sbt.internal.util.Attributed
  type Attributed[D] = sbt.internal.util.Attributed[D]
  type BasicLogger = sbt.internal.util.BasicLogger
  type BufferedLogger = sbt.internal.util.BufferedLogger
  // val Classes = sbt.internal.util.Classes
  val ConsoleLogger = sbt.internal.util.ConsoleLogger
  type ConsoleLogger = sbt.internal.util.ConsoleLogger
  val ConsoleOut = sbt.internal.util.ConsoleOut
  type ConsoleOut = sbt.internal.util.ConsoleOut
  val Dag = sbt.internal.util.Dag
  // type Dag[A <: Dag[A]] = sbt.internal.util.Dag[A]
  type DelegatingPMap[K[_], V[_]] = sbt.internal.util.DelegatingPMap[K, V]
  val ErrorHandling = sbt.internal.util.ErrorHandling
  type EvaluateSettings[S] = sbt.internal.util.EvaluateSettings[S]
  val EvaluationState = sbt.internal.util.EvaluationState
  val ExitHook = sbt.internal.util.ExitHook
  type ExitHook = sbt.internal.util.ExitHook
  val ExitHooks = sbt.internal.util.ExitHooks
  type FeedbackProvidedException = sbt.internal.util.FeedbackProvidedException
  type FilePosition = sbt.internal.util.FilePosition
  type FilterLogger = sbt.internal.util.FilterLogger
  val FullLogger = sbt.internal.util.FullLogger
  type FullLogger = sbt.internal.util.FullLogger
  val FullReader = sbt.internal.util.FullReader
  type FullReader = sbt.internal.util.FullReader
  // val HCons = sbt.internal.util.HCons
  // type HCons[H, T <: HList] = sbt.internal.util.HCons[H, T]
  // val HList = sbt.internal.util.HList
  // type HList = sbt.internal.util.HList
  // val HNil = sbt.internal.util.HNil
  // type HNil = sbt.internal.util.HNil
  val IDSet = sbt.internal.util.IDSet
  type IDSet[T] = sbt.internal.util.IDSet[T]
  val IMap = sbt.internal.util.IMap
  type IMap[K[_], V[_]] = sbt.internal.util.IMap[K, V]
  type Init[S] = sbt.internal.util.Init[S]
  type JLine = sbt.internal.util.JLine
  // val KCons = sbt.internal.util.KCons
  // type KCons[H, +T <: KList[M], +M[_]] = sbt.internal.util.KCons[H, T, M]
  // type KList[+M[_]] = sbt.internal.util.KList[M]
  // val KNil = sbt.internal.util.KNil
  // type KNil = sbt.internal.util.KNil
  val LinePosition = sbt.internal.util.LinePosition
  type LinePosition = sbt.internal.util.LinePosition
  val LineRange = sbt.internal.util.LineRange
  type LineRange = sbt.internal.util.LineRange
  type LineReader = sbt.internal.util.LineReader
  val LoggerWriter = sbt.internal.util.LoggerWriter
  type LoggerWriter = sbt.internal.util.LoggerWriter
  type MessageOnlyException = sbt.internal.util.MessageOnlyException
  type MultiLogger = sbt.internal.util.MultiLogger
  val NoPosition = sbt.internal.util.NoPosition
  val PMap = sbt.internal.util.PMap
  type PMap[K[_], V[_]] = sbt.internal.util.PMap[K, V]
  type RMap[K[_], V[_]] = sbt.internal.util.RMap[K, V]
  val RangePosition = sbt.internal.util.RangePosition
  type RangePosition = sbt.internal.util.RangePosition
  val Relation = sbt.internal.util.Relation
  type Relation[A, B] = sbt.internal.util.Relation[A, B]
  val ScalaKeywords = sbt.internal.util.ScalaKeywords
  type Settings[S] = sbt.internal.util.Settings[S]
  type SharedAttributeKey[T] = sbt.internal.util.SharedAttributeKey[T]
  val Signals = sbt.internal.util.Signals
  val SimpleReader = sbt.internal.util.SimpleReader
  type SimpleReader = sbt.internal.util.SimpleReader
  type SourcePosition = sbt.internal.util.SourcePosition
  val StackTrace = sbt.internal.util.StackTrace
  type SuppressedTraceContext = sbt.internal.util.SuppressedTraceContext
  type TranslatedException = sbt.internal.util.TranslatedException
  type TranslatedIOException = sbt.internal.util.TranslatedIOException
  // val TypeFunctions = sbt.internal.util.TypeFunctions
  type TypeFunctions = sbt.internal.util.TypeFunctions
  val Types = sbt.internal.util.Types
  // type Types = sbt.internal.util.Types
  type UnprintableException = sbt.internal.util.UnprintableException
  val Util = sbt.internal.util.Util
  // val ~> = sbt.internal.util.~>
  // type ~>[-K[_], +V[_]] = sbt.internal.util.~>[K, V]

  // sbt.internal.util.complete
  object complete {
    val Completion = sbt.internal.util.complete.Completion
    type Completion = sbt.internal.util.complete.Completion
    val Completions = sbt.internal.util.complete.Completions
    type Completions = sbt.internal.util.complete.Completions
    val DefaultParsers = sbt.internal.util.complete.DefaultParsers
    type DisplayOnly = sbt.internal.util.complete.DisplayOnly
    val EditDistance = sbt.internal.util.complete.EditDistance
    type ExampleSource = sbt.internal.util.complete.ExampleSource
    val FileExamples = sbt.internal.util.complete.FileExamples
    type FileExamples = sbt.internal.util.complete.FileExamples
    val Finite = sbt.internal.util.complete.Finite
    type Finite = sbt.internal.util.complete.Finite
    val FixedSetExamples = sbt.internal.util.complete.FixedSetExamples
    type FixedSetExamples = sbt.internal.util.complete.FixedSetExamples
    val History = sbt.internal.util.complete.History
    val HistoryCommands = sbt.internal.util.complete.HistoryCommands
    val Infinite = sbt.internal.util.complete.Infinite
    val JLineCompletion = sbt.internal.util.complete.JLineCompletion
    val Parser = sbt.internal.util.complete.Parser
    type Parser[+T] = sbt.internal.util.complete.Parser[T]
    type ParserMain = sbt.internal.util.complete.ParserMain
    val Parsers = sbt.internal.util.complete.Parsers
    type Parsers = sbt.internal.util.complete.Parsers
    val ProcessError = sbt.internal.util.complete.ProcessError
    type Suggestion = sbt.internal.util.complete.Suggestion
    type Token = sbt.internal.util.complete.Token
    val TokenCompletions = sbt.internal.util.complete.TokenCompletions
    type TokenCompletions = sbt.internal.util.complete.TokenCompletions
    val TypeString = sbt.internal.util.complete.TypeString
    type TypeString = sbt.internal.util.complete.TypeString
    val UpperBound = sbt.internal.util.complete.UpperBound
    type UpperBound = sbt.internal.util.complete.UpperBound
  }

  // sbt.librarymanagement
  val Artifact = sbt.librarymanagement.Artifact
  type Artifact = sbt.librarymanagement.Artifact
  val Binary = sbt.librarymanagement.Binary
  type Binary = sbt.librarymanagement.Binary
  val Caller = sbt.librarymanagement.Caller
  type Caller = sbt.librarymanagement.Caller
  val ChainedResolver = sbt.librarymanagement.ChainedResolver
  type ChainedResolver = sbt.librarymanagement.ChainedResolver
  val CircularDependencyLevel = sbt.librarymanagement.ivy.CircularDependencyLevel
  type CircularDependencyLevel = sbt.librarymanagement.ivy.CircularDependencyLevel
  val ConfigRef = sbt.librarymanagement.ConfigRef
  type ConfigRef = sbt.librarymanagement.ConfigRef
  val Configuration = sbt.librarymanagement.Configuration
  type Configuration = sbt.librarymanagement.Configuration
  val ConfigurationReport = sbt.librarymanagement.ConfigurationReport
  type ConfigurationReport = sbt.librarymanagement.ConfigurationReport
  val Configurations = sbt.librarymanagement.Configurations
  val ConflictManager = sbt.librarymanagement.ConflictManager
  type ConflictManager = sbt.librarymanagement.ConflictManager
  val ConflictWarning = sbt.librarymanagement.ConflictWarning
  type ConflictWarning = sbt.librarymanagement.ConflictWarning
  val Credentials = sbt.librarymanagement.ivy.Credentials
  type Credentials = sbt.librarymanagement.ivy.Credentials
  val CrossVersion = sbt.librarymanagement.CrossVersion
  type CrossVersion = sbt.librarymanagement.CrossVersion
  val DefaultMavenRepository = sbt.librarymanagement.Resolver.DefaultMavenRepository
  val Developer = sbt.librarymanagement.Developer
  type Developer = sbt.librarymanagement.Developer
  val Disabled = sbt.librarymanagement.Disabled
  type Disabled = sbt.librarymanagement.Disabled
  type DirectCredentials = sbt.librarymanagement.ivy.DirectCredentials
  val EvictionPair = sbt.librarymanagement.EvictionPair
  type EvictionPair = sbt.librarymanagement.EvictionPair
  val EvictionWarning = sbt.librarymanagement.EvictionWarning
  type EvictionWarning = sbt.librarymanagement.EvictionWarning
  val EvictionWarningOptions = sbt.librarymanagement.EvictionWarningOptions
  type EvictionWarningOptions = sbt.librarymanagement.EvictionWarningOptions
  // val ExclusionRule = sbt.librarymanagement.InclExclRule
  // type ExclusionRule = sbt.librarymanagement.InclExclRule
  type FileCredentials = sbt.librarymanagement.ivy.FileCredentials
  val FileRepository = sbt.librarymanagement.FileRepository
  type FileRepository = sbt.librarymanagement.FileRepository
  val Full = sbt.librarymanagement.Full
  type Full = sbt.librarymanagement.Full
  val InlineConfiguration = sbt.librarymanagement.ModuleDescriptorConfiguration
  type InlineConfiguration = sbt.librarymanagement.ModuleDescriptorConfiguration
  val IvyScala = sbt.librarymanagement.ScalaModuleInfo
  type IvyScala = sbt.librarymanagement.ScalaModuleInfo
  val JCenterRepository = sbt.librarymanagement.Resolver.JCenterRepository
  val JavaNet2Repository = sbt.librarymanagement.Resolver.JavaNet2Repository
  import sbt.librarymanagement.{ InclExclRule, DependencyBuilders }
  given Conversion[String, InclExclRule] = InclExclRule.stringToExclusionRule
  given Conversion[DependencyBuilders.OrganizationArtifactName, InclExclRule] =
    InclExclRule.organizationArtifactNameToExclusionRule

  // todo: fix
  // val License = sbt.librarymanagement.License

  type LogicalClock = sbt.librarymanagement.LogicalClock
  val LogicalClock = sbt.librarymanagement.LogicalClock
  type MakePomConfiguration = sbt.librarymanagement.MakePomConfiguration
  val MakePomConfiguration = sbt.librarymanagement.MakePomConfiguration
  val MavenCache = sbt.librarymanagement.MavenCache
  type MavenCache = sbt.librarymanagement.MavenCache
  val MavenRepo = sbt.librarymanagement.MavenRepo
  type MavenRepo = sbt.librarymanagement.MavenRepo
  val MavenRepository = sbt.librarymanagement.MavenRepository
  type MavenRepository = sbt.librarymanagement.MavenRepository
  val ModuleConfiguration = sbt.librarymanagement.ModuleConfiguration
  type ModuleConfiguration = sbt.librarymanagement.ModuleConfiguration
  val ModuleDescriptorConfiguration = sbt.librarymanagement.ModuleDescriptorConfiguration
  type ModuleDescriptorConfiguration = sbt.librarymanagement.ModuleDescriptorConfiguration
  val ModuleID = sbt.librarymanagement.ModuleID
  type ModuleID = sbt.librarymanagement.ModuleID
  val ModuleInfo = sbt.librarymanagement.ModuleInfo
  type ModuleInfo = sbt.librarymanagement.ModuleInfo
  val ModuleReport = sbt.librarymanagement.ModuleReport
  type ModuleReport = sbt.librarymanagement.ModuleReport
  val ModuleSettings = sbt.librarymanagement.ModuleSettings
  type ModuleSettings = sbt.librarymanagement.ModuleSettings
  val OrganizationArtifactReport = sbt.librarymanagement.OrganizationArtifactReport
  type OrganizationArtifactReport = sbt.librarymanagement.OrganizationArtifactReport
  val Patterns = sbt.librarymanagement.Patterns
  type Patterns = sbt.librarymanagement.Patterns
  type PatternsBasedRepository = sbt.librarymanagement.PatternsBasedRepository
  val Platform = sbt.librarymanagement.Platform
  val PublishConfiguration = sbt.librarymanagement.PublishConfiguration
  type PublishConfiguration = sbt.librarymanagement.PublishConfiguration
  type RawRepository = sbt.librarymanagement.RawRepository
  val Resolver = sbt.librarymanagement.Resolver
  type Resolver = sbt.librarymanagement.Resolver
  val SbtArtifacts = sbt.librarymanagement.SbtArtifacts
  val ScalaArtifacts = sbt.librarymanagement.ScalaArtifacts
  val ScalaVersion = sbt.librarymanagement.ScalaVersion
  type ScalaVersion = sbt.librarymanagement.ScalaVersion
  val ScmInfo = sbt.librarymanagement.ScmInfo
  type ScmInfo = sbt.librarymanagement.ScmInfo
  val SemanticSelector = sbt.librarymanagement.SemanticSelector
  type SemanticSelector = sbt.librarymanagement.SemanticSelector
  val SftpRepository = sbt.librarymanagement.SftpRepository
  type SftpRepository = sbt.librarymanagement.SftpRepository
  type SshBasedRepository = sbt.librarymanagement.SshBasedRepository
  val SshRepository = sbt.librarymanagement.SshRepository
  type SshRepository = sbt.librarymanagement.SshRepository
  type TrackLevel = sbt.librarymanagement.TrackLevel
  val TrackLevel = sbt.librarymanagement.TrackLevel
  val URLRepository = sbt.librarymanagement.URLRepository
  type URLRepository = sbt.librarymanagement.URLRepository
  val UpdateLogging = sbt.librarymanagement.UpdateLogging
  val UpdateOptions = sbt.librarymanagement.ivy.UpdateOptions
  type UpdateOptions = sbt.librarymanagement.ivy.UpdateOptions
  val UpdateReport = sbt.librarymanagement.UpdateReport
  type UpdateReport = sbt.librarymanagement.UpdateReport
  val UpdateStats = sbt.librarymanagement.UpdateStats
  type UpdateStats = sbt.librarymanagement.UpdateStats
  val VersionNumber = sbt.librarymanagement.VersionNumber
  type VersionNumber = sbt.librarymanagement.VersionNumber
  type VersionNumberCompatibility = sbt.librarymanagement.VersionNumberCompatibility

  // sbt.librarymanagement.ivy
  val InlineIvyConfiguration = sbt.librarymanagement.ivy.InlineIvyConfiguration
  type InlineIvyConfiguration = sbt.librarymanagement.ivy.InlineIvyConfiguration
  type IvyPaths = sbt.librarymanagement.ivy.IvyPaths
  val IvyPaths = sbt.librarymanagement.ivy.IvyPaths

  type FileConverter = xsbti.FileConverter
  type HashedVirtualFileRef = xsbti.HashedVirtualFileRef
  type IncOptions = xsbti.compile.IncOptions
}
