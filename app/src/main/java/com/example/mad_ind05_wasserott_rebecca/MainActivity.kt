package com.example.mad_ind05_wasserott_rebecca

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mad_ind05_wasserott_rebecca.databinding.ActivityMainBinding
import layout.StatesDataModel

class MainActivity : AppCompatActivity() {
    var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        val adapter = MyAdapter(StatesDataModel.statesList)
        binding?.rvStateNames?.adapter = adapter
    }

    override fun onDestroy(){
        super.onDestroy()

        binding = null
    }
}