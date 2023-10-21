package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var tvRes: TextView?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvRes=findViewById(R.id.tvRes)
    }
    fun calcular(view : View){
        var boton = view as Button
        var textButton = boton.text.toString()
        var concatenar = tvRes?.text.toString() + textButton
        var mostrar = quitarCerosIzq(concatenar)

        if(textButton == "="){
            var result = 0.0
        }

    }
    fun quitarCerosIzq(str : String):String{
        var i = 0
        while (i < str.length && str[i] == '0') i++
        var sb = StringBuffer(str)
        sb.replace(0, i, "")
        return sb.toString()
    }
}