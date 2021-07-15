package com.italoruan.frasesdodia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var texto: TextView
    val frases = arrayOf(
        "Levanta, sacode a poeira, dá a volta por cima.",
        " Dê mais atenção ao que você tem de bom na sua vida",
        "Nem todos os dias são bons, mas há algo bom em cada dia.",
        "A vida das pessoas não acaba quando elas morrem, mas sim quando perdem a fé.",
        "Tudo o que um sonho precisa para ser realizado é alguém que acredite que ele possa ser realizado.",
        "Não espere por uma crise para descobrir o que é importante em sua vida.",
        "Perder tempo em aprender coisas que não interessam priva-nos de descobrir coisas interessantes.","Pessimismo leva à fraqueza, otimismo ao poder.",
        "O que pode ser dito, pode jamais ser escrito",
        "Como são sábios aqueles que se entregam às loucuras do amor!"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        texto = findViewById<TextView>(R.id.textoFrase)

    }
    fun gerarFrase(view:View){
        val totalIntensArray = frases.size
        val random = Random()
        val numeroAleatorio =Random().nextInt(totalIntensArray)

        texto.setText(frases[numeroAleatorio])

    }
}