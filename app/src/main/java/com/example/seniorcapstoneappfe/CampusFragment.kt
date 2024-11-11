package com.example.seniorcapstoneappfe

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class CampusFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_campus, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Example of accessing views or setting data programmatically
        val titleTextView = view.findViewById<TextView>(R.id.campus_title)
        titleTextView.text = "Explore Campus"

        // You could load data dynamically here if needed (e.g., from a database or API)
    }
}
