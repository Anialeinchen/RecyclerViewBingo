package com.example.anna.recyclerviewbingo.view

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.anna.recyclerviewbingo.R
import com.example.anna.recyclerviewbingo.model.Data
import kotlinx.android.synthetic.main.item_detail.view.*

class BingoAdapter(val data:Data) :
    RecyclerView.Adapter<BingoAdapter.BingoViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): BingoViewHolder {
        val currentView =
            LayoutInflater.from(viewGroup.context)
                .inflate(
                    R.layout.item_detail,
                    viewGroup,
                    false) as TextView
        currentView.setOnClickListener{
            currentView.setBackgroundColor(viewGroup.context.resources.getColor(R.color.material_grey_600))
        }
        return BingoViewHolder(currentView)
    }

    override fun onBindViewHolder(holder: BingoViewHolder, position: Int) {
        holder.bingoFeatureItem.text = data.currentFeatureList[position]
    }

    override fun getItemCount(): Int {
        return data.currentFeatureList.size
    }

    //TODO potential bug source
    //class BingoViewHolder(val bingoFeatureItem: TextView) : RecyclerView.ViewHolder(bingoFeatureItem)
    class BingoViewHolder (view: View) : RecyclerView.ViewHolder(view) {
        val bingoFeatureItem = view.bingo_item!!
    }
}

