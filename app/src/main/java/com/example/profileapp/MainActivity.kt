package com.example.profileapp

import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val profileImage = findViewById<ImageView>(R.id.profileImage)
        val nameText = findViewById<TextView>(R.id.nameText)
        val descriptionText = findViewById<TextView>(R.id.descriptionText)
        val currentJobText = findViewById<TextView>(R.id.currentJobText)
        val experienceLayout = findViewById<LinearLayout>(R.id.experienceLayout)

        nameText.text = "Hermeson Bastos"
        descriptionText.text = "Desenvolvedor de software com 2 anos de experiência."
        currentJobText.text = "Emprego Atual: Desenvolvedor FullStack na SupliuTech"

        val experiencias = listOf(
            "Desenvolvedor Front-end - Office Contábil",
            "UI Designer/Front-end - Petwalk",
            "Desenvolvedor FullStack - SupliuTech"
        )
        for (experiencia in experiencias) {
            val textView = TextView(this)
            textView.text = experiencia
            textView.textSize = 16f
            experienceLayout.addView(textView)
        }
    }
}