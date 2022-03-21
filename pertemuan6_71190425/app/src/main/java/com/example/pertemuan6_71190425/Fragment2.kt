package com.example.pertemuan6_71190425

import android.content.Intent
import android.os.Bundle
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class Fragment2: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v2 = inflater.inflate(R.layout.fragment2, container, false)
        val tombol2 = v2.findViewById<Button>(R.id.tombol2)

        tombol2.setOnClickListener {
            val i = Intent(context, ThirdActivity::class.java);
            getActivity()?.startActivity(i)
        }
        return v2
    }
}