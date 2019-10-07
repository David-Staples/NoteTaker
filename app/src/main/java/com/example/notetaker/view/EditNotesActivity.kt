package com.example.notetaker.view

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.notetaker.R

class EditNotesActivity : AppCompatActivity() {

    val sharedPreferences: SharedPreferences by lazy {
        getSharedPreferences(applicationContext.packageName, Context.MODE_PRIVATE)
    }
    lateinit var textColor: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.notes_edittextview_layout)

        textColor = sharedPreferences.getString(COLOR_KEY, DEFAULT_COLOR)  ?: DEFAULT_COLOR
    }

}