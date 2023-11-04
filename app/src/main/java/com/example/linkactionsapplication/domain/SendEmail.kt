package com.example.linkactionsapplication.domain

import android.content.Context
import android.content.Intent
import android.net.Uri

class SendEmail {
    fun execute(context: Context, email: String) {
        val intent = Intent(Intent.ACTION_SENDTO)
        intent.data = Uri.parse("mailto:$email")
        context.startActivity(intent)
    }
}