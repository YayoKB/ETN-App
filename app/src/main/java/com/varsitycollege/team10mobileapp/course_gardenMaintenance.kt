package com.varsitycollege.team10mobileapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import androidx.fragment.app.Fragment

class course_gardenMaintenance : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_course_garden_maintenance, container, false)

        val btnBack10 = view.findViewById<ImageButton>(R.id.btnBack10)
        btnBack10.setOnClickListener {
            ScreenList.navigate(ScreenList.shortCourses_screen)
        }

        val btnPrev = view.findViewById<Button>(R.id.btnPrevGarden)
        btnPrev.setOnClickListener {
            ScreenList.navigate(ScreenList.course_cooking_screen)
        }

        val btnBCGM = view.findViewById<Button>(R.id.btnBCGM)
        btnBCGM.setOnClickListener {
            ScreenList.navigate(ScreenList.bookCourses_screen)
        }

        val btnAddToCart = view.findViewById<Button>(R.id.btnAddCartGarden)
        var checked = BookingDetails.GardenMaintenance
        btnAddToCart.setOnClickListener {
            checked = !checked
            BookingDetails.GardenMaintenance = checked

            if (checked) {
                btnAddToCart.text = "Added! Tap to remove"
                btnAddToCart.isActivated = true
            } else {
                btnAddToCart.text = "Add to cart"
                btnAddToCart.isActivated = false
            }
        }

        if (BookingDetails.GardenMaintenance) {
            btnAddToCart.text = "Added! Tap to remove"
            btnAddToCart.isActivated = true
        }

        return view
    }
}