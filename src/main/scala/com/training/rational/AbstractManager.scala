package com.training.rational


abstract class AbstractManager extends TraitManager {
  var name: String = null
  var parks: List[Park] = null //管理的停车场

  override def parkingCar(car: Car): Int = {
    parks.foreach(park => {
      if (park.parkedSize < park.cars.length) {
        return park.parkingCar(car)
      }
    })
//    val park = parks.find(park => park.parkedSize < park.cars.length).get
    val park = parks.find(park => park.parkedSize < park.cars.length).getOrElse(-1)
    if(park.isInstanceOf[Park]){
      val ark = park.asInstanceOf[Park]
      return ark.parkingCar(car)
    }
    -1
  }
}
