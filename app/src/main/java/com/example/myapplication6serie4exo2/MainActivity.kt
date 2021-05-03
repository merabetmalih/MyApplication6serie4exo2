package com.example.myapplication6serie4exo2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class Book(val title:String,author:String ,val description:String,var image:Int) {
}
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val book1:Book=Book(getString(R.string.book1_title),getString(R.string.book1_author),getString(R.string.book1_description),R.drawable.bookicon)
        val book2:Book=Book(getString(R.string.book2_title),getString(R.string.book2_author),getString(R.string.book2_description),R.drawable.bookicon)
        val book3:Book=Book(getString(R.string.book3_title),getString(R.string.book3_author),getString(R.string.book3_description),R.drawable.bookicon)
        button1.setOnClickListener();
        button1.setOnClickListener();
        button1.setOnClickListener();

    }
}
