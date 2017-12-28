package coop.rchain.playground

import scala.io.StdIn

import akka.actor.{ ActorSystem }
import akka.http.scaladsl.Http
import akka.http.scaladsl.server.Route
import akka.stream.ActorMaterializer
import akka.http.scaladsl.server.Directives.{ pathPrefix, getFromResourceDirectory }

object Playground {
  def main(args: Array[String]): Unit = {
    implicit val system: ActorSystem = ActorSystem("helloAkkaHttpServer")
    implicit val materializer: ActorMaterializer = ActorMaterializer()
    implicit val executionContext = system.dispatcher

    lazy val routes: Route =
      pathPrefix("") {
        getFromResourceDirectory("playground")
      }

    val bindingFuture = Http().bindAndHandle(routes, "localhost", 8080)
    println(s"Server online at http://localhost:8080/ ...")

    StdIn.readLine() // let it run until user presses return
    bindingFuture
      .flatMap(_.unbind())
      .onComplete(_ => system.terminate())
  }
}
