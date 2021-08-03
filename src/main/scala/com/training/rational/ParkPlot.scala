package com.training.rational

import scala.:+

case class ParkPlot(size: Int,
                    var cars: List[Car] = List.empty) {
  def parkingCar(car: Car): Int = {
    cars = cars :+ car
    cars.size
  }

  def movingCar(position: Int): Car = {
    val car = cars(position - 1)
    cars = cars diff List(car)
    car
  }
}