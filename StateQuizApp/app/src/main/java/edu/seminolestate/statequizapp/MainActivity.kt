package edu.seminolestate.statequizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import edu.seminolestate.statequizapp.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

    }
}