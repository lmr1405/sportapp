package com.example.sportapp.home

import com.example.sportapp.util.NavigationUtils
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.sportapp.R


class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)

        // Para modificar el texto del top_bar
        val tituloTopBar = findViewById<TextView>(R.id.topBarTitle)
        tituloTopBar.text = getString(R.string.title_home)

        // Resalta ícono activo
        NavigationUtils.highlightCurrentIcon(this, R.id.iconHome)


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


        // Aplica padding solo al bottomNav para evitar que lo tape la barra del sistema
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.bottomNav)) { view, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            view.setPadding(
                view.paddingLeft,
                view.paddingTop,
                view.paddingRight,
                systemBars.bottom
            )
            insets
        }
    }
}

