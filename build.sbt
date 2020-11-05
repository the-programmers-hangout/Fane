name := "fane"

version := "0.0.1"

scalaVersion := "2.13.3"

resolvers += "jcenter" at "https://jcenter.bintray.com"

libraryDependencies += "net.dv8tion" % "JDA" % "4.2.0_214"
libraryDependencies += "com.jagrosh" % "jda-utilities-command" % "3.0.4"
libraryDependencies += "org.slf4j" % "slf4j-api" % "2.0.0-alpha1"
libraryDependencies += "org.xerial" % "sqlite-jdbc" % "3.32.3.2"
