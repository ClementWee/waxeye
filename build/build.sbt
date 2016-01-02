import sbt._

lazy val root = (project in file(".")).
  settings(
    name := "waxscala",
    version := "0.1a",
    scalaVersion := "2.11.6",
	scalaSource in Compile := Path.absolute(file("../src/scala")),
	exportJars := true,
	target := Path.absolute(file("../bin"))
  )