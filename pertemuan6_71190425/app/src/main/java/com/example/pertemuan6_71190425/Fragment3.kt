package com.example.pertemuan6_71190425

import android.content.Intent
import android.os.Bundle
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class Fragment3: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v3 = inflater.inflate(R.layout.fragment3, container, false)
        val tombol3 = v3.findViewById<Button>(R.id.tombol3)

        tombol3.setOnClickListener {
            val i = Intent(context, MainActivity::class.java);
            getActivity()?.startActivity(i)
        }
        return v3
    }
}