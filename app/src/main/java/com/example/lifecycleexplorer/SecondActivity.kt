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
        //LifecycleLogger.log(TAG, "SecondActivity onCreate")

        _binding.btn.setOnClickListener {
            finish()
        }
    }

}