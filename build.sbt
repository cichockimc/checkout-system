scalaVersion := "2.12.8"
name := "checkout-system"
organization := "uk.co.cichocki"
version := "1.0"

libraryDependencies += "org.scalatest" % "scalatest_2.12" % "3.0.8" % "test"

scalastyleConfig := baseDirectory.value / "project" / "scalastyle-config.xml"
coverageMinimum := 100
coverageFailOnMinimum := true
coverageHighlighting := true