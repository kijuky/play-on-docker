name := """play-on-docker"""
organization := "com.example"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)
  .enablePlugins(DockerPlugin)
  .settings(
    Universal / javaOptions ++= Seq("-Dpidfile.path=/dev/null"),
    dockerBaseImage := "eclipse-temurin:11",
    dockerExposedPorts ++= Seq(9000)
  )

scalaVersion := "2.13.8"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "com.example.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "com.example.binders._"
