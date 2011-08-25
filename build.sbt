name := ""

scalaVersion := "2.9.0-1"

seq(webSettings: _*)

libraryDependencies ++= {
val liftVersion = "2.4-M3"
Seq(
  "net.liftweb" %% "lift-webkit" % liftVersion % "compile->default"
)  
}

libraryDependencies ++= Seq(
  "junit" % "junit" % "4.5" % "test->default",
  "org.mortbay.jetty" % "jetty" % "6.1.22" % "jetty",
  "javax.servlet" % "servlet-api" % "2.5" % "provided->default",
  "ch.qos.logback" % "logback-classic" % "0.9.26" % "compile->default",
  "org.scala-tools.testing" %% "specs" % "1.6.8" % "test->default"
)
