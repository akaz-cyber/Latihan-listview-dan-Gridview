package com.sttbandung.latihanlistandview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.layoutManager = GridLayoutManager(this, 1 )
        recyclerView.setHasFixedSize(true)

        val itemList = listOf(
            ItemList("oregairu", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed laoreet viverra diam, in ultrices turpis bibendum a. Quisque at euismod dui. Vestibulum leo elit, condimentum sit amet diam vel, convallis condimentum nisl. Ut turpis libero, pharetra ac pellentesque eu, viverra vel leo. Nulla facilisi.", "https://i.pinimg.com/564x/fd/ad/2c/fdad2c6920f819dd760c2e1d47cf434b.jpg"),
            ItemList("Yume wo nanda", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed laoreet viverra diam, in ultrices turpis bibendum a. Quisque at euismod dui. Vestibulum leo elit, condimentum sit amet diam vel, convallis condimentum nisl. Ut turpis libero, pharetra ac pellentesque eu, viverra vel leo. Nulla facilisi.", "https://i.pinimg.com/564x/7d/52/81/7d528148d382bd6c64be632a287da3e0.jpg"),
            ItemList("You one marry me ", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed laoreet viverra diam, in ultrices turpis bibendum a. Quisque at euismod dui. Vestibulum leo elit, condimentum sit amet diam vel, convallis condimentum nisl. Ut turpis libero, pharetra ac pellentesque eu, viverra vel leo. Nulla facilisi.", "https://i.pinimg.com/564x/7e/51/52/7e5152463f210da338715b74749c337a.jpg"),
            ItemList("zelda adventure", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed laoreet viverra diam, in ultrices turpis bibendum a. Quisque at euismod dui. Vestibulum leo elit, condimentum sit amet diam vel, convallis condimentum nisl. Ut turpis libero, pharetra ac pellentesque eu, viverra vel leo. Nulla facilisi.", "https://i.pinimg.com/564x/f9/a7/3c/f9a73ca8d86883de90499a06a64cdae8.jpg"),
            ItemList("The seven", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed laoreet viverra diam, in ultrices turpis bibendum a. Quisque at euismod dui. Vestibulum leo elit, condimentum sit amet diam vel, convallis condimentum nisl. Ut turpis libero, pharetra ac pellentesque eu, viverra vel leo. Nulla facilisi.", "https://i.pinimg.com/564x/87/15/7d/87157dbd291acf4da99ec7a5bb400092.jpg")
        )
        val adapter = AdapterList(itemList)
        recyclerView.adapter = adapter

    }
}