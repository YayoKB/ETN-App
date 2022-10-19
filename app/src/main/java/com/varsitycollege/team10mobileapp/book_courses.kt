package com.varsitycollege.team10mobileapp

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.Fragment


class book_courses : Fragment() {

    lateinit var cbFirstAid: CheckBox
    lateinit var cbSewing: CheckBox
    lateinit var cbLandscaping: CheckBox
    lateinit var cbLifeSkills: CheckBox
    lateinit var cbChildMinding: CheckBox
    lateinit var cbCooking: CheckBox
    lateinit var cbGardenMaintenance: CheckBox

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_book_courses, container, false)

        val btnBack11 = view.findViewById<ImageButton>(R.id.btnBackBook)
        val btnConsult = view.findViewById<Button>(R.id.btnConsult)
        val btnCalculate = view.findViewById<Button>(R.id.btnCalculate)
        val btnConfirm = view.findViewById<Button>(R.id.btnConfirm)

        val edtFirstName = view.findViewById<EditText>(R.id.edtFirstName)
        val edtLastName = view.findViewById<EditText>(R.id.edtLastName)
        val edtPhoneNumber = view.findViewById<EditText>(R.id.edtPhoneNumber)
        val edtEmailAddress = view.findViewById<EditText>(R.id.edtEmailAddress)
        val edtStreetAddress = view.findViewById<EditText>(R.id.edtStreetAddress)
        val edtSuburb = view.findViewById<EditText>(R.id.edtSuburb)
        val edtCity = view.findViewById<EditText>(R.id.edtCity)
        val edtZIP = view.findViewById<EditText>(R.id.edtZIP)

        cbFirstAid = view.findViewById<CheckBox>(R.id.cbFirstAid)
        cbSewing = view.findViewById<CheckBox>(R.id.cbSewing)
        cbLandscaping = view.findViewById<CheckBox>(R.id.cbLandscaping)
        cbLifeSkills = view.findViewById<CheckBox>(R.id.cbLifeSkills)
        cbChildMinding = view.findViewById<CheckBox>(R.id.cbChildMinding)
        cbCooking = view.findViewById<CheckBox>(R.id.cbCooking)
        cbGardenMaintenance = view.findViewById<CheckBox>(R.id.cbGardenMaintenance)

        cbFirstAid.setOnClickListener { BookingDetails.FirstAid = cbFirstAid.isChecked }
        cbSewing.setOnClickListener { BookingDetails.Sewing = cbSewing.isChecked }
        cbLandscaping.setOnClickListener { BookingDetails.Landscaping = cbLandscaping.isChecked }
        cbLifeSkills.setOnClickListener { BookingDetails.LifeSkills = cbLifeSkills.isChecked }
        cbChildMinding.setOnClickListener { BookingDetails.ChildMinding = cbChildMinding.isChecked }
        cbCooking.setOnClickListener { BookingDetails.Cooking = cbCooking.isChecked }
        cbGardenMaintenance.setOnClickListener { BookingDetails.GardenMaintenance = cbGardenMaintenance.isChecked }

        btnBack11.setOnClickListener {
            // update navigation bar
            changeToShortCourses(requireContext())
        }

        btnConsult.setOnClickListener {
            if (edtFirstName.text.toString() != "" && edtLastName.text.toString() != "" && edtPhoneNumber.text.toString() != "" &&
                edtEmailAddress.text.toString() != "" && edtStreetAddress.text.toString() != "" && edtSuburb.text.toString() != "" &&
                edtCity.text.toString() != "" && edtZIP.text.toString() != "") {

                if(edtEmailAddress.text.contains("@")) {
                    BookingDetails.firstName = edtFirstName.text.toString()
                    BookingDetails.lastName = edtLastName.text.toString()

                    ScreenList.navigate(ScreenList.booking_consultant_screen)
                }
                else
                {
                    Toast.makeText(this.context, "Invalid email address. The email address must contain the symbol '@'.", Toast.LENGTH_LONG).show()
                }
            }
            else
            {
                Toast.makeText(this.context, "Complete the form to continue!", Toast.LENGTH_LONG).show()
            }
        }

        btnCalculate.setOnClickListener {
            if (cbFirstAid.isChecked || cbSewing.isChecked || cbLandscaping.isChecked ||
                cbLifeSkills.isChecked || cbChildMinding.isChecked || cbCooking.isChecked ||
                cbGardenMaintenance.isChecked)
            {
                val intent = Intent(ScreenList.main_screen, fee_calculator::class.java)
                startActivity(intent)
            }
            else
            {
                Toast.makeText(this.context, "Select at least one course to view the fee calculator!", Toast.LENGTH_LONG).show()
            }
        }

        btnConfirm.setOnClickListener {
            if ((cbFirstAid.isChecked || cbSewing.isChecked || cbLandscaping.isChecked ||
                 cbLifeSkills.isChecked || cbChildMinding.isChecked || cbCooking.isChecked ||
                 cbGardenMaintenance.isChecked) && (edtFirstName.text.toString() != "" &&
                 edtLastName.text.toString() != "" && edtPhoneNumber.text.toString() != "" &&
                 edtEmailAddress.text.toString() != "" && edtStreetAddress.text.toString() != "" &&
                 edtSuburb.text.toString() != "" && edtCity.text.toString() != "" && edtZIP.text.toString() != "")) {

                if(edtEmailAddress.text.contains("@")) {
                    BookingDetails.firstName = edtFirstName.text.toString()
                    BookingDetails.lastName = edtLastName.text.toString()
                    BookingDetails.phoneNumber = edtPhoneNumber.text.toString()
                    BookingDetails.emailAddress = edtEmailAddress.text.toString()
                    BookingDetails.streetAddress = edtStreetAddress.text.toString()
                    BookingDetails.suburb = edtSuburb.text.toString()
                    BookingDetails.city = edtCity.text.toString()
                    BookingDetails.zipCode = edtZIP.text.toString()

                    ScreenList.navigate(ScreenList.booking_confirmed_screen)
                }
                else
                {
                    Toast.makeText(this.context, "Invalid email address. The email address must contain the symbol '@'.", Toast.LENGTH_LONG).show()
                }
            }
            else
            {
                Toast.makeText(this.context, "Complete the form to continue!", Toast.LENGTH_LONG).show()
            }
        }

        return view
    }

    override fun onResume() {
        super.onResume()

        cbFirstAid.isChecked = BookingDetails.FirstAid
        cbSewing.isChecked = BookingDetails.Sewing
        cbLandscaping.isChecked = BookingDetails.Landscaping
        cbLifeSkills.isChecked = BookingDetails.LifeSkills
        cbChildMinding.isChecked = BookingDetails.ChildMinding
        cbCooking.isChecked = BookingDetails.Cooking
        cbGardenMaintenance.isChecked = BookingDetails.GardenMaintenance
    }
}