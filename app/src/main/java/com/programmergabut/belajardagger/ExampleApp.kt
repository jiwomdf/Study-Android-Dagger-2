package com.programmergabut.belajardagger

import android.app.Application
import com.programmergabut.belajardagger.dagger.ActivityComponent
import com.programmergabut.belajardagger.dagger.DaggerActivityComponent


class ExampleApp : Application() {

    lateinit var component: ActivityComponent

    override fun onCreate() {
        super.onCreate()

        component = DaggerActivityComponent.builder()
            .horsePower(120)
            .engineCapacity(4000)
            .build()
    }

    fun getAppComponent(): ActivityComponent{
        return component
    }

}