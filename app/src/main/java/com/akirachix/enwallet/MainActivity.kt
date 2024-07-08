package com.akirachix.enwallet

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirachix.enwallet.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding =ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvRecyclerView.layoutManager=LinearLayoutManager(this)
        displayWallet()


    }


    fun displayWallet(){
        var salary1 = enWalletAdapter("Salary","KSH 30000","1 June 2024")
        var salary2 = enWalletAdapter("Salary","KSH 30000","1 June 2024")
        var salary3 = enWalletAdapter("Salary","KSH 30000","1 June 2024")
        var salary4 = enWalletAdapter("Salary","KSH 30000","1 June 2024")
        var salary5 = enWalletAdapter("Salary","KSH 30000","1 June 2024")
        var salary6 = enWalletAdapter("Salary","KSH 30000","1 June 2024")

        val salarylist = listOf(salary1,salary2,salary3,salary4,salary5,salary6)
        val walletsadapter = Wallet(salarylist)
        binding.rvRecyclerView.adapter = walletsadapter






    }

}