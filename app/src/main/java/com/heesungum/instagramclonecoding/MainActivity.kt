package com.heesungum.instagramclonecoding

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
            when (position) {
                0 -> tab.setIcon(R.drawable.ic_outline_home_24)
                1 -> tab.setIcon(R.drawable.ic_baseline_search_24)
                2 -> tab.setIcon(R.drawable.ic_baseline_ondemand_video_24)
                3 -> tab.setIcon(R.drawable.ic_outline_shopping_bag_24)
                4 -> tab.setIcon(R.drawable.ic_outline_person_24)
            }
        }.attach()
        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {
                when (tab?.position) {
                    0 -> tab.setIcon(R.drawable.ic_baseline_home_24)
                    3 -> tab.setIcon(R.drawable.ic_baseline_shopping_bag_24)
                    4 -> tab.setIcon(R.drawable.ic_baseline_person_24)
                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
                when (tab?.position) {
                    0 -> tab.setIcon(R.drawable.ic_outline_home_24)
                    1 -> tab.setIcon(R.drawable.ic_baseline_search_24)
                    2 -> tab.setIcon(R.drawable.ic_baseline_ondemand_video_24)
                    3 -> tab.setIcon(R.drawable.ic_outline_shopping_bag_24)
                    4 -> tab.setIcon(R.drawable.ic_outline_person_24)
                }
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
            }

        })
    }
}