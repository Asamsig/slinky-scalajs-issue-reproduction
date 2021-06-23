Global / onChangedBuildSource := ReloadOnSourceChanges
import org.scalajs.linker.interface.ModuleSplitStyle

import scala.sys.process.Process

scalaVersion := "2.13.6"

enablePlugins(ScalaJSPlugin)

libraryDependencies += "me.shadaj" %%% "slinky-core" % "0.6.7" // core React functionality, no React DOM
libraryDependencies += "me.shadaj" %%% "slinky-web" % "0.6.7" // React DOM, HTML and SVG tags

scalacOptions += "-Ymacro-annotations"

scalaJSLinkerConfig ~= {
  _.withModuleKind(ModuleKind.ESModule)
    .withModuleSplitStyle(ModuleSplitStyle.SmallestModules)
}

Compile / fastLinkJS / scalaJSLinkerOutputDirectory := target.value / "scalajs"
Compile / fullLinkJS / scalaJSLinkerOutputDirectory := target.value / "scalajs"