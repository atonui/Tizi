package com.example.tizi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_metrics.*
import kotlin.math.roundToInt

class MetricsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_metrics)

        btnCalculate.setOnClickListener {
            //        get data entered by user
            val name = etName.text.toString()
            val height = etHeight.text.toString().toFloat()
            val weight = etWeight.text.toString().toFloat()
            val gender = rgGender.checkedRadioButtonId

            val bmi = weight / (height * height)

            if (name.trim().isEmpty() || height.isNaN() || weight.isNaN()) {
                tvResults.text = "Empty"
            } else {
                tvResults.text = "Your BMI is ${bmi}. " +
                        "In 12 weeks you should be able to squat ${(weight * 1.1).toInt()} kgs, " +
                        "deadlift ${(weight * 1.4).toInt()} kgs and bench press ${(weight * 0.8).toInt()} kgs."
            }

        }





    }
}
