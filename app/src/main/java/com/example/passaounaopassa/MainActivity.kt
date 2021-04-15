 package com.example.passaounaopassa

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botaoCalc = calcNotas
        val result = resultado

        botaoCalc.setOnClickListener{
            val nota = Integer.parseInt(nota1.text.toString())
            val not2 = Integer.parseInt(nota2.text.toString())
            val falta = Integer.parseInt(faltas.text.toString())
            val media = (nota + not2)/2

            if(media >= 7 && falta <= 10){
                result.setText("Aluno aprovado por média!" + "\n" + "Sua média: ${media}" +"\n" + "Número de faltas : ${falta}")
            }else{
                result.setText("Aluno reprovado por média!" + "\n" + "Sua média: ${media}" +"\n" + "Número de faltas : ${falta}")
            }
        }
    }
}





