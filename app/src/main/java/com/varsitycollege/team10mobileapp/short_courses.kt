package com.varsitycollege.team10mobileapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import androidx.fragment.app.Fragment

class short_courses : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_short_courses, container, false)

        val btnBack7 = view.findViewById<ImageButton>(R.id.btnBack7)
        val btnChildMinding = view.findViewById<ImageButton>(R.id.btnChildMinding)
        val btnCooking = view.findViewById<ImageButton>(R.id.btnCooking)
        val btnGardenMaintenance = view.findViewById<ImageButton>(R.id.btnGardenMaintenance)
        val btnBookCourses2 = view.findViewById<Button>(R.id.btnBookCourses2)

        btnBack7.setOnClickListener {
            // update navigation bar
            changeToLearnerships(requireContext())
        }

        btnChildMinding.setOnClickListener {
            ScreenList.navigate(ScreenList.course_childMinding_screen)
        }

        btnCooking.setOnClickListener {
            ScreenList.navigate(ScreenList.course_cooking_screen)
        }

        btnGardenMaintenance.setOnClickListener {
            ScreenList.navigate(ScreenList.course_gardenMaintenance_screen)
        }

        btnBookCourses2.setOnClickListener {
            // update navigation bar
            changeToBookings(requireContext())
        }

        return view
    }
}