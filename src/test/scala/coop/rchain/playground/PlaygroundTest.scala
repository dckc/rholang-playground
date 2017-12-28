package coop.rchain.playground

import org.scalatest.{ Matchers, WordSpec }
import akka.http.scaladsl.testkit.ScalatestRouteTest
import akka.http.scaladsl.server.Route

class PlaygroundSpec extends WordSpec with Matchers with ScalatestRouteTest {
  val r0: Route = Playground.routes()

  "Playground service" should {
    "have a home page" in {
      Get("/index.html") ~> r0 ~> check {
        responseAs[String] should include("Hello")
      }
    }
  }
}
