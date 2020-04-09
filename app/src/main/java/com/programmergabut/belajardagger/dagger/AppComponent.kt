package com.programmergabut.belajardagger.dagger

import com.programmergabut.belajardagger.car.Driver
import dagger.Component
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
@Component(modules = [DriverModule::class])
interface AppComponent {

    fun getDriver(): Driver
}