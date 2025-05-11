package com.example.sportapp.training

import com.example.sportapp.util.NavigationUtils
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.sportapp.R

class PlanificarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_planificar)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.planificacion)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Para modificar el texto del top_bar
        val tituloTopBar = findViewById<TextView>(R.id.topBarTitle)
        tituloTopBar.text = getString(R.string.title_plan)



        // Resaltamos el icono de entrenamiento
        NavigationUtils.highlightCurrentIcon(this, R.id.iconTraining)

        // Icono de ir a Menú
       NavigationUtils.setMenu(this)

        // Icono de ir a Home (opcional, solo si querés refrescar)
       NavigationUtils.setHome(this)

        // Icono de ir a perfil
        NavigationUtils.setProfile(this)

        //Icono de ir a notificaciones
        NavigationUtils.setNotificationClick(this)

        //Icono de ir a ayuda
        NavigationUtils.setHelpClick(this)

        // Icono de ir a Entrenamiento
        NavigationUtils.setTraining(this)



        // Boton de guardar para navegar a TrainingActivity al hacer clic en Guardar
        findViewById<Button>(R.id.btnGuardar).setOnClickListener {
            val intent = Intent(this, TrainingActivity::class.java)
            startActivity(intent)
            finish()
        }

        // Boton cancelar para navegar a TrainingActivity al hacer clic en Cancelar
        findViewById<Button>(R.id.btnCancelar).setOnClickListener {
            val intent = Intent(this, TrainingActivity::class.java)
            startActivity(intent)
            finish()
        }


    }
}