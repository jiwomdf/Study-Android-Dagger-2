package com.programmergabut.belajardagger.dagger

import com.programmergabut.belajardagger.car.Engine
import com.programmergabut.belajardagger.car.PetrolEngine
import dagger.Binds
import dagger.Module

@Module
abstract class PetrolEngineModule {

    @Binds
    abstract fun bindEngine(engine: PetrolEngine): Engine
}