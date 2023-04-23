package com.example.lineargames

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var listView: ListView
    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView = findViewById(R.id.list_view)
        textView = findViewById(R.id.text_view)

        val games = listOf(
            "Game 1",
            "Game 2",
            "Game 3",
            "Game 4",
            "Game 5",
            "Game 6",
            "Game 7",
            "Game 8",
            "Game 9",
            "Game 10"
        )

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, games)
        listView.adapter = adapter

        listView.setOnItemClickListener { parent, view, position, id ->
            val selectedGame = games[position]
            textView.text = "Selected game: $selectedGame"
        }
    }
}
