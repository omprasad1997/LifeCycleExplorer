package com.example.lifecycleexplorer

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.lifecycleexplorer.LifecycleLogger.TAG
import com.example.lifecycleexplorer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var _binding : ActivityMainBinding
    val binding get() = _binding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(_binding.root)
        LifecycleLogger.log(TAG, "MainActivity onCreate")

        binding.btn.setOnClickListener {
            val dialogFragment = DialogFragment()
            dialogFragment.show(supportFragmentManager, "MY_DIALOG")
        }
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