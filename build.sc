import $ivy.`com.goyeau::mill-scalafix::0.4.2`
import $ivy.`org.typelevel::scalac-options:0.1.7`

import com.goyeau.mill.scalafix.StyleModule
import mill._
import mill.scalalib._
import org.typelevel.scalacoptions.{ScalaVersion, ScalacOptions}

object `sessions-spark` extends SbtModule with StyleModule {
  override def scalaVersion = "3.5.2"
  override def scalacOptions = super.scalacOptions() ++ ScalacOptions.tokensForVersion(
    ScalaVersion.unsafeFromString(scalaVersion()),
    ScalacOptions.default
  )
  override def ivyDeps = super.ivyDeps() ++ http4s
}

lazy val http4s = Agg(ivy"org.http4s::http4s-dsl:0.23.28")
