package com.dev_tarkeshwar_ujn.runtracker.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dev_tarkeshwar_ujn.runtracker.R
import com.dev_tarkeshwar_ujn.runtracker.db.RunDao
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var runDAO: RunDao

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
}