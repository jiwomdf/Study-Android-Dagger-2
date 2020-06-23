package com.programmergabut.belajardagger.dagger

import com.programmergabut.belajardagger.car.Driver
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component
interface AppComponent {
    fun getDriver(): Driver
    fun getActivityComponentBuilder(): ActivityComponent.Builder
}