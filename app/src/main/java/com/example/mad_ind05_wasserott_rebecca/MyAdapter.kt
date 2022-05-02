package com.example.mad_ind05_wasserott_rebecca

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mad_ind05_wasserott_rebecca.databinding.RecyclerRowBinding
import layout.States
import layout.StatesDataModel
import layout.StatesDataModel.statesList


class MyAdapter(val statesListL: List<States>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    inner class MyViewHolder(val binding: RecyclerRowBinding) :
        RecyclerView.ViewHolder(binding.root),
        View.OnClickListener {
        init {
            binding.root.setOnClickListener(this)
        }

        fun bindItem(states: States) {
            binding.name.text = states.name
            binding.nickname.text = states.nickname


        }

        override fun onClick(p0: View?) {
            p0?.let {
                val context = it.context
                val intent = Intent(context, MainActivity2::class.java)
                    .putExtra("rowNum", adapterPosition.toString())
                    .putExtra("stateName", binding.name.text)
                    .putExtra("stateMiles", StatesDataModel.statesList[adapterPosition].miles)
                    .putExtra("stateFlag", StatesDataModel.statesList[adapterPosition].flag)
                    .putExtra("stateMap", StatesDataModel.statesList[adapterPosition].map)
                context.startActivity(intent)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            RecyclerRowBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val states = statesList[position]
        holder.bindItem(states)
    }

    override fun getItemCount(): Int {
        return statesList.size
    }

}
