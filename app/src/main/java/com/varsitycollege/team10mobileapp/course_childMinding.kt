package com.varsitycollege.team10mobileapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import androidx.fragment.app.Fragment

class course_childMinding : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_course_child_minding, container, false)

        val btnBack8 = view.findViewById<ImageButton>(R.id.btnBack8)
        btnBack8.setOnClickListener {
            ScreenList.navigate(ScreenList.shortCourses_screen)
        }

        val btnNext = view.findViewById<Button>(R.id.btnNextChild)
        btnNext.setOnClickListener {
            ScreenList.navigate(ScreenList.course_cooking_screen)
        }

        val btnBCCM = view.findViewById<Button>(R.id.btnBCCM)
        btnBCCM.setOnClickListener {
            ScreenList.navigate(ScreenList.bookCourses_screen)
        }

        val btnAddToCart = view.findViewById<Button>(R.id.btnAddCartChild)
        var checked = BookingDetails.ChildMinding
        btnAddToCart.setOnClickListener {
            checked = !checked
            BookingDetails.ChildMinding = checked

            if (checked) {
                btnAddToCart.text = "Added! Tap to remove"
                btnAddToCart.isActivated = true
            } else {
                btnAddToCart.text = "Add to cart"
                btnAddToCart.isActivated = false
            }
        }

        if (BookingDetails.ChildMinding) {
            btnAddToCart.text = "Added! Tap to remove"
            btnAddToCart.isActivated = true
        }

        return view
    }
}