package com.programmergabut.belajardagger.dagger

import com.programmergabut.belajardagger.car.Driver
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
abstract class DriverModule {

    companion object{
        @Provides
        @Singleton
        fun provideDriver(): Driver{
            return Driver()
        }
    }
}