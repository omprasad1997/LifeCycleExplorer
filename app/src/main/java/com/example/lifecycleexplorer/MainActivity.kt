package com.example.lifecycleexplorer

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.lifecycleexplorer.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    lateinit var _binding : ActivityMainBinding
    val binding get() = _binding
    private lateinit var tabLayout: TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(_binding.root)

        tabLayout = binding.tabLayout

        // Add tabs
        tabLayout.addTab(tabLayout.newTab().setText("Fragment A"))
        tabLayout.addTab(tabLayout.newTab().setText("Fragment B"))

        addFragment(FragmentA())
//        addFragmentWithBackstack(FragmentA(),"Fragment_A")
        //replaceFragment(FragmentA())
//        replaceFragmentWithBackStack(FragmentA(), "Fragment_A")

        // Handle tab selection
        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                when (tab?.position) {
                    0 -> replaceFragment(FragmentA())
                    1 -> replaceFragment(FragmentB())
                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {}
            override fun onTabReselected(tab: TabLayout.Tab?) {}
        })

    }

    private fun addFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .add(R.id.fragmentContainer, fragment)
            .commit()
    }

    private fun addFragmentWithBackstack(fragment: Fragment, tag: String) {
        supportFragmentManager.beginTransaction()
            .add(R.id.fragmentContainer, fragment,tag)
            .addToBackStack(tag)
            .commit()
    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, fragment)
            .commit()
    }

    private fun replaceFragmentWithBackStack(fragment: Fragment,tag:String) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, fragment,tag)
            .addToBackStack(tag)
            .commit()
    }
}
