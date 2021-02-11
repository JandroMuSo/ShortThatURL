name := "ShortThatURL"

version := "0.1"

scalaVersion := "2.13.4"

idePackagePrefix := Some("dev.jandromuso")


libraryDependencies ++= Seq(
  "org.springframework.boot" % "spring-boot-starter-web" % "2.4.2",
  "javax.validation" % "validation-api" % "2.0.1.Final"
)