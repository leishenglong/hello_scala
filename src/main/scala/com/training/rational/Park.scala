package com.training.rational

import scala.:+

case class Park(var cars: Array[Car] = Array.empty) {
  def this(size: Int) {
    this(new Array[Car](size))
  }

  def parkingCar(car: Car): Int = {
    for (i <- 0 until cars.length) {
      if (cars(i) == null) {
        cars(i) = car
        return i
      }
    }
    -1
  }

  def movingCar(position: Int): Car = {
    for (i <- 0 until cars.length) {
      if (i == position) {
        val car = cars(i)
        cars(i) = null
        return car
      }
    }
    null
  }
}