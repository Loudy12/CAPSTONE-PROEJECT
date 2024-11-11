package com.example.seniorcapstoneappfe

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.example.yourappname.R

class TopNavigationBar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.top_navigation_bar)

        // Sign Out button
        val signOutButton: Button = findViewById(R.id.btn_sign_out)
        signOutButton.setOnClickListener {
            // Call the sign-out method
            signOut()
        }

        // Notification button
        val notificationButton: ImageButton = findViewById(R.id.btn_notification)
        notificationButton.setOnClickListener {
            // Handle notification tap
            println("Notification tapped")
        }
    }

    private fun signOut() {
        // Code to handle user sign-out
        // For instance, clear session data and navigate to login screen
        println("User signed out")
        // Intent to go back to the login screen or similar
    }
}
