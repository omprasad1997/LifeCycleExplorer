package com.example.lifecycleexplorer

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.lifecycleexplorer.LifecycleLogger.TAG
import com.example.lifecycleexplorer.databinding.FragmentBBinding

class FragmentB : Fragment() {
    lateinit var _binding: FragmentBBinding

    override fun onAttach(context: Context) {
        super.onAttach(context)
        LifecycleLogger.log(TAG, "FragmentB onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        LifecycleLogger.log(TAG, "FragmentB onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        LifecycleLogger.log(TAG, "FragmentB onCreateView")
        _binding = FragmentBBinding.inflate(inflater, container, false)
        return _binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        LifecycleLogger.log(TAG, "FragmentB onViewCreated")
    }

    override fun onStart() {
        super.onStart()
        LifecycleLogger.log(TAG, "FragmentB onStart")
    }

    override fun onResume() {
        super.onResume()
        LifecycleLogger.log(TAG, "FragmentB onResume")
    }

    override fun onPause() {
        super.onPause()
        LifecycleLogger.log(TAG, "FragmentB onPause")
    }

    override fun onStop() {
        super.onStop()
        LifecycleLogger.log(TAG, "FragmentB onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        LifecycleLogger.log(TAG, "FragmentB onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        LifecycleLogger.log(TAG, "FragmentB onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        LifecycleLogger.log(TAG, "FragmentB onDetach")
    }
}