package com.learningwithmanos.nested_navigation_example

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.learningwithmanos.nested_navigation_example.databinding.FragmentNestedNavHostHolderBinding

class NestedNavHostHolderFragment: Fragment() {

    private lateinit var binding: FragmentNestedNavHostHolderBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNestedNavHostHolderBinding.inflate(inflater, container, false)

        return binding.root
    }
}