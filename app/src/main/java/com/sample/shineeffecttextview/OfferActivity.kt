package com.sample.shineeffecttextview

import android.app.Activity
import android.graphics.Color
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import com.chandan.shineeffecttextview.ShineEffectTextView

import com.sample.shineeffecttextview.databinding.ActivityOfferBinding

class OfferActivity : AppCompatActivity() {

    private lateinit var binding: ActivityOfferBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)
        binding = ActivityOfferBinding.inflate(layoutInflater)
        setContentView(binding.root)

        WindowCompat.setDecorFitsSystemWindows(window, false)
        window.statusBarColor = Color.TRANSPARENT
        window.navigationBarColor = Color.TRANSPARENT

        binding = ActivityOfferBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvOffer1.startShimmer()
        binding.tvOffer2.startShimmer()
        binding.tvOffer3.startShimmer()
        binding.tvOffer5.startShimmer()
        binding.tvOffer6.startShimmer()
        binding.tvOffer7.startShimmer()
    }


}