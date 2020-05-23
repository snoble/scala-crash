Makes scala error out when attempting to compile. Includes a def called `lambdaList`. When the def doesn't start with `lambda` it works fine.

run with either
`sbt compile twelve`
or
`sbt compile thirteen`

Also on scastie https://scastie.scala-lang.org/MywoibUzRSm0Sfb7jGjK8w

```
sbt:13> thirteen/compile
[info] Compiling 1 Scala source to /home/steven/Code/scala-crash/target/scala-2.13/classes ...
[error] Error while emitting Crash.scala
[error] assertion failed: 
[error]   Crash$$anonfun$lambdaList$1
[error]      while compiling: /home/steven/Code/scala-crash/src/main/scala/crash/Crash.scala
[error]         during phase: jvm
[error]      library version: version 2.13.2
[error]     compiler version: version 2.13.2
[error]   reconstructed args: -bootclasspath /usr/lib/jvm/java-8-openjdk-amd64/jre/lib/resources.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/rt.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/sunrsasign.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/jsse.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/jce.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/charsets.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/jfr.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/classes:/home/steven/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.2/scala-library-2.13.2.jar -classpath /home/steven/Code/scala-crash/target/scala-2.13/classes
[error] 
[error]   last tree to typer: Ident(default)
[error]        tree position: line 4 of /home/steven/Code/scala-crash/src/main/scala/crash/Crash.scala
[error]             tree tpe: Function1
[error]               symbol: value default
[error]    symbol definition: default: Function1 (a TermSymbol)
[error]       symbol package: crash
[error]        symbol owners: value default -> method applyOrElse -> <$anon: Function1>
[error]            call site: constructor Crash$$anonfun$lambdaList$1 in package crash
[error] 
[error] == Source file context for tree position ==
[error] 
[error]      1 package crash
[error]      2 
[error]      3 object Crash {
[error]      4   def lambdaList(lst: List[Int]): List[Int] = lst.collect { case n if n > 0 => n }
[error]      5 }
[error]      6 
[error] Error while emitting Crash.scala
[error] assertion failed: Crash$$anonfun$lambdaList$1
[error] two errors found
[error] (Compile / compileIncremental) Compilation failed
[error] Total time: 3 s, completed May 22, 2020 9:03:52 PM
```
