package com.example.teste

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var  campo1: EditText
    lateinit var  botao2: Button

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        campo1 = findViewById(R.id.nome)
        botao2 = findViewById(R.id.button2)

        botao2.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {
               Toast.makeText(applicationContext, "Minha mensagem,",Toast.LENGTH_LONG).show()
            }

        } )


    }
}