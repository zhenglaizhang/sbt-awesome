// net.virtualvoid.sbt.graph.Plugin.graphSettings
triggeredMessage in ThisBuild := Watched.clearWhenTriggered

cancelable in Global := true

libraryDependencies += "com.lihaoyi" % "ammonite" % "0.7.7" % "test" cross CrossVersion.full

initialCommands in (Test, console) := """ammonite.Main().run()"""

// shellPrompt := { state =>
  // "sbt [%s]> ".format(Project.extract(state).currentProject.id)
// }

updateOptions := updateOptions.value.withCachedResolution(true)

import com.scalapenos.sbt.prompt.SbtPrompt.autoImport._

promptTheme := com.scalapenos.sbt.prompt.PromptThemes.ScalapenosTheme

