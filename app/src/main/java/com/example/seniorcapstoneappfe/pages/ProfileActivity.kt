package com.example.seniorcapstoneappfe.pages

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_profile.*

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        // Set profile image click action
        edit_profile_button.setOnClickListener {
            Toast.makeText(this, "Edit profile tapped", Toast.LENGTH_SHORT).show()
        }

        // Set Spartan ID button click action
        spartan_id_button.setOnClickListener {
            Toast.makeText(this, "Spartan ID tapped", Toast.LENGTH_SHORT).show()
        }

        // Set action buttons
        saved_button.setOnClickListener {
            Toast.makeText(this, "Saved tapped", Toast.LENGTH_SHORT).show()
        }
        clubs_groups_button.setOnClickListener {
            Toast.makeText(this, "Clubs and Groups tapped", Toast.LENGTH_SHORT).show()
        }
    }
}
