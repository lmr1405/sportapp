package com.example.sportapp.util

import android.app.Activity
import android.content.Intent
import android.widget.ImageView
import androidx.core.content.ContextCompat
import com.example.sportapp.menu.HelpActivity
import com.example.sportapp.home.Home
import com.example.sportapp.menu.MenuActivity
import com.example.sportapp.tools.NotificationsActivity
import com.example.sportapp.tools.ProfileActivity
import com.example.sportapp.R
import com.example.sportapp.training.TrainingActivity
import com.example.sportapp.trophy.TrophiesActivity

object NavigationUtils {

    // Función para resaltar los distintos Iconos de la barra inferior
    fun highlightCurrentIcon(activity: Activity, activeIconId: Int) {
        val icons = listOf(
            R.id.iconHome,
            R.id.iconTrophy,
            R.id.iconTraining,
            R.id.iconMenu
        )

        for (id in icons) {
            val icon = activity.findViewById<ImageView>(id)
            val colorResId = if (id == activeIconId)
                R.color.icon_select
            else
                android.R.color.white

            icon?.setColorFilter(
                ContextCompat.getColor(activity, colorResId),
                android.graphics.PorterDuff.Mode.SRC_IN
            )
        }
    }

    // Icono de perfil
    fun setProfile(activity:Activity){
        activity.findViewById<ImageView>(R.id.iconProfile).setOnClickListener {
            activity.startActivity(Intent(activity, ProfileActivity::class.java))
            activity.finish()
        }
    }

    // Icono de ayuda
    fun setHelpClick(activity: Activity) {
        activity.findViewById<ImageView>(R.id.iconHelp).setOnClickListener {
            activity.startActivity(Intent(activity, HelpActivity::class.java))
            activity.finish()
        }
    }

    // Icono de notificaciones
    fun setNotificationClick(activity: Activity){
        activity.findViewById<ImageView>(R.id.iconNotifications).setOnClickListener {
            activity.startActivity(Intent(activity, NotificationsActivity::class.java))
            activity.finish()
        }
    }

    // Icono de home
    fun setHome(activity: Activity){
        activity.findViewById<ImageView>(R.id.iconHome).setOnClickListener {
            activity.startActivity(Intent(activity, Home::class.java))
         activity.finish()
        }
    }

    // Icono de trofeos
    fun setTrophy(activity: Activity){
        activity.findViewById<ImageView>(R.id.iconTrophy).setOnClickListener {
            activity.startActivity(Intent(activity, TrophiesActivity::class.java))
            activity.finish()
        }
    }

    // Icono de entrenamiento
    fun setTraining(activity: Activity){
        activity.findViewById<ImageView>(R.id.iconTraining).setOnClickListener {
            activity.startActivity(Intent(activity, TrainingActivity::class.java))
            activity.finish()
        }
    }
    // Icono de menu
    fun setMenu(activity: Activity){
        activity.findViewById<ImageView>(R.id.iconMenu).setOnClickListener {
            activity.startActivity(Intent(activity, MenuActivity::class.java))
            activity.finish()
        }
    }


}