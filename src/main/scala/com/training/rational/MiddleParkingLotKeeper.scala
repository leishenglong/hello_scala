package com.training.rational

class MiddleParkingLotKeeper extends AbstractManager {
  override def parkingCar(car: Car): Int = {
    val idlePark = parks.maxBy(park => park.cars.length - park.parkedSize)
    idlePark.parkingCar(car)
  }
}
