package com.programmergabut.belajardagger.car

import com.programmergabut.belajardagger.car.Car
import javax.inject.Inject

class Remote @Inject constructor() {

    fun setListener(car: Car) {
        println("remote connected..")
    }
}