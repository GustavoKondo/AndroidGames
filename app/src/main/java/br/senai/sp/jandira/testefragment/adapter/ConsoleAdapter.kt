package br.senai.sp.jandira.testefragment.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.senai.sp.jandira.testefragment.R
import br.senai.sp.jandira.testefragment.model.Console
import br.senai.sp.jandira.testefragment.holder.ConsoleViewHolder

class ConsoleAdapter: RecyclerView.Adapter<ConsoleViewHolder>() {

    private  var consolelist = listOf<Console>()

    fun updateGameList(list: List<Console>){
        consolelist = list
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ConsoleViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.holder_game_layout, parent, false)

        return  ConsoleViewHolder(view)
    }

    override fun getItemCount(): Int {
        return  consolelist.size
    }

    override fun onBindViewHolder(holder: ConsoleViewHolder, position: Int) {
        holder.bind(consolelist[position])
    }


}