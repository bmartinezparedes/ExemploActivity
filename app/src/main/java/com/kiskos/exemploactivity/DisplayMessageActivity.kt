package com.kiskos.exemploactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DisplayMessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        // Obtenga el Intent que inició esta actividad y extraiga la cadena
        val message = intent.getStringExtra(EXTRA_MESSAGE)

        // Capture el TextView del diseño y establezca la cadena como su texto
        val textView = findViewById<TextView>(R.id.textView).apply {
            text = message
        }
    }
}