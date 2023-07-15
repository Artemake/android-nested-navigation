package com.learningwithmanos.nested_navigation_example.nested_fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.learningwithmanos.nested_navigation_example.databinding.FragmentNested2Binding

class NestedFragment2: Fragment() {

    private lateinit var binding: FragmentNested2Binding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNested2Binding.inflate(inflater, container, false)

        binding.apply {
            goNext2.setOnClickListener {
                findNavController().navigate(
                    NestedFragment2Directions.actionFromNestedFragment2ToNestedFragment3()
                )
            }
        }

        return binding.root
    }
}