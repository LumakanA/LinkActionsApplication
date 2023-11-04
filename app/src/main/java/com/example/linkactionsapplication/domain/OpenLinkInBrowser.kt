package com.example.linkactionsapplication.domain

import android.content.Context
import android.content.Intent
import android.net.Uri

class OpenLinkInBrowser {
    fun execute(context: Context, link: String) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(link))
        context.startActivity(intent)
    }
}