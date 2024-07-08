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
        val wallet = listOf(
            enWalletAdapter(
                "Salary 1",
                "KSH 42000",
                "1st june 2024"
            ),


            enWalletAdapter(
                "Rent",
                "KSH 15000",
                "2st june 2024"
            ),


            enWalletAdapter(
                "Dividends",
                "KSH 24000",
                "4st june 2024"
            ),


            enWalletAdapter(
                "Electricty",
                "KSH 500",
                "4st june 2024"
            ),


            enWalletAdapter(
                "Salary 1",
                "KSH 42000",
                "1st june 2024"
            ),


            enWalletAdapter(
                "Internet",
                "KSH 2500",
                "5st june 2024"
            ),


            enWalletAdapter(
                "Shooping",
                "KSH 3500",
                "11st june 2024"
            ),

            enWalletAdapter(
                "Bus fare",
                "KSH 500",
                "11st june 2024"
            ),

            enWalletAdapter(
                "Water",
                "KSH 500",
                "11st june 2024"
            ),

            enWalletAdapter(
                "Fees",
                "KSH 500",
                "11st june 2024"
            ),


        )
    }
}