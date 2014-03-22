lazy val root = project.in( file(".")).dependsOn(code)

lazy val code = project.in( file("module-code") )

name := "securesocialRoot"

version := "2.1.3"
