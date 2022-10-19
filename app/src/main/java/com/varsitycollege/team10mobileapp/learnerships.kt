package com.varsitycollege.team10mobileapp

import android.app.Activity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import androidx.fragment.app.Fragment

class learnerships : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_learnerships, container, false)

        val btnBack2 = view.findViewById<ImageButton>(R.id.btnBack2)
        val btnFirstAid = view.findViewById<ImageButton>(R.id.btnFirstAid)
        val btnSewing = view.findViewById<ImageButton>(R.id.btnSewing)
        val btnLandscaping = view.findViewById<ImageButton>(R.id.btnLandscaping)
        val btnLifeSkills = view.findViewById<ImageButton>(R.id.btnLifeSkills)
        val btnShortCourses2 = view.findViewById<Button>(R.id.btnShortCoursesLearnerships)

        btnBack2.setOnClickListener {
            // update navigation bar
            changeToHome(requireContext())
        }

        btnFirstAid.setOnClickListener {
            ScreenList.navigate(ScreenList.course_firstAid_screen)
        }

        btnSewing.setOnClickListener {
            ScreenList.navigate(ScreenList.course_sewing_screen)
        }

        btnLandscaping.setOnClickListener {
            ScreenList.navigate(ScreenList.course_landscaping_screen)
        }

        btnLifeSkills.setOnClickListener {
            ScreenList.navigate(ScreenList.course_lifeSkills_screen)
        }

        btnShortCourses2.setOnClickListener {
            // update navigation bar
            changeToShortCourses(requireContext())
        }

        return view
    }
}