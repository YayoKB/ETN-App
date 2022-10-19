package com.varsitycollege.team10mobileapp

import java.util.ArrayList

class BookingDetails {
    companion object {
        var firstName: String = ""
        var lastName: String = ""
        var phoneNumber: String = ""
        var emailAddress: String = ""
        var streetAddress: String = ""
        var suburb: String = ""
        var city: String = ""
        var zipCode: String = ""

        var FirstAid: Boolean = false
        var Sewing: Boolean = false
        var Landscaping: Boolean = false
        var LifeSkills: Boolean = false
        var ChildMinding: Boolean = false
        var Cooking: Boolean = false
        var GardenMaintenance: Boolean = false

        // Used for booking_confirmed.kt
        lateinit var courses: ArrayList<Int>

        var subtotal: Double = 0.0
        var discountPrice: Double = 0.0
        var vatPrice: Double = 0.0
        var totalAmount: Double = 0.0
    }
}