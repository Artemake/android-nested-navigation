package com.learningwithmanos.nested_navigation_example.nested_fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.learningwithmanos.nested_navigation_example.databinding.FragmentNested1Binding

class NestedFragment1: Fragment() {

    private lateinit var binding: FragmentNested1Binding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNested1Binding.inflate(inflater, container, false)

        binding.apply {
            goNext1.setOnClickListener {
                findNavController().navigate(
                    NestedFragment1Directions.actionFromNestedFragment1ToNestedFragment2()
                )
            }
        }

        return binding.root
    }

}