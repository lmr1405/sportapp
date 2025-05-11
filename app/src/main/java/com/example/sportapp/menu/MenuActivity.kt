package com.example.sportapp.menu

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.sportapp.start.MainActivity
import com.example.sportapp.R
import com.example.sportapp.util.NavigationUtils

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.menu)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Cambiar título del top bar
        findViewById<TextView>(R.id.topBarTitle).text = getString(R.string.title_menu)

        // Resaltar ícono actual
        NavigationUtils.highlightCurrentIcon(this, R.id.iconMenu)

        /*
         * Funciones para la navegación entre pantallas
         * Estan decalaradas en com.example.sportapp.util.NavigationUtils
        */
        //Ir a premios
        NavigationUtils.setTrophy(this)

        // Ir a Entrenamiento
        NavigationUtils.setTraining(this)

        // Ir a Menú
        NavigationUtils.setMenu(this)

        // Ir a home
        NavigationUtils.setHome(this)

        // Ir a perfil
        NavigationUtils.setProfile(this)

        //Ir a notificaciones
        NavigationUtils.setNotificationClick(this)

        //Ir a ayuda
        NavigationUtils.setHelpClick(this)


        /*
         * Botones
         */
        // Botón "Centro de asistencia"
        val btnCentroAsistencia = findViewById<Button>(R.id.btnCentroAsistencia)
        btnCentroAsistencia.setOnClickListener {
            val intent = Intent(this, HelpActivity::class.java)
            startActivity(intent)
        }

        // Botón "Acerca de"
        val acercaDeBtn = findViewById<Button>(R.id.btnAcercaDe)
        acercaDeBtn.setOnClickListener {
            val intent = Intent(this, AboutActivity::class.java)
            startActivity(intent)
        }

        // Botón "cerrar sesión"
        val cerrarSesionBtn = findViewById<Button>(R.id.btnCerrarSesion)
        cerrarSesionBtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)
            finish()
        }


    }
}
