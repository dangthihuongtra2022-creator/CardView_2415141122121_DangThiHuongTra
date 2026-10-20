package com.example.activitylayout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.activitylayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.tvStudentName.text = "Họ và tên: Đặng Thị Hương Trà"
        binding.tvGpa.text = "3.85"
        binding.tvResult.text = "XUẤT SẮC (Top 5% Khóa)"
    }
}