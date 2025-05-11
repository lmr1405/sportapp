package com.example.sportapp.tools

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.sportapp.R
import com.example.sportapp.util.NavigationUtils

class NotificationsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_notifications)

        // Ajustar insets
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.notifications)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Cambiar texto del top bar
        findViewById<TextView>(R.id.topBarTitle).text = getString(R.string.title_notifications)

        // Resaltar ícono de notificaciones
        findViewById<ImageView>(R.id.iconNotifications).setColorFilter(
            ContextCompat.getColor(this, R.color.icon_select)
        )


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
