package com.example.a18_viva

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.pg1 -> {
                val intent = Intent(this, second_activity::class.java)
                // start your next activity
                startActivity(intent)
                Toast.makeText(applicationContext, "page1", Toast.LENGTH_LONG).show()
                true
            }
            R.id.pg2 ->{
                Toast.makeText(applicationContext, "page2", Toast.LENGTH_LONG).show()
                return true
            }
            R.id.pg3 ->{
                Toast.makeText(applicationContext, "page3", Toast.LENGTH_LONG).show()
                return true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }


}