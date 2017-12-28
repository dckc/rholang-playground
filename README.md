## context

 - [rholang play web site like rust playground, crystal playground, etc.][185]

[185]: https://github.com/rchain/Members/issues/185

## precedent: crystal playground

[crystal playground](https://play.crystal-lang.org/)
source code: [crystal/tools/playground](https://github.com/crystal-lang/crystal/tree/master/src/compiler/crystal/tools/playground)
using codemirror-5.22.0

### tryhaskell REPL

https://github.com/tryhaskell/tryhaskell/tree/master/src


## simple scala web server: Akka HTTP

spray has become Akka HTTP

    sbt -Dsbt.version=0.13.15 new https://github.com/akka/akka-http-scala-seed.g8

https://doc.akka.io/docs/akka-http/current/routing-dsl/index.html#minimal-example
https://doc.akka.io/docs/akka-http/current/routing-dsl/directives/index.html

## dev tools: ENSIME

scala and Flycheck didn't "just work"; after some fiddling, this did:

https://github.com/frgomes/debian-scripts/blob/master/install-scala.sh

uninstall / reinstall yasnippet

https://github.com/coursier/coursier
http://ensime.github.io/editors/emacs/install/
