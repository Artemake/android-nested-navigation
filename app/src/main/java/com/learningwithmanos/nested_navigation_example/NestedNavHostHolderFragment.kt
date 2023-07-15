package com.learningwithmanos.nested_navigation_example

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.fragment.NavHostFragment
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

        binding.nestedNavHost.getFragment<NavHostFragment>().navController
            .addOnDestinationChangedListener(
                object : NavController.OnDestinationChangedListener {
                    override fun onDestinationChanged(
                        controller: NavController,
                        destination: NavDestination,
                        arguments: Bundle?
                    ) {
                        when(destination.id) {
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
            )
    }
}