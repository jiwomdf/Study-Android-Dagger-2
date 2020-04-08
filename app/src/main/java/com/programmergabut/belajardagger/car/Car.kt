package com.programmergabut.belajardagger.car

import javax.inject.Inject

class Car @Inject constructor(private val engine: Engine, private val wheels: Wheels) {


    @Inject
    fun enableRemote(remote: Remote){
         remote.setListener(this)
    }

    fun drive(){
        engine.start()
        println("Driving...")
    }

}