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


  }

}
