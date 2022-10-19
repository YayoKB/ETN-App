package com.varsitycollege.team10mobileapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.fragment.app.Fragment
import kotlin.random.Random

class booking_consultant : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_booking_consultant, container, false)

        val tvCourses = view.findViewById<TextView>(R.id.tvConsultCourses)
        var courses = ""
        var courseCount = 0

        val btnBack15 = view.findViewById<ImageButton>(R.id.btnBack15)
        val btnBackHome = view.findViewById<Button>(R.id.btnBackToHomeConsult)

        btnBack15.setOnClickListener {
            ScreenList.navigate(ScreenList.bookCourses_screen)
        }

        btnBackHome.setOnClickListener {
            changeToHome(requireContext())
        }

        if(BookingDetails.FirstAid)
        {
            courseCount++

            courses += "First Aid"
        }

        if(BookingDetails.Sewing)
        {
            if (courseCount == 0) {
                courses += "Sewing"
            } else {
                courses += "\nSewing"
            }

            courseCount++
        }

        if(BookingDetails.Landscaping)
        {
            if (courseCount == 0) {
                courses += "Landscaping"
            } else {
                courses += "\nLandscaping"
            }

            courseCount++
        }

        if(BookingDetails.LifeSkills)
        {
            if (courseCount == 0) {
                courses += "Life Skills"
            } else {
                courses += "\nLife Skills"
            }

            courseCount++
        }

        if(BookingDetails.ChildMinding)
        {
            if (courseCount == 0) {
                courses += "Child Minding"
            } else {
                courses += "\nChild Minding"
            }

            courseCount++
        }

        if(BookingDetails.Cooking)
        {
            if (courseCount == 0) {
                courses += "Cooking"
            } else {
                courses += "\nCooking"
            }

            courseCount++
        }

        if(BookingDetails.GardenMaintenance)
        {
            if (courseCount == 0) {
                courses += "Garden Maintenance"
            } else {
                courses += "\nGarden Maintenance"
            }

            courseCount++
        }

        if(courseCount == 0)
        {
            courses = "No Courses Selected"
        }

        tvCourses.text = courses

        val lblReferenceNumber = view.findViewById<TextView>(R.id.tvRefNo)
        lblReferenceNumber.text = GenerateReferenceNumber(BookingDetails.firstName, BookingDetails.lastName)

        return view
    }

    private fun GenerateReferenceNumber(firstName: String, lastName: String): String
    {
        var referenceNumber: String = "${firstName[0]}${lastName[0]}"

        for(k in 1..5)
        {
            referenceNumber += Random.nextInt(0, 9).toString()
        }

        return referenceNumber
    }
}