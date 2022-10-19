package com.varsitycollege.team10mobileapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import androidx.fragment.app.Fragment

class course_firstAid : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_course_first_aid, container, false)

        val btnBack5 = view.findViewById<ImageButton>(R.id.btnBack5)
        btnBack5.setOnClickListener {
            ScreenList.navigate(ScreenList.learnerships_screen)
        }

        val btnNext = view.findViewById<Button>(R.id.btnNextFirstAid)
        btnNext.setOnClickListener {
            ScreenList.navigate(ScreenList.course_sewing_screen)
        }

        val btnBCFA = view.findViewById<Button>(R.id.btnBCFA)
        btnBCFA.setOnClickListener {
            ScreenList.navigate(ScreenList.bookCourses_screen)
        }

        val btnAddToCart = view.findViewById<Button>(R.id.btnAddCartFirstAid)
        var checked = BookingDetails.FirstAid
        btnAddToCart.setOnClickListener {
            checked = !checked
            BookingDetails.FirstAid = checked

            if (checked) {
                btnAddToCart.text = "Added! Tap to remove"
                btnAddToCart.isActivated = true
            } else {
                btnAddToCart.text = "Add to cart"
                btnAddToCart.isActivated = false
            }
        }

        if (BookingDetails.FirstAid) {
            btnAddToCart.text = "Added! Tap to remove"
            btnAddToCart.isActivated = true
        }

        return view
    }
}