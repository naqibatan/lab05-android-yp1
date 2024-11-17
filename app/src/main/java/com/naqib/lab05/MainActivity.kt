package com.naqib.lab05

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.naqib.lab05.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(view)

        binding.button.setOnClickListener {

            var pizzaSizePrice = 0.0
            var toppingsTotal = 0.0

            when {
                binding.smallRadioBtn.isChecked -> pizzaSizePrice = 5.0
                binding.mediumRadioBtn.isChecked -> pizzaSizePrice = 7.0
                binding.largeRadioBtn.isChecked -> pizzaSizePrice = 9.0
            }
            if(binding.onionBox1.isChecked){
                toppingsTotal += 1
            }
            if(binding.olivesBox2.isChecked){
                toppingsTotal += 1
            }
            if(binding.tomatoesBox3.isChecked){
                toppingsTotal += 1
            }
        }
        binding.totalTextView.text = "Total Order Price = RM ${pizzaSizePrice + toppingsTotal}"
    }
}