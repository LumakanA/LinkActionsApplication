package com.example.linkactionsapplication.domain

import android.content.Context
import android.content.Intent
import android.net.Uri

class OpenMap {
    fun execute(context: Context, latitude: Double, longitude: Double) {
        val gmmIntentUri = Uri.parse("geo:$latitude,$longitude")
        val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
        mapIntent.setPackage("com.google.android.apps.maps")
        context.startActivity(mapIntent)
    }
}