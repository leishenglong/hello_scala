import sbt.librarymanagement.Configurations.Test

name := "hello_scala"
version := "1.0.0"
scalaVersion := "2.12.8"

val scalazVersion = "7.1.3"
val catsEffectVersion="2.2.0"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.1.1" % Test,
  "org.scalatestplus" %% "mockito-3-2" % "3.1.1.0" % Test,
  "org.typelevel" %% "cats-core" % "2.3.0" % Test,
//  "org.typelevel" %% "cats-effect-laws" % catsEffectVersion Test
  "com.huaban" % "jieba-analysis" % "1.0.2"


)

coverageMinimum in ThisBuild := 100
