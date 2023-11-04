package com.example.linkactionsapplication.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.linkactionsapplication.databinding.ActivityMainBinding
import com.example.linkactionsapplication.domain.MakePhoneCall
import com.example.linkactionsapplication.domain.OpenLinkInBrowser
import com.example.linkactionsapplication.domain.OpenMap
import com.example.linkactionsapplication.domain.SendEmail

class MainActivity : AppCompatActivity() {
    private val openLinkInBrowser = OpenLinkInBrowser()
    private val sendEmail = SendEmail()
    private val makePhoneCall = MakePhoneCall()
    private val openMap = OpenMap()
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.openLinkButton.setOnClickListener {
            val link = binding.linkEditText.text.toString()
            if (link.isNotEmpty()) {
                openLinkInBrowser.execute(this, link)
            }
        }

        binding.sendEmailButton.setOnClickListener {
            val email = binding.emailEditText.text.toString()
            if (email.isNotEmpty()) {
                sendEmail.execute(this, email)
            }
        }

        binding.makeCallButton.setOnClickListener {
            val phoneNumber = binding.phoneEditText.text.toString()
            if (phoneNumber.isNotEmpty()) {
                makePhoneCall.execute(this, phoneNumber)
            }
        }

        binding.openMapButton.setOnClickListener {
            val latitude = binding.latitudeEditText.text.toString()
            val longitude = binding.longitudeEditText.text.toString()
            if (latitude.isNotEmpty() && longitude.isNotEmpty()) {
                openMap.execute(this, latitude.toDouble(), longitude.toDouble())
            }
        }
    }
}