package com.varsitycollege.team10mobileapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import androidx.fragment.app.Fragment

class contact : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_contact, container, false)

        val btnBack12 = view.findViewById<ImageButton>(R.id.btnBack12)
        val btnBackToHomeContact = view.findViewById<Button>(R.id.btnBackToHomeContact)

        btnBack12.setOnClickListener {
            // update navigation bar
            changeToBookings(requireContext())
        }

        btnBackToHomeContact.setOnClickListener {
            // update navigation bar
            changeToHome(requireContext())
        }

        return view
    }
}