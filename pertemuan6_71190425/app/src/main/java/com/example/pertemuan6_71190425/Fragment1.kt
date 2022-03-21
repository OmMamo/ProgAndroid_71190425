package com.example.pertemuan6_71190425

import android.content.Intent
import android.os.Bundle
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentContainer
import java.util.zip.Inflater

class Fragment1 : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v1 = inflater.inflate(R.layout.fragment1, container, false)
        val tombol1 = v1.findViewById<Button>(R.id.tombol1)

        tombol1.setOnClickListener {
            val i = Intent(context, SecondActivity::class.java);
            getActivity()?.startActivity(i)
        }
        return v1
    }

}