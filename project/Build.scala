import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "play-todo-postgres"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(

  javaCore,
  javaJdbc,
  javaEbean,
  // dependencies here
  "postgresql" % "postgresql" % "9.1-901-1.jdbc4"
  )

  val main = play.Project(appName, appVersion, appDependencies).settings(
  // project settings here
  )
}