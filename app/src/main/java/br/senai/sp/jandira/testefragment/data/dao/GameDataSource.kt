package br.senai.sp.jandira.testefragment.data.dao

import android.content.Context
import br.senai.sp.jandira.testefragment.R
import br.senai.sp.jandira.testefragment.model.Console
import br.senai.sp.jandira.testefragment.model.Game

class GameDataSource {

    companion object{
        fun getGames(context: Context) : ArrayList<Game> {
            var games = ArrayList<Game>()

            games.add(Game(
                1,
                "Mortal Kombat",
                context.getDrawable(R.drawable.mortalkombat)!!,
                "Mortal kombat é um ótimo jogo",
                4.5f,
                listOf(
                    Console(1, "PlayStation 4", "Sony", "2015-11-21"),
                    Console(2, "Xbox One", "Microsoft", "2015-12-12"),
                    Console(2, "Nitendo Switch", "Microsoft", "2015-12-12")
                ))
            )

            games.add(Game(
                2,
                "Midnight Club 3",
                context.getDrawable(R.drawable.midnight)!!,
                "Midnight Club é um ótimo jogo",
                4.5f,
                listOf(
                    Console(1, "PlayStation 2", "Sony", "2009-11-21"),
                    Console(2, "Xbox 360", "Microsoft", "2008-12-12")


                ))
            )

            games.add(Game(
                3,
                "Call of Duty: Black Ops 2",
                context.getDrawable(R.drawable.cod)!!,
                "Call of Duty: Black Ops 2 é um ótimo jogo",
                4.5f,
                listOf(
                    Console(1, "PlayStation 3", "Sony", "2009-11-21"),
                    Console(2, "Xbox 360", "Microsoft", "2008-12-12")
                ))
            )

            games.add(Game(
                2,
                "Battlefild",
                context.getDrawable(R.drawable.bf3)!!,
                "Midnight Club é um ótimo jogo",
                5f,
                listOf(
                    Console(1, "PlayStation 2", "Sony", "2009-11-21"),
                    Console(2, "Xbox 360", "Microsoft", "2008-12-12"),
                    Console(2, "PC", "Microsoft", "2015-12-12")
                ))
            )

            return games

        }
    }

}