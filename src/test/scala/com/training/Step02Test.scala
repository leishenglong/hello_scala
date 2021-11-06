package com.training

import com.training.rational.{Car, Park, ParkingLotKeeper}
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class Step02Test extends AnyWordSpec with Matchers {


  "Step02Test" should {

    "given two Parks the first Is Idle when parking Car then parking In The First Park" in {
      val parkingLot = ParkingLotKeeper()
      parkingLot.name = "p1"
      parkingLot.parks = List(Park(1, Array(Car("11"), null)), Park(0))
      val car = Car("22")
      val position = parkingLot.parkingCar(car)
      position shouldEqual 1
      parkingLot.parks(0).parkedSize shouldEqual 2
    }

    "given two Parks the first Is full and second is idle  when parking Car then parking In The second Park" in {
      val parkingLot = ParkingLotKeeper()
      parkingLot.name = "p1"
      parkingLot.parks = List(Park(2, Array(Car("11"), Car("22"))), Park(0, Array(null, null)))
      val car = Car("22")
      val position = parkingLot.parkingCar(car)
      position shouldEqual 0
      parkingLot.parks.head.parkedSize shouldEqual 2
      parkingLot.parks(1).parkedSize shouldEqual 1
      parkingLot.parkingCar(Car("33")) should
        be(1)
    }
  }

}
