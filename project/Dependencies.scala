import sbt._
import Keys._
import org.scalajs.sbtplugin.ScalaJSPlugin._
import org.portablescala.sbtplatformdeps.PlatformDepsPlugin.autoImport._

// see https://github.com/scala-js/scala-js/issues/1331
import autoImport._

object Dependencies {
  object shared {
    val scalatest = Def.setting("org.scalatest" %%% "scalatest" % "3.0.8" % Test)
  }
  object scalajs {
    val nodejs = Def.setting("net.exoego" %%% "scala-js-nodejs-v8" % "0.8.0")
  }
}