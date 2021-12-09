package com.kiskos.exemploactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
//variable publica donde se guardara el dato del Intent
const val EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    /** Llamado cuando el usuario toca el botón Enviar */
    fun sendMessage(view: View) {
        // Haz algo en respuesta al botón
        //Texto editable para despues enviar al la otra activity para mostralo
        val editText = findViewById<EditText>(R.id.editTextTextMultiLine)
        // Dentro de una variable llamada message meto el texto recogido en el editable
        val message = editText.text.toString()
        //Creo un intent que llamara a la clase DisplayMessageActivity
        val intent = Intent(this, DisplayMessageActivity::class.java).apply {
            //Transporto el dato message que la guardo en la variable definida antes
            putExtra(EXTRA_MESSAGE, message)
        }
        //Inicio el intent
        startActivity(intent)
    }
}