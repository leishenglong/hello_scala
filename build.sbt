//import sbtrelease.Version

name := "hello_scala"
version := "1.0.0"
scalaVersion := "2.12.8"

val scalazVersion = "7.1.3"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.1.1" % "test",
  "org.scalatestplus" %% "mockito-3-2" % "3.1.1.0" % "test"
)

//resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"
