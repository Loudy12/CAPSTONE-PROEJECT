package com.example.seniorcapstoneappfe

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ResourcesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_resources, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Initialize the RecyclerView
        val recyclerView = view.findViewById<RecyclerView>(R.id.resources_recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        // Example data for resources
        val resourceList = listOf(
            "Resource 1: User Guide",
            "Resource 2: Campus Map",
            "Resource 3: Contact Support",
            "Resource 4: FAQ",
            "Resource 5: Tutorials"
        )

        // Set up the RecyclerView adapter
        recyclerView.adapter = ResourcesAdapter(resourceList)
    }
}
