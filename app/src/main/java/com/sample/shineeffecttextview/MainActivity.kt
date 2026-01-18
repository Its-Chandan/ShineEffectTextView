package com.sample.shineeffecttextview

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.WindowCompat
import com.chandan.shineeffecttextview.Shimmer
import com.sample.shineeffecttextview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        WindowCompat.setDecorFitsSystemWindows(window, false)
        window.statusBarColor = Color.TRANSPARENT
        window.navigationBarColor = Color.TRANSPARENT

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tv1.setBaseColor(ContextCompat.getColor(this, R.color.dark_red))
            .setHighLightColor(ContextCompat.getColor(this, R.color.orange))
            .setDirection(Shimmer.Direction.LEFT_TO_RIGHT)
            .build()
        binding.tv1.startShimmer()
        binding.tv2.startShimmer()
        binding.tv3.startShimmer()
        binding.tv4.startShimmer()


        binding.btnNext.setOnClickListener {
            startActivity(Intent(this, OfferActivity::class.java))
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        binding.tv1.stopShimmer()
    }


}