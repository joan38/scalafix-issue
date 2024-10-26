package com.netflix.data.playback.sessions.util.sandbox

import cats.effect.IO
import cats.syntax.all.*

object Sandbox:
  def passIfRegionFailoverOccurred(auditFail: String): IO[String] =
        for
          result <-
            if true then IO(show"""some message""".stripMargin)
            else throw Exception(auditFail)

          _ <- IO(println(show"${result}"))
        yield result
