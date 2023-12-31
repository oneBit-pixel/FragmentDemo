package com.android.fragmentdemo.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.android.fragmentdemo.R

class Fragment1 : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println("onCreate==>${savedInstanceState?.isEmpty}")
        savedStateRegistry
    }

    companion object {
        @JvmStatic
        fun newInstance() = Fragment1()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val inflate = layoutInflater.inflate(R.layout.fragment_1, container, false)

        inflate.apply {
            inflate.findViewById<TextView>(R.id.textView).setOnClickListener {
                println("点击了fragment1")
            }
        }

        println("onCreateView")
        return inflate
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val boolean = arguments?.getBoolean("zxy")
        println("onViewCreated==>${boolean}")

    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putBoolean("zxy",true)
        println("onSaveInstanceState")
    }

    override fun onStart() {
        super.onStart()
        println("onStart")

    }

    override fun onResume() {
        super.onResume()
        println("onResume")

    }

    override fun onPause() {
        super.onPause()
        println("onPause")
    }

    override fun onStop() {
        super.onStop()
        println("onStop")
        onSaveInstanceState(Bundle())
    }

    override fun onDestroyView() {
        super.onDestroyView()
        println("onDestroyView")

    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        println("onViewStateRestored==>${savedInstanceState?.isEmpty}")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("onDestroy")
    }


    override fun onHiddenChanged(hidden: Boolean) {
        super.onHiddenChanged(hidden)
        println("hidden==>$hidden")
    }


}