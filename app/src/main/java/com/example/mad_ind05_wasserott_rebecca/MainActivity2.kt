package com.example.mad_ind05_wasserott_rebecca

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mad_ind05_wasserott_rebecca.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    var binding: ActivityMain2Binding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding?.root)

        val rowNum = intent.getStringExtra("rowNum")
        val stateName = intent.getStringExtra("stateName")
        val milesNum = intent.getStringExtra("stateMiles")
        binding!!.MyTextView.text = stateName
        binding!!.miles.text = milesNum

        //flag
        val stateFlag = intent.getStringExtra("stateFlag")
        val res = getResources().getIdentifier(stateFlag,"drawable", getPackageName())
        binding!!.Flag.setImageResource(res)

        //map
        val stateMap = intent.getStringExtra("stateMap")
        val res1 = getResources().getIdentifier(stateMap, "drawable", getPackageName())
        binding!!.Map.setImageResource(res1)

    }

}