package com.example.sportapp.start

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.sportapp.R

class RecoveryPassword : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recovery_password)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.password_recovery_layout)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //enlazamos para que el botón de siguiente
        val btnRecuperar = findViewById<Button>(R.id.btnRecuperar)
        btnRecuperar.setOnClickListener {
            val intent = Intent(this, RecoveryPasswordSuccess::class.java)
            startActivity(intent)
        }
    }
}