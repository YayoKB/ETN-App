package com.varsitycollege.team10mobileapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import androidx.fragment.app.Fragment

class course_cooking : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_course_cooking, container, false)

        val btnBack9 = view.findViewById<ImageButton>(R.id.btnBack9)
        btnBack9.setOnClickListener {
            ScreenList.navigate(ScreenList.shortCourses_screen)
        }

        val btnNext = view.findViewById<Button>(R.id.btnNextCooking)
        btnNext.setOnClickListener {
            ScreenList.navigate(ScreenList.course_gardenMaintenance_screen)
        }

        val btnBCCook = view.findViewById<Button>(R.id.btnBCCook)
        btnBCCook.setOnClickListener {
            ScreenList.navigate(ScreenList.bookCourses_screen)
        }

        val btnPrev = view.findViewById<Button>(R.id.btnPrevCooking)
        btnPrev.setOnClickListener {
            ScreenList.navigate(ScreenList.course_childMinding_screen)
        }

        val btnAddToCart = view.findViewById<Button>(R.id.btnAddCartCooking)
        var checked = BookingDetails.Cooking
        btnAddToCart.setOnClickListener {
            checked = !checked
            BookingDetails.Cooking = checked

            if (checked) {
                btnAddToCart.text = "Added! Tap to remove"
                btnAddToCart.isActivated = true
            } else {
                btnAddToCart.text = "Add to cart"
                btnAddToCart.isActivated = false
            }
        }

        if (BookingDetails.Cooking) {
            btnAddToCart.text = "Added! Tap to remove"
            btnAddToCart.isActivated = true
        }

        return view
    }
}