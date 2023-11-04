package com.example.linkactionsapplication.domain

import android.content.Context
import android.content.Intent
import android.net.Uri

class MakePhoneCall {
    fun execute(context: Context, phoneNumber: String) {
        val intent = Intent(Intent.ACTION_DIAL)
        intent.data = Uri.parse("tel:$phoneNumber")
        context.startActivity(intent)
    }
}