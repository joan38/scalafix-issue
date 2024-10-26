# Scalafix parsing Issue

```
% ./mill __.fix
Compiling /Users/jgoyeau/IdeaProjects/scalafix-0.4.2-issue/build.sc
[34/45] sessions-spark.compile 
[info] compiling 1 Scala source to /Users/jgoyeau/IdeaProjects/scalafix-0.4.2-issue/out/sessions-spark/compile.dest/classes ...
[info] done compiling
[45/45] sessions-spark.fix 
Rewriting and linting 1 Scala sources against 6 rules
/Users/jgoyeau/IdeaProjects/scalafix-0.4.2-issue/sessions-spark/src/main/scala/com/netflix/data/playback/sessions/util/sandbox/Sandbox.scala:13:13: error: `outdent` expected but `<-` found
          _ <- IO(println(show"${result}"))
            ^^
1 targets failed
sessions-spark.fix A source file failed to be parsed
```
