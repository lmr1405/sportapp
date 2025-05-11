package com.example.sportapp.tools

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.sportapp.R
import com.example.sportapp.util.NavigationUtils

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profile)

        // Ajuste de insets para evitar solapamiento con la barra inferior
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.profile)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Cambia el título del top bar
        findViewById<TextView>(R.id.topBarTitle).text = getString(R.string.title_profile)


        /*Funciones para la navegación entre pantallas
           Estan decalaradas en com.example.sportapp.util.NavigationUtils*/

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

    }
}
