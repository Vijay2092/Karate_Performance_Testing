package examples.users
import com.intuit.karate.core.Scenario
import io.gatling.core.structure.ScenarioBuilder

import scala.language.postfixOps


import io.gatling.core.scenario.Simulation
import com.intuit.karate.gatling.PreDef._
import io.gatling.core.Predef._

import scala.concurrent.duration._
//import scala.language.postfixOps

class TestUserSimulation  extends Simulation {

  val getUser= scenario("getCall").exec(karateFeature("classpath:examples/users/users.feature"))

 setUp(
    getUser.inject(rampUsers(10)during(5  seconds ))
 )

//  val protocol = karateProtocol(
//    "/cats/{id}" -> Nil,
//    "/cats" -> pauseFor("get" -> 15, "post" -> 25)
//  )
//
//  protocol.nameResolver = (req, ctx) => req.getHeader("karate-name")
//  protocol.runner.karateEnv("perf")
//
//  val create = scenario("create").exec(karateFeature("classpath:mock/cats-create.feature"))
//  val delete = scenario("delete").exec(karateFeature("classpath:mock/cats-delete.feature@name=delete"))
//
//  setUp(
//    create.inject(rampUsers(10) during (5 seconds)).protocols(protocol),
//    delete.inject(rampUsers(5) during (5 seconds)).protocols(protocol)
//  )

}

