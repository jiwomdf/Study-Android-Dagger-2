package com.programmergabut.belajardagger.dagger

import com.programmergabut.belajardagger.car.Rims
import com.programmergabut.belajardagger.car.Tires
import com.programmergabut.belajardagger.car.Wheels
import dagger.Module
import dagger.Provides

@Module
abstract class WheelsModules {

    companion object{
        @Provides
        fun provideRims(): Rims {
            return Rims()
        }

        @Provides
        fun provideTires(): Tires {
            val tires = Tires()
            tires.inflate()

            return tires
        }

        @Provides
        fun provideWheels(rims: Rims, tires: Tires): Wheels {
            return Wheels(rims, tires)
        }
    }

}