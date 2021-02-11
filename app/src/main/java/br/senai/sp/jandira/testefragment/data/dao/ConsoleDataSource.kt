package br.senai.sp.jandira.testefragment.data.dao

import android.content.Context
import br.senai.sp.jandira.testefragment.R
import br.senai.sp.jandira.testefragment.model.Console

class ConsoleDataSource {

    companion object{
        fun getGames(context: Context) : ArrayList<Console> {
            var consoles = ArrayList<Console>()

            consoles.add(Console(
                1,
                "Nitendo Switch",
                "Nitendo"

            )
            )

            consoles.add(Console(
                2,
                "Playstation",

                "Sony"

                )
            )

            consoles.add(Console(
                3,
                "XBOX ONE",
                "microsoft"

                )
            )

            consoles.add(Console(
                2,

                "wii",
                "nitendo"



          )
            )

            return consoles

        }

        private fun Console(id: Long, consoleName: String, consoleMaker: String): Console {
            TODO("Not yet implemented")
        }
    }

}