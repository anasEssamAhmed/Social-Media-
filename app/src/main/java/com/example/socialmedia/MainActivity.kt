package com.example.socialmedia

import android.view.LayoutInflater
import com.example.socialmedia.databinding.ActivityMainBinding
import com.example.socialmedia.ui.base.BaseActivity
import com.example.socialmedia.ui.home.HomeFragment

class MainActivity : BaseActivity<ActivityMainBinding>() {
    override val tag: String = MainActivity::class.java.name
    override val bindingInflater: (LayoutInflater) -> ActivityMainBinding = ActivityMainBinding::inflate
    private val homeFragment = HomeFragment()

    override fun setup() {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.fragment_continer , homeFragment)
        transaction.commit()
    }

}