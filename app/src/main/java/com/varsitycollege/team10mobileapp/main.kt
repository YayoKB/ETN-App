package com.varsitycollege.team10mobileapp

import android.content.Context
import android.os.Bundle
import android.util.DisplayMetrics
import android.widget.Button
import android.widget.FrameLayout
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class main : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ScreenList.main_screen = this

        ScreenList.home_screen = home()
        ScreenList.learnerships_screen = learnerships()
        ScreenList.shortCourses_screen = short_courses()
        ScreenList.bookCourses_screen = book_courses()
        ScreenList.contact_screen = contact()

        ScreenList.course_firstAid_screen = course_firstAid()
        ScreenList.course_sewing_screen = course_sewing()
        ScreenList.course_landscaping_screen = course_landscaping()
        ScreenList.course_lifeSkills_screen = course_lifeSkills()
        ScreenList.course_childMinding_screen = course_childMinding()
        ScreenList.course_cooking_screen = course_cooking()
        ScreenList.course_gardenMaintenance_screen = course_gardenMaintenance()

        ScreenList.booking_confirmed_screen = booking_confirmed()

        ScreenList.booking_consultant_screen = booking_consultant()

        // initialize navigation bar
        ScreenList.btnHome = findViewById<ImageButton>(R.id.btnHome)
        ScreenList.btnLearnerships = findViewById<ImageButton>(R.id.btnLearnerships)
        ScreenList.btnShortCourses = findViewById<ImageButton>(R.id.btnShortCourses)
        ScreenList.btnBookCourses = findViewById<ImageButton>(R.id.btnBookCourses)
        ScreenList.btnContact = findViewById<ImageButton>(R.id.btnContact)

        ScreenList.btnHome.setOnClickListener { btnHome_OnClick() }
        ScreenList.btnLearnerships.setOnClickListener { btnLearnerships_OnClick() }
        ScreenList.btnShortCourses.setOnClickListener { btnShortCourses_OnClick() }
        ScreenList.btnBookCourses.setOnClickListener { btnBookCourses_OnClick() }
        ScreenList.btnContact.setOnClickListener { btnContact_OnClick() }

        ScreenList.btnHome.setImageDrawable(resources.getDrawable(R.drawable.ic_home))

        ScreenList.display = findViewById<FrameLayout>(R.id.flDisplay)
        ScreenList.fragmentManager = supportFragmentManager

        ScreenList.navigate(ScreenList.home_screen)
    }

    private fun btnHome_OnClick()
    {
        // update navigation bar
        changeToHome(this)
    }

    private fun btnLearnerships_OnClick()
    {
        // update navigation bar
        changeToLearnerships(this)
    }

    private fun btnShortCourses_OnClick()
    {
        // update navigation bar
        changeToShortCourses(this)
    }

    private fun btnBookCourses_OnClick()
    {
        // update navigation bar
        changeToBookings(this)
    }

    private fun btnContact_OnClick()
    {
        // update navigation bar
        changeToContact(this)
    }
}

fun changeToHome(c: Context) {
    ScreenList.btnHome.setImageDrawable(c.resources.getDrawable(R.drawable.ic_home_filled))
    ScreenList.btnLearnerships.setImageDrawable(c.resources.getDrawable(R.drawable.ic_learnerships))
    ScreenList.btnShortCourses.setImageDrawable(c.resources.getDrawable(R.drawable.ic_shortcourses))
    ScreenList.btnBookCourses.setImageDrawable(c.resources.getDrawable(R.drawable.ic_booking))
    ScreenList.btnContact.setImageDrawable(c.resources.getDrawable(R.drawable.ic_contact))

    ScreenList.navigate(ScreenList.home_screen)
}

fun changeToLearnerships(c: Context) {
    ScreenList.btnHome.setImageDrawable(c.resources.getDrawable(R.drawable.ic_home))
    ScreenList.btnLearnerships.setImageDrawable(c.resources.getDrawable(R.drawable.ic_learnerships_filled))
    ScreenList.btnShortCourses.setImageDrawable(c.resources.getDrawable(R.drawable.ic_shortcourses))
    ScreenList.btnBookCourses.setImageDrawable(c.resources.getDrawable(R.drawable.ic_booking))
    ScreenList.btnContact.setImageDrawable(c.resources.getDrawable(R.drawable.ic_contact))

    ScreenList.navigate(ScreenList.learnerships_screen)
}

fun changeToShortCourses(c: Context) {
    ScreenList.btnHome.setImageDrawable(c.resources.getDrawable(R.drawable.ic_home))
    ScreenList.btnLearnerships.setImageDrawable(c.resources.getDrawable(R.drawable.ic_learnerships))
    ScreenList.btnShortCourses.setImageDrawable(c.resources.getDrawable(R.drawable.ic_shortcourses_filled))
    ScreenList.btnBookCourses.setImageDrawable(c.resources.getDrawable(R.drawable.ic_booking))
    ScreenList.btnContact.setImageDrawable(c.resources.getDrawable(R.drawable.ic_contact))

    ScreenList.navigate(ScreenList.shortCourses_screen)
}

fun changeToBookings(c: Context) {
    ScreenList.btnHome.setImageDrawable(c.resources.getDrawable(R.drawable.ic_home))
    ScreenList.btnLearnerships.setImageDrawable(c.resources.getDrawable(R.drawable.ic_learnerships))
    ScreenList.btnShortCourses.setImageDrawable(c.resources.getDrawable(R.drawable.ic_shortcourses))
    ScreenList.btnBookCourses.setImageDrawable(c.resources.getDrawable(R.drawable.ic_booking_filled))
    ScreenList.btnContact.setImageDrawable(c.resources.getDrawable(R.drawable.ic_contact))

    ScreenList.navigate(ScreenList.bookCourses_screen)
}

fun changeToContact(c: Context) {
    ScreenList.btnHome.setImageDrawable(c.resources.getDrawable(R.drawable.ic_home))
    ScreenList.btnLearnerships.setImageDrawable(c.resources.getDrawable(R.drawable.ic_learnerships))
    ScreenList.btnShortCourses.setImageDrawable(c.resources.getDrawable(R.drawable.ic_shortcourses))
    ScreenList.btnBookCourses.setImageDrawable(c.resources.getDrawable(R.drawable.ic_booking))
    ScreenList.btnContact.setImageDrawable(c.resources.getDrawable(R.drawable.ic_contact_filled))

    ScreenList.navigate(ScreenList.contact_screen)
}
