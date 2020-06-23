package com.programmergabut.belajardagger

import android.app.Application
import com.programmergabut.belajardagger.dagger.AppComponent
import com.programmergabut.belajardagger.dagger.DaggerAppComponent


class ExampleApp : Application() {

    private lateinit var component: AppComponent

    override fun onCreate() {
        super.onCreate()

        component = DaggerAppComponent.create()
    }

    fun getAppComponent(): AppComponent = component

}