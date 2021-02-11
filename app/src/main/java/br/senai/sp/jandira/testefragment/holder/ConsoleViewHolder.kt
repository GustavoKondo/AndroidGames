package br.senai.sp.jandira.testefragment.holder

import android.view.ContextThemeWrapper
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.senai.sp.jandira.testefragment.R
import br.senai.sp.jandira.testefragment.model.Console
import br.senai.sp.jandira.testefragment.model.Game



class  ConsoleViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

    val  textConsoleName = itemView.findViewById<TextView>(R.id.text_view_game_name)
    val  textConsoleMaker = itemView.findViewById<TextView>(R.id.text_view_game_description)

    var  consoleImage = itemView.findViewById<ImageView>(R.id.image_game)



    fun  bind(console: Console){
        textConsoleName.text = console.consoleName;
        textConsoleMaker.text = console.consoleMaker;
        consoleImage.setImageDrawable(console.consoleImage)

    }

}