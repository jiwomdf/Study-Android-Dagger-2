package com.programmergabut.belajardagger.car

import javax.inject.Inject

class DieselEngine @Inject constructor(private var horsePower: Int): Engine {


    override fun start() {
        println("Petrol engine started. Horsepower : $horsePower")
    }
}