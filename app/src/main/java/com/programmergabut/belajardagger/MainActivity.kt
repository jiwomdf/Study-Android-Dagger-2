package com.programmergabut.belajardagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.programmergabut.belajardagger.car.Car
import com.programmergabut.belajardagger.dagger.DaggerActivityComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject lateinit var car1: Car
    @Inject lateinit var car2: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val appComponent = (application as ExampleApp).getAppComponent()

        val activityComponent = DaggerActivityComponent.builder()
            .engineCapacity(120)
            .horsePower(100)
            .appComponent(appComponent)
            .build()

        activityComponent.inject(this)

        car1.drive()
        car2.drive()
    }
}
