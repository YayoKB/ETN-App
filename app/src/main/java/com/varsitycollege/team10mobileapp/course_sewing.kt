package com.varsitycollege.team10mobileapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import androidx.fragment.app.Fragment

class course_sewing : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_course_sewing, container, false)

        val btnBack3 = view.findViewById<ImageButton>(R.id.btnBack3)
        btnBack3.setOnClickListener {
            ScreenList.navigate(ScreenList.learnerships_screen)
        }

        val btnNext = view.findViewById<Button>(R.id.btnNextSewing)
        btnNext.setOnClickListener {
            ScreenList.navigate(ScreenList.course_landscaping_screen)
        }

        val btnPrev = view.findViewById<Button>(R.id.btnPrevSewing)
        btnPrev.setOnClickListener {
            ScreenList.navigate(ScreenList.course_firstAid_screen)
        }

        val btnBCSewing = view.findViewById<Button>(R.id.btnBCSewing)
        btnBCSewing.setOnClickListener {
            ScreenList.navigate(ScreenList.bookCourses_screen)
        }

        val btnAddToCart = view.findViewById<Button>(R.id.btnAddCartSewing)
        var checked = BookingDetails.Sewing
        btnAddToCart.setOnClickListener {
            checked = !checked
            BookingDetails.Sewing = checked

            if (checked) {
                btnAddToCart.text = "Added! Tap to remove"
                btnAddToCart.isActivated = true
            } else {
                btnAddToCart.text = "Add to cart"
                btnAddToCart.isActivated = false
            }
        }

        if (BookingDetails.Sewing) {
            btnAddToCart.text = "Added! Tap to remove"
            btnAddToCart.isActivated = true
        }

        return view
    }
}