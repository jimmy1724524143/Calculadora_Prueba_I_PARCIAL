package com.example.calculadora_prueba_i_parcial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView

class MainActivity() : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    lateinit var n1: EditText
    lateinit var n2: EditText
    lateinit var btn_calcular: Button
    lateinit var txt_resultado: TextView
    val spinner = findViewById<Spinner>(R.id.spin)
    val lista = listOf("Suma", "Resta", "Multiplicacion", "Division")





        val adaptador = ArrayAdapter(this, android.R.layout.simple_spinner_item, lista)
        spinner.adapter = adaptador

        n1 = findViewById(R.id.n1)
        n2 = findViewById(R.id.n2)
        btn_calcular = findViewById(R.id.btn_calcular)
        txt_resultado = findViewById(R.id.txt_resultado)


        btn_calcular.setOnClickListener(View.OnClickListener {


            when (spinner.selectedItem.toString()) {
                "Suma" -> txt_resultado.text =
                    "Resultado: ${n1.text.toString().toInt() + n2.text.toString().toInt()}"

                "Resta" -> txt_resultado.text =
                    "Resultado: ${n1.text.toString().toInt() - n2.text.toString().toInt()}"

                "Multiplicacion" -> txt_resultado.text =
                    "Resultado: ${n1.text.toString().toInt() * n2.text.toString().toInt()}"

                "Division" -> txt_resultado.text =



                    "Resultado: ${ (n1.text.toString().toDouble() / n2.text.toString().toDouble())}"
            }
        })

    }


}


