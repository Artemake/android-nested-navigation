package com.learningwithmanos.nested_navigation_example

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.learningwithmanos.nested_navigation_example.databinding.FragmentInitialBinding

class InitialFragment: Fragment() {

    private lateinit var binding: FragmentInitialBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentInitialBinding.inflate(inflater, container, false)

        binding.navButton.setOnClickListener {
            findNavController().navigate(InitialFragmentDirections.actionFromInitialFragmentToNestedNavHostHolderFragment())
        }

        return binding.root
    }

}