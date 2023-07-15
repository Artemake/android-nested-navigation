package com.learningwithmanos.nested_navigation_example.nested_fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.learningwithmanos.nested_navigation_example.databinding.FragmentNested3Binding

class NestedFragment3: Fragment() {

    private lateinit var binding: FragmentNested3Binding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNested3Binding.inflate(inflater, container, false)

        return binding.root
    }
}