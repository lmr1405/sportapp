package com.example.sportapp.training

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.sportapp.R
import com.example.sportapp.util.NavigationUtils

class StartTraining : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_start_trainning)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.startTrainScreen)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Para modificar el texto del top_bar
        val tituloTopBar = findViewById<TextView>(R.id.topBarTitle)
        tituloTopBar.text = getString(R.string.title_training)



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