package com.varsitycollege.team10mobileapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import androidx.fragment.app.Fragment

class course_landscaping : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_course_landscaping, container, false)

        val btnBack6 = view.findViewById<ImageButton>(R.id.btnBack6)
        btnBack6.setOnClickListener {
            ScreenList.navigate(ScreenList.learnerships_screen)
        }

        val btnNext = view.findViewById<Button>(R.id.btnNextLandscaping)
        btnNext.setOnClickListener {
            ScreenList.navigate(ScreenList.course_lifeSkills_screen)
        }

        val btnPrev = view.findViewById<Button>(R.id.btnPrevLandscaping)
        btnPrev.setOnClickListener {
            ScreenList.navigate(ScreenList.course_sewing_screen)
        }

        val btnBCLand = view.findViewById<Button>(R.id.btnBCLand)
        btnBCLand.setOnClickListener {
            ScreenList.navigate(ScreenList.bookCourses_screen)
        }

        val btnAddToCart = view.findViewById<Button>(R.id.btnAddCartLandscaping)
        var checked = BookingDetails.Landscaping
        btnAddToCart.setOnClickListener {
            checked = !checked
            BookingDetails.Landscaping = checked

            if (checked) {
                btnAddToCart.text = "Added! Tap to remove"
                btnAddToCart.isActivated = true
            } else {
                btnAddToCart.text = "Add to cart"
                btnAddToCart.isActivated = false
            }
        }

        if (BookingDetails.Landscaping) {
            btnAddToCart.text = "Added! Tap to remove"
            btnAddToCart.isActivated = true
        }

        return view
    }
}