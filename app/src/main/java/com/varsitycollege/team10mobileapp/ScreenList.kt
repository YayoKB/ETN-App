package com.varsitycollege.team10mobileapp

import android.app.Activity
import android.widget.FrameLayout
import android.widget.ImageButton
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager

class ScreenList {
    companion object {
        lateinit var display: FrameLayout
        lateinit var fragmentManager: FragmentManager

        lateinit var main_screen: Activity

        lateinit var home_screen: Fragment
        lateinit var learnerships_screen: Fragment
        lateinit var shortCourses_screen: Fragment
        lateinit var bookCourses_screen: Fragment
        lateinit var contact_screen: Fragment

        lateinit var course_firstAid_screen: Fragment
        lateinit var course_sewing_screen: Fragment
        lateinit var course_landscaping_screen: Fragment
        lateinit var course_lifeSkills_screen: Fragment
        lateinit var course_childMinding_screen: Fragment
        lateinit var course_cooking_screen: Fragment
        lateinit var course_gardenMaintenance_screen: Fragment

        lateinit var booking_confirmed_screen: Fragment

        lateinit var booking_consultant_screen: Fragment

        lateinit var btnHome: ImageButton
        lateinit var btnLearnerships: ImageButton
        lateinit var btnShortCourses: ImageButton
        lateinit var btnBookCourses: ImageButton
        lateinit var btnContact: ImageButton

        fun navigate(fragment: Fragment)
        {
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(display.id, fragment)
            fragmentTransaction.commit()
        }
    }
}