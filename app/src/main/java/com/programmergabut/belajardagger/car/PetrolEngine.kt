package com.programmergabut.belajardagger.car

import javax.inject.Inject
import javax.inject.Named

class PetrolEngine @Inject constructor(@Named("horsePower") private val horsePower: Int,
                                       @Named("engineCapacity") private val engineCapacity: Int) : Engine {

    override fun start() {
        println("Petrol engine started. Horsepower: $horsePower")
        println("Engine capacity: $engineCapacity")
    }
}