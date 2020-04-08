package com.programmergabut.belajardagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.programmergabut.belajardagger.car.Car
import com.programmergabut.belajardagger.dagger.DaggerCarComponent
import com.programmergabut.belajardagger.dagger.DieselEngineModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component = DaggerCarComponent.builder()
            .dieselEngineModule(DieselEngineModule(100))
            .build()

        component.inject(this)

        car.drive()
    }
}
