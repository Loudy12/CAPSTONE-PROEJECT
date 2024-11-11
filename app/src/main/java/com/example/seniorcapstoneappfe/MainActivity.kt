package com.example.seniorcapstoneappfe

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import android.widget.TextView
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize the bottom navigation view
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        val sectionTitle = findViewById<TextView>(R.id.section_title)
        val backArrow = findViewById<ImageView>(R.id.back_arrow)

        // Back button behavior
        backArrow.setOnClickListener {
            onBackPressed()
        }

        // Set up the bottom navigation item selection
        bottomNavigationView.setOnNavigationItemSelectedListener { menuItem ->
            val fragment: Fragment
            val title: String

            when (menuItem.itemId) {
                R.id.menu_for_you -> {
                    fragment = ForYouFragment()
                    title = "For You"
                }
                R.id.menu_campus -> {
                    fragment = CampusFragment()
                    title = "Campus"
                }
                R.id.menu_resources -> {
                    fragment = ResourcesFragment()
                    title = "Resources"
                }
                R.id.menu_profile -> {
                    fragment = ProfileFragment()
                    title = "Profile"
                }
                else -> {
                    fragment = ForYouFragment()
                    title = "For You"
                }
            }

            loadFragment(fragment)
            sectionTitle.text = title // Update the top bar title
            true
        }

        // Load the default fragment if the activity is newly created
        if (savedInstanceState == null) {
            bottomNavigationView.selectedItemId = R.id.menu_for_you
        }
    }

    // Function to load fragments with custom animations
    private fun loadFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out) // Animation effects
            .replace(R.id.fragment_container, fragment)
            .commit()
    }
}
