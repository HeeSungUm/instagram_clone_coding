package com.heesungum.insta_clone_coding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewPager2 : ViewPager2 = findViewById(R.id.pager)
        val tabLayout : TabLayout = findViewById(R.id.tab_layout)

        viewPager2.adapter = PagerAdapter(this)
        TabLayoutMediator(tabLayout, viewPager2) {tab, position ->
            tab.text = "OBJECT ${(position+1)}"
        }.attach()
    }
}