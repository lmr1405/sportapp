package com.example.sportapp.training

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.sportapp.R
import com.example.sportapp.util.NavigationUtils

class HistTrainning : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_hist_trainning)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.histScreen)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Para modificar el texto del top_bar
        val tituloTopBar = findViewById<TextView>(R.id.topBarTitle)
        tituloTopBar.text = getString(R.string.text_history)



        //Para poner visible la parte de visualización al hacer click en el ojo
        val visualizarIcon = findViewById<ImageView>(R.id.idVisualizarEntrenamiento)
        val previewBlock = findViewById<LinearLayout>(R.id.previewBlock)
        val previewTitle = findViewById<TextView>(R.id.previewTitle)

        visualizarIcon.setOnClickListener {
            if (previewBlock.visibility == View.GONE) {
                previewBlock.visibility = View.VISIBLE
                previewTitle.visibility = View.VISIBLE
            } else {
                previewBlock.visibility = View.GONE
                previewTitle.visibility = View.GONE
            }
        }



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



    }
}