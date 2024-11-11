package com.example.seniorcapstoneappfe

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide // If you're using Glide for loading profile images

class ProfileFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Profile information
        val profileName = view.findViewById<TextView>(R.id.profile_name)
        val profileEmail = view.findViewById<TextView>(R.id.profile_email)
        val profileImage = view.findViewById<ImageView>(R.id.profile_image)

        // Example user data (replace with actual user data if available)
        profileName.text = "John Doe"
        profileEmail.text = "john.doe@example.com"

        // Load profile image using Glide or a similar library
        // Glide.with(this).load("https://example.com/path/to/image.jpg").into(profileImage)

        // Edit Profile Button Action
        view.findViewById<Button>(R.id.edit_profile_button).setOnClickListener {
            // Navigate to an EditProfileActivity (create this activity if necessary)
            // startActivity(Intent(requireContext(), EditProfileActivity::class.java))
        }

        // Log Out Button Action
        view.findViewById<Button>(R.id.logout_button).setOnClickListener {
            // Implement logout functionality, e.g., clearing user session and navigating to login screen
            // clearUserSession()
            // startActivity(Intent(requireContext(), LoginActivity::class.java))
            // requireActivity().finish()
        }
    }

    // Example function for clearing user session (implement according to your needs)
    private fun clearUserSession() {
        // Clear shared preferences or any session-related data
    }
}
