package com.programmergabut.belajardagger.dagger

import com.programmergabut.belajardagger.MainActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named
import javax.inject.Singleton

@Singleton
@Component (modules = [WheelsModules::class, PetrolEngineModule::class])
interface ActivityComponent {

    fun inject(mainActivity: MainActivity)

    @Component.Builder
    interface Builder{
        @BindsInstance
        fun horsePower(@Named("horsePower")horsePower: Int): Builder
        @BindsInstance
        fun engineCapacity(@Named("engineCapacity")engineCapacity: Int): Builder
        fun build(): ActivityComponent
    }
}