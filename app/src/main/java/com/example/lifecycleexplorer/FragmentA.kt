package com.example.lifecycleexplorer

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.lifecycleexplorer.databinding.FragmentABinding


class FragmentA : Fragment() {
    lateinit var _binding : FragmentABinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentABinding.inflate(inflater, container, false)
        return _binding.root

    }


}