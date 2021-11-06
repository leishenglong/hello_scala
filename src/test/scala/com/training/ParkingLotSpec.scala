package com.training

import com.training.rational.{Car, Park}
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class ParkingLotSpec extends AnyWordSpec with Matchers {

  "ParkingLot Spec" should {

    "given car and plot when parking Car then return position" in {
      val car = Car("111")
      val parkPlot = Park(0, new Array[Car](2))
      val position = parkPlot.parkingCar(car);
      position shouldEqual 0
      val p = parkPlot.parkingCar(Car("112"))
      p shouldEqual 1
    }

    "given car and plot when moving car then return car" in {
      val parkPlot = Park(0, Array(Car("123")))
      parkPlot.movingCar(0) shouldEqual Car("123")
    }

    "given two cars and plot when moving one by one then return cars by orderly" in {
      val parkPlot = Park(0, Array(Car("123"), Car("456")))

      val firstCar = parkPlot.movingCar(0)
      firstCar shouldEqual Car("123")
      val secondCar = parkPlot.movingCar(1)
      secondCar shouldEqual Car("456")
    }


  }

}
