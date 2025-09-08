package com.example.lifecycleexplorer

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.lifecycleexplorer.LifecycleLogger.TAG
import com.example.lifecycleexplorer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var _binding : ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(_binding.root)
        LifecycleLogger.log(TAG, "MainActivity onCreate")

        replaceFragment(FragmentA())

        _binding.btn.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, fragment)
            .commit()
    }

    override fun onStart() {
        super.onStart()
        LifecycleLogger.log(TAG, "MainActivity onStart")
    }

    override fun onResume() {
        super.onResume()
        LifecycleLogger.log(TAG, "MainActivity onResume")
    }

    override fun onPause() {
        super.onPause()
        LifecycleLogger.log(TAG, "MainActivity onPause")
    }

    override fun onStop() {
        super.onStop()
        LifecycleLogger.log(TAG, "MainActivity onStop")
    }

    override fun onRestart() {
        super.onRestart()
        LifecycleLogger.log(TAG, "MainActivity onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        LifecycleLogger.log(TAG, "MainActivity onDestroy")
    }



}