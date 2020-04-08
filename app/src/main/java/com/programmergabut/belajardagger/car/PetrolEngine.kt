package com.programmergabut.belajardagger.car

import javax.inject.Inject

class PetrolEngine @Inject constructor() :
    Engine {
    override fun start() {
        println("Petrol engine started")
    }
}