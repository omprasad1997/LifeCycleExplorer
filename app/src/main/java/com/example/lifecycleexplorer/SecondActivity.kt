package com.example.lifecycleexplorer

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.lifecycleexplorer.LifecycleLogger.TAG
import com.example.lifecycleexplorer.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    lateinit var _binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(_binding.root)
        LifecycleLogger.log(TAG, "SecondActivity onCreate")

        _binding.btn.setOnClickListener {
            finish()
        }
    }

    override fun onStart() {
        super.onStart()
        LifecycleLogger.log(TAG, "SecondActivity onStart")
    }

    override fun onResume() {
        super.onResume()
        LifecycleLogger.log(TAG, "SecondActivity onResume")
    }

    override fun onPause() {
        super.onPause()
        LifecycleLogger.log(TAG, "SecondActivity onPause")
    }

    override fun onStop() {
        super.onStop()
        LifecycleLogger.log(TAG, "SecondActivity onStop")
    }

    override fun onRestart() {
        super.onRestart()
        LifecycleLogger.log(TAG, "SecondActivity onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        LifecycleLogger.log(TAG, "SecondActivity onDestroy")
    }
}