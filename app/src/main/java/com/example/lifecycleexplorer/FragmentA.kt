package com.example.lifecycleexplorer


import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.lifecycleexplorer.LifecycleLogger.TAG
import com.example.lifecycleexplorer.databinding.FragmentABinding

class FragmentA : Fragment() {
    lateinit var _binding : FragmentABinding


    override fun onAttach(context: Context) {
        super.onAttach(context)
        LifecycleLogger.log(TAG, "FragmentA onAttach")
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        LifecycleLogger.log(TAG, "FragmentA onCreate")
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        LifecycleLogger.log(TAG, "FragmentA onCreateView")
        _binding = FragmentABinding.inflate(inflater, container, false)
        return _binding.root


    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        LifecycleLogger.log(TAG, "FragmentA onViewCreated")
    }


    override fun onStart() {
        super.onStart()
        LifecycleLogger.log(TAG, "FragmentA onStart")
    }


    override fun onResume() {
        super.onResume()
        LifecycleLogger.log(TAG, "FragmentA onResume")
    }


    override fun onPause() {
        super.onPause()
        LifecycleLogger.log(TAG, "FragmentA onPause")
    }


    override fun onStop() {
        super.onStop()
        LifecycleLogger.log(TAG, "FragmentA onStop")
    }


    override fun onDestroyView() {
        super.onDestroyView()
        LifecycleLogger.log(TAG, "FragmentA onDestroyView")
    }


    override fun onDestroy() {
        super.onDestroy()
        LifecycleLogger.log(TAG, "FragmentA onDestroy")
    }


    override fun onDetach() {
        super.onDetach()
        LifecycleLogger.log(TAG, "FragmentA onDetach")
    }


}

