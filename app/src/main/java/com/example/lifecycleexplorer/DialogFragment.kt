package com.example.lifecycleexplorer

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.example.lifecycleexplorer.LifecycleLogger.TAG

class DialogFragment : DialogFragment() {

    override fun onAttach(context: Context) {
        super.onAttach(context)
        LifecycleLogger.log(TAG, "DialogFragment onAttach")
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        LifecycleLogger.log(TAG, "DialogFragment onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        LifecycleLogger.log(TAG, "DialogFragment onCreateView")
        return inflater.inflate(R.layout.dialog_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        LifecycleLogger.log(TAG, "DialogFragment onViewCreated")
    }

    override fun onStart() {
        super.onStart()
        LifecycleLogger.log(TAG, "DialogFragment onStart")
    }

    override fun onResume() {
        super.onResume()
        LifecycleLogger.log(TAG, "DialogFragment onResume")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        LifecycleLogger.log(TAG, "DialogFragment onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        LifecycleLogger.log(TAG, "DialogFragment onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        LifecycleLogger.log(TAG, "DialogFragment onDetach")
    }
}
