package com.varsitycollege.team10mobileapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import androidx.fragment.app.Fragment

class course_lifeSkills : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_course_life_skills, container, false)

        val btnBack4 = view.findViewById<ImageButton>(R.id.btnBack4)
        btnBack4.setOnClickListener {
            ScreenList.navigate(ScreenList.learnerships_screen)
        }

        val btnPrev = view.findViewById<Button>(R.id.btnPrevLife)
        btnPrev.setOnClickListener {
            ScreenList.navigate(ScreenList.course_landscaping_screen)
        }

        val btnBCLS = view.findViewById<Button>(R.id.btnBCLS)
        btnBCLS.setOnClickListener {
            ScreenList.navigate(ScreenList.bookCourses_screen)
        }

        val btnAddToCart = view.findViewById<Button>(R.id.btnAddCartLife)
        var checked = BookingDetails.LifeSkills
        btnAddToCart.setOnClickListener {
            checked = !checked
            BookingDetails.LifeSkills = checked

            if (checked) {
                btnAddToCart.text = "Added! Tap to remove"
                btnAddToCart.isActivated = true
            } else {
                btnAddToCart.text = "Add to cart"
                btnAddToCart.isActivated = false
            }
        }

        if (BookingDetails.LifeSkills) {
            btnAddToCart.text = "Added! Tap to remove"
            btnAddToCart.isActivated = true
        }

        return view
    }
}