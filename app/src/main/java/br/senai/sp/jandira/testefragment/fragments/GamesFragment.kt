package br.senai.sp.jandira.testefragment.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.senai.sp.jandira.testefragment.R
import br.senai.sp.jandira.testefragment.adapter.GameAdapter
import br.senai.sp.jandira.testefragment.data.dao.GameDataSource
import br.senai.sp.jandira.testefragment.model.Game

class GamesFragment : Fragment() {

    private lateinit var  recyclerGames: RecyclerView
    private val gameAdapter = GameAdapter()
    private var gameList = listOf<Game>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_games, container, false)

        //instanciar a recyclerview
        recyclerGames = view.findViewById(R.id.recycler_view_games)

        //determinar a orientação  a RV
        recyclerGames.layoutManager = LinearLayoutManager(view.context)

        //Informar para qual é o adpter ela vai utilizar
        recyclerGames.adapter = gameAdapter

        //dizer ao dapatar qual é a fonte de dados
        gameList = GameDataSource.getGames(view.context)

        //atualizara lista de jogos do dapter
        gameAdapter.updateGameList(gameList)

        return view

    }

}