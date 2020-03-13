package com.github.arekolek.viewbindingnullability

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import com.github.arekolek.viewbindingnullability.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

class ViewHolder(itemView: View) {
    val binding = ActivityMainBinding.bind(itemView)
}
