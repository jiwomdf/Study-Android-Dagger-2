package com.programmergabut.belajardagger.dagger

import com.programmergabut.belajardagger.car.DieselEngine
import com.programmergabut.belajardagger.car.Engine
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
class DieselEngineModule(val horsePower: Int) {


    @Provides
    fun provideEngine(): Engine{
        return DieselEngine(horsePower)
    }
}