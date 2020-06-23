package com.programmergabut.belajardagger.car

import com.programmergabut.belajardagger.dagger.PerActivity
import javax.inject.Inject

@PerActivity
class Car @Inject constructor(private val driver: Driver, private val engine: Engine, private val wheels: Wheels) {

    @Inject
    fun enableRemote(remote: Remote){
         remote.setListener(this)
    }

    fun drive(){
        engine.start()
        println("$driver drive $this")
    }

}