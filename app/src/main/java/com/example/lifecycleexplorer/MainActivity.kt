package com.example.lifecycleexplorer

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
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

        _binding.btn.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }

//    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
//        super.onSaveInstanceState(outState, outPersistentState)
//        LifecycleLogger.log(TAG, "MainActivity onSaveInstanceState")
//
//        outState.putString("key_text", _binding.editText.text.toString())
//    }

//    override fun onRestoreInstanceState(
//        savedInstanceState: Bundle?,
//        persistentState: PersistableBundle?
//    ) {
//        super.onRestoreInstanceState(savedInstanceState, persistentState)
//        LifecycleLogger.log(TAG, "MainActivity onRestoreInstanceState")
//        val text = savedInstanceState?.getString("key_text")
//        _binding.editText.setText(text)
//    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        LifecycleLogger.log(TAG, "MainActivity onConfigurationChanged")
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