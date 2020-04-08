package com.programmergabut.belajardagger.dagger

import com.programmergabut.belajardagger.MainActivity
import dagger.Component

@Component (modules = [WheelsModules::class, DieselEngineModule::class])
interface CarComponent {

    fun inject(mainActivity: MainActivity)

}