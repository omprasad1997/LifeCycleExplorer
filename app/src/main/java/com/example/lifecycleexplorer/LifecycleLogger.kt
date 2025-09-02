package com.example.lifecycleexplorer

import android.util.Log

object LifecycleLogger {
    const val  TAG = "LifecycleCheck"

    fun log(tag: String, message: String) {
        Log.d(tag, "Lifecycle: $message")
    }
}
