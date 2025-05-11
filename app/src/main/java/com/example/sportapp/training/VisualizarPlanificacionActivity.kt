package com.example.sportapp.training

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.sportapp.R
import com.example.sportapp.util.NavigationUtils

class VisualizarPlanificacionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_visualizar_planificacion)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.planScreen)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Para modificar el texto del top_bar
        val tituloTopBar = findViewById<TextView>(R.id.topBarTitle)
        tituloTopBar.text = getString(R.string.text_misPlanificaciones)


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


        // Botón "Planificar entrenamiento"
        findViewById<Button>(R.id.btnPlan).setOnClickListener {
            val intent = Intent(this, PlanificarActivity::class.java)
            startActivity(intent)
            finish()
        }



    }
}