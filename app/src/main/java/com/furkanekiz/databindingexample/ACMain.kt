package com.furkanekiz.databindingexample

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.furkanekiz.databindingexample.databinding.AcMainBinding

class ACMain : AppCompatActivity() {

    private lateinit var binding: AcMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.ac_main)

        binding.controlButton.setOnClickListener {
            startOrStopProgressBar()
        }
    }

    @SuppressLint("SetTextI18n")
    private fun startOrStopProgressBar() {
        with(binding) {

            if (progressBar.visibility == View.INVISIBLE) {
                progressBar.visibility = View.VISIBLE
                controlButton.text = "Stop"
            } else {
                progressBar.visibility = View.INVISIBLE
                controlButton.text = "Start"
            }
        }

    }
}