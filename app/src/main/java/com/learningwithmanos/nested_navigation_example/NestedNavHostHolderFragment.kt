package com.learningwithmanos.nested_navigation_example

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.setFragmentResultListener
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
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

    override fun onResume() {
        super.onResume()
        binding.nestedNavHost.getFragment<NavHostFragment>().setFragmentResultListener("key") { _, _ ->
            findNavController().popBackStack()
        }

        binding.nestedNavHost.getFragment<NavHostFragment>().navController.apply {
            addOnDestinationChangedListener { controller, destination, arguments ->
                when (destination.id) {
                    R.id.nestedFragment1 -> {
                        binding.progressBar1.progress = 100
                        binding.progressBar2.progress = 0
                        binding.progressBar3.progress = 0
                    }

                    R.id.nestedFragment2 -> {
                        binding.progressBar1.progress = 100
                        binding.progressBar2.progress = 100
                        binding.progressBar3.progress = 0
                    }

                    R.id.nestedFragment3 -> {
                        binding.progressBar1.progress = 100
                        binding.progressBar2.progress = 100
                        binding.progressBar3.progress = 100
                    }
                }
            }
        }

    }

}