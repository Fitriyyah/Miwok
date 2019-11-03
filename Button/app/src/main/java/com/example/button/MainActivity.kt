package android.cianjur.developer.net.basicandroid

import android.R
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var tombol: Button? = null // Membuat Variable Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tombol = findViewById(R.id.testing) // Menginisialisasi ID untuk Button

        // Sebuah Listener untuk penanganan kejadian saat tombol diklik
        tombol!!.setOnClickListener {
            // Memunculkan pesan berupa text dialog saat tombol "Klik Disini" diklik.
            Toast.makeText(applicationContext, "Selamat Datang Di WILDAN TECHNO ART", Toast.LENGTH_SHORT).show()
        }
    }
}