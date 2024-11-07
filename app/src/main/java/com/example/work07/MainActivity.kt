package com.example.work07
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val cities = resources.getStringArray(R.array.cities_array)
        val spinnerDeparture: Spinner = findViewById(R.id.spinner)
        val adapterDeparture = ArrayAdapter(this, android.R.layout.simple_spinner_item, cities)
        adapterDeparture.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerDeparture.adapter = adapterDeparture
        val spinnerArrival: Spinner = findViewById(R.id.spinner2)
        val adapterArrival = ArrayAdapter(this, android.R.layout.simple_spinner_item, cities)
        adapterArrival.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerArrival.adapter = adapterArrival
    }
}
