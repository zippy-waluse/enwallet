package com.akirachix.enwallet

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView


abstract class Wallet(val walletList:List<enWalletAdapter>):RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WalletViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.wallet,parent,false)
        return WalletViewHolder((itemView))

    }

    override fun getItemCount(): Int {
        return walletList.size
    }





}

class WalletViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    var salary = itemView.findViewById<TextView>(R.id.salaryID)
    var ksh = itemView.findViewById<TextView>(R.id.kshID)
    var date = itemView.findViewById<TextView>(R.id.date_ID)
}