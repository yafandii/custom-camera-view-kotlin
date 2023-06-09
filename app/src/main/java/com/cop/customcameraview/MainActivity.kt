package com.cop.customcameraview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCamera = findViewById<MaterialButton>(R.id.btnUploadImage)
        btnCamera.setOnClickListener {
            val intent = Intent(this, CameraView::class.java)
            startActivity(intent)
        }
    }
}