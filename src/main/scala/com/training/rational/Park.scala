package com.training.rational


/**
 *
 * @param parkedSize 已经停车的数量
 * @param cars       车位总数量
 */
case class Park(var parkedSize: Int = 0, var cars: Array[Car] = Array.empty) {

  //  def this(size: Int) {
  //    this(0,cars=new Array[Car](size))
  //  }

  def parkingCar(car: Car): Int = {
    for (i <- 0 until cars.length) {
      if (cars(i) == null) {
        cars(i) = car
        parkedSize += 1
        return i
      }
    }
    -1
  }

  def movingCar(position: Int): Car = {
    for (i <- 0 until cars.length) {
      if (i == position) {
        val car = cars(i)
        parkedSize -= 1
        cars(i) = null
        return car
      }
    }
    null
  }
}