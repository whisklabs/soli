lazy val commonSettings = inThisBuild(
  List(
    organization := "com.whisk",
    scalaVersion := "2.12.6",
    version := "0.1.0",
    scalacOptions ++= Seq("-feature", "-deprecation", "-language:implicitConversions"),
    publishMavenStyle := true,
    homepage := Some(url("https://github.com/whisklabs/soli")),
    scmInfo := Some(
      ScmInfo(
        url("https://github.com/whisklabs/soli"),
        "scm:git:github.com/whisklabs/soli.git"
      )
    ),
    developers := List(
      Developer(id = "viktortnk",
        name = "Viktor Taranenko",
        email = "viktortnk@gmail.com",
        url = url("https://finelydistributed.io/"))
    ),
    publishTo := Some(Opts.resolver.sonatypeStaging)
  ))

lazy val root = project
  .in(file("."))
  .settings(commonSettings)
  .settings(publish := {}, publishLocal := {}, packagedArtifacts := Map.empty)
  .aggregate(analysisCommonDe)

lazy val analysisCommonDe = project
  .in(file("analysis/common/de"))
  .settings(
    name := "soli-analysis-common-de",
    commonSettings,
    licenses += "GPLv2" -> url("https://www.gnu.org/licenses/gpl-2.0.html"),
    crossPaths := false,
    autoScalaLibrary := false,
    libraryDependencies ++= Seq(
      "junit" % "junit" % "4.12" % "test"
    )
  )