package com.akirachix.enwallet

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView


class Wallet(val walletList:List<enWalletAdapter>):RecyclerView.Adapter<WalletViewHolder>(){
    override fun onCreateViewHolder(rvRecyclerView: ViewGroup, viewType: Int): WalletViewHolder {
        var itemView = LayoutInflater.from(rvRecyclerView.context).inflate(R.layout.wallet, rvRecyclerView,false)
        return WalletViewHolder((itemView))

    }

    override fun onBindViewHolder(holder: WalletViewHolder, position: Int) {
        val wallet = walletList[position]
        holder.salary.text = wallet.salaries
        holder.ksh.text = wallet.kes
        holder.date.text = wallet.dates
    }

    override fun getItemCount(): Int {
        return walletList.size
    }



}

class WalletViewHolder(itemView: View):
    RecyclerView.ViewHolder(itemView){
    var salary = itemView.findViewById<TextView>(R.id.salaryID)
    var ksh = itemView.findViewById<TextView>(R.id.kshID)
    var date = itemView.findViewById<TextView>(R.id.date_ID)
}

