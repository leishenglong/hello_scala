package com.training

import com.training.rational.{Car, ParkPlot}
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class ParkingLotSpec extends AnyWordSpec with Matchers {

  "ParkingLot Spec" should {

    "do something" in {
      val args = Array("a", "b", "c")
      val result = args.drop(1)
      println(result.length)
    }

    "given car and plot when parking Car then return position" in {
      val car = Car("111")
      val parkPlot = ParkPlot(10)
      val position = parkPlot.parkingCar(car);
      position shouldEqual 1
      val p =  parkPlot.parkingCar(Car("112"))
      p shouldEqual 2
    }

    "given car and plot when parked car then return car" in {
      val parkPlot = ParkPlot(10, List(Car("123")))
      parkPlot.movingCar(1) shouldEqual Car("123")
      parkPlot.cars.size shouldEqual 0
    }



  }

}
