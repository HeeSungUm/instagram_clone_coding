package com.heesungum.instagramclonecoding

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class PagerAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int = 5

    override fun createFragment(position: Int): Fragment {
        return when(position) {
            0 -> TimeLineFragment()
            1 -> SearchFragment()
            2 -> ReelsFragment()
            3 -> ShopFragment()
            else -> ProfileFragment()
        }
    }
}