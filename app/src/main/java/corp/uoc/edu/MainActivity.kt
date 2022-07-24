package corp.uoc.edu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import corp.uoc.edu.R
import android.content.Intent
import android.util.Log
import android.widget.Button
import corp.uoc.edu.SecondActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val i = Intent(applicationContext, SecondActivity::class.java)
            startActivity(i)
        }
        Log.i("MainActivity", "Jordi Pujol")
    }
}