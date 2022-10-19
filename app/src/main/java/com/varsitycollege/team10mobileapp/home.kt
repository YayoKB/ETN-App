package com.varsitycollege.team10mobileapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import androidx.fragment.app.Fragment

class home : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        val btnBack = view.findViewById<ImageButton>(R.id.btnBack)
        btnBack.setOnClickListener { ScreenList.main_screen.finish() }

        ScreenList.btnHome.setImageDrawable(resources.getDrawable(R.drawable.ic_home_filled))

        val btnLearnerships2 = view.findViewById<Button>(R.id.btnLearnershipsHome)
        btnLearnerships2.setOnClickListener {
            // update navigation bar
            changeToLearnerships(requireContext())
        }

        return view
    }

}