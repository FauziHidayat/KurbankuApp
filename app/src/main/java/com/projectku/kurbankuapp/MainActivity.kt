package com.projectku.kurbankuapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.projectku.kurbankuapp.fragment.AccountFragment
import com.projectku.kurbankuapp.fragment.HomeFragment
import com.projectku.kurbankuapp.fragment.MessageFragment
import com.projectku.kurbankuapp.fragment.TransactionFragment

class MainActivity : AppCompatActivity() {

    private val fragmentHome: Fragment = HomeFragment()
    private val fragmentMessage: Fragment = MessageFragment()
    private val fragmentTransaction: Fragment = TransactionFragment()
    private val fragmentAccount: Fragment = AccountFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        replaceFragment(fragmentHome)


        val bottomNavigationView: BottomNavigationView = findViewById(R.id.nav_view)

        bottomNavigationView.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.navigation_home -> replaceFragment(fragmentHome)
                R.id.navigation_message -> replaceFragment(fragmentMessage)
                R.id.navigation_transaction -> replaceFragment(fragmentTransaction)
                R.id.navigation_account -> replaceFragment(fragmentAccount)
            }
            true
        }


    }

    private fun replaceFragment(fragment: Fragment){
        if(fragment != null){
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.nav_host_fragment, fragment)
            transaction.commit()
        }
    }
}