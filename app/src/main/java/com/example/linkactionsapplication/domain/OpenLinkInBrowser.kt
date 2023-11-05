package com.example.linkactionsapplication.domain

import android.content.Context
import android.content.Intent
import android.net.Uri

class OpenLinkInBrowser {
    fun execute(context: Context, link: String) {
        var url = link
        if (!url.startsWith("http://") && !url.startsWith("https://")) {
            url = "https://$url"
        }
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        context.startActivity(intent)
    }
}
