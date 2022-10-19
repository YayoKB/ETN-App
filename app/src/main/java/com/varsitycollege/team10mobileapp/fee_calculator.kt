package com.varsitycollege.team10mobileapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.text.DecimalFormat

class fee_calculator : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fee_calculator)

        var learnershipsPrice: Double = 0.0
        var nLearnerships: Int = 0
        var shortCoursesPrice: Double = 0.0
        var nShortCourses: Int = 0

        if(BookingDetails.FirstAid)
        {
            learnershipsPrice += 1500.0
            nLearnerships++
        }

        if(BookingDetails.Sewing)
        {
            learnershipsPrice += 1500.0
            nLearnerships++
        }

        if(BookingDetails.Landscaping)
        {
            learnershipsPrice += 1500.0
            nLearnerships++
        }

        if(BookingDetails.LifeSkills)
        {
            learnershipsPrice += 1500.0
            nLearnerships++
        }

        if(BookingDetails.ChildMinding)
        {
            shortCoursesPrice += 750.0
            nShortCourses++
        }

        if(BookingDetails.Cooking)
        {
            shortCoursesPrice += 750.0
            nShortCourses++
        }

        if(BookingDetails.GardenMaintenance)
        {
            shortCoursesPrice += 750.0
            nShortCourses++
        }

        val lblQuantity1 = findViewById<TextView>(R.id.lblQuantity1)
        val lblQuantity2 = findViewById<TextView>(R.id.lblQuantity2)
        val lblPrice1 = findViewById<TextView>(R.id.lblPrice1)
        val lblPrice2 = findViewById<TextView>(R.id.lblPrice2)
        val lblPrice3 = findViewById<TextView>(R.id.lblPrice3)
        val lblPrice4 = findViewById<TextView>(R.id.lblPrice4)
        val lblPrice5 = findViewById<TextView>(R.id.lblPrice5)
        val lblPrice6 = findViewById<TextView>(R.id.lblPrice6)

        val df = DecimalFormat("#.##")
        df.minimumFractionDigits = 2

        lblQuantity1.text = "x$nLearnerships"
        lblQuantity2.text = "x$nShortCourses"

        lblPrice1.text = "R${df.format(learnershipsPrice)}"
        lblPrice2.text = "R${df.format(shortCoursesPrice)}"

        val totalCourses = nLearnerships + nShortCourses
        val totalPrice = learnershipsPrice + shortCoursesPrice
        var discountPrice: Double = 0.0

        if(totalCourses == 2)
        {
            discountPrice = totalPrice * 0.05
        }

        if(totalCourses == 3)
        {
            discountPrice = totalPrice * 0.1
        }

        if(totalCourses > 3)
        {
            discountPrice = totalPrice * 0.15
        }

        lblPrice3.text = "- R${df.format(discountPrice)}"

        val subtotal = totalPrice - discountPrice
        lblPrice4.text = "R${df.format(subtotal)}"

        val vatPrice = subtotal * 0.15
        lblPrice5.text = "R${df.format(vatPrice)}"

        val totalPayable = subtotal + vatPrice
        lblPrice6.text = "R${df.format(totalPayable)}"

        val btnBack13 = findViewById<Button>(R.id.btnBack13)
        btnBack13.setOnClickListener {
            this.finish()
        }
    }
}