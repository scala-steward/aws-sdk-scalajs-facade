val scalaJSVersion =
  Option(System.getenv("SCALAJS_VERSION")).filter(_.nonEmpty).getOrElse("1.0.0")
val scalaJSBundlerArtifactId = if (scalaJSVersion.startsWith("0.6")) {
  "sbt-scalajs-bundler-sjs06"
} else {
  "sbt-scalajs-bundler"
}
addSbtPlugin("org.scala-js"      % "sbt-scalajs"            % scalaJSVersion)
addSbtPlugin("org.scalameta"     % "sbt-scalafmt"           % "2.3.1")
addSbtPlugin("org.xerial.sbt"    % "sbt-sonatype"           % "3.8.1")
addSbtPlugin("com.github.gseitz" % "sbt-release"            % "1.0.13")
addSbtPlugin("com.jsuereth"      % "sbt-pgp"                % "2.0.1")
addSbtPlugin("ch.epfl.scala"     % scalaJSBundlerArtifactId % "0.17.0")
addSbtPlugin("com.dwijnand"      % "sbt-travisci"           % "1.2.0")

// Workaround for https://github.com/scalacenter/scalajs-bundler/issues/329
// Remove when updating sbt-scalajs-bundler
libraryDependencies ++= Seq("org.scala-js" %% "scalajs-linker" % "1.0.0")
  .filter(_ => scalaJSVersion.startsWith("1.0"))
