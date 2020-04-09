package com.programmergabut.belajardagger.dagger

import com.programmergabut.belajardagger.car.DieselEngine
import com.programmergabut.belajardagger.car.Engine
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
class DieselEngineModule(private val horsePower: Int) {

    @Provides
    fun provideHorsePower(): Int{
        return horsePower
    }

    @Provides
    fun provideEngine(engine: DieselEngine): Engine{
        return engine
    }
}