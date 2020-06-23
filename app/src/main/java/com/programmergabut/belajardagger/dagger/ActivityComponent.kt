package com.programmergabut.belajardagger.dagger

import com.programmergabut.belajardagger.MainActivity
import com.programmergabut.belajardagger.car.Car
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named
import javax.inject.Singleton

@PerActivity
@Component (dependencies = [AppComponent::class], modules = [WheelsModules::class, PetrolEngineModule::class])
interface ActivityComponent {

    fun inject(mainActivity: MainActivity)
    fun getCar(): Car

    @Component.Builder
    interface Builder{
        @BindsInstance
        fun horsePower(@Named("horsePower")horsePower: Int): Builder

        @BindsInstance
        fun engineCapacity(@Named("engineCapacity")engineCapacity: Int): Builder

        fun appComponent(component: AppComponent): Builder
        fun build(): ActivityComponent
    }
}