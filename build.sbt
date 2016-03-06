name := "hello-spark-sbt"

version := "current"

libraryDependencies ++= Seq(
  "com.sparkjava" % "spark-core" % "2.1"
)

mainClass in (Compile, run) := Some("hello.Application")
