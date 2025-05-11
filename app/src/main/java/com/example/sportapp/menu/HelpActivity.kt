package com.example.sportapp.menu

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.sportapp.menu.help.FaqActivity
import com.example.sportapp.menu.help.FirstStepActivity
import com.example.sportapp.R
import com.example.sportapp.menu.help.ServicioTecnicoActivity

class HelpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_help)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.help_activities)) { view, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            view.setPadding(
                view.paddingLeft,
                view.paddingTop,
                view.paddingRight,
                systemBars.bottom
            )
            insets
        }

        // Boton de "Servicio técnico"
        val btnServicio = findViewById<Button>(R.id.btnServicioTecnico)
        btnServicio.setOnClickListener {
            val intent = Intent(this, ServicioTecnicoActivity::class.java)
            startActivity(intent)
        }

        // Botón de "Preguntas frecuentes"
        val btnFaq = findViewById<Button>(R.id.btnFaq)
        btnFaq.setOnClickListener {
            val intent = Intent(this, FaqActivity::class.java)
            startActivity(intent)
        }

        // Botón de "Primeros pasos"
        val btnFirstStep = findViewById<Button>(R.id.btnFirstStep)
        btnFirstStep.setOnClickListener {
            val intent = Intent(this, FirstStepActivity::class.java)
            startActivity(intent)
        }
    }
}
