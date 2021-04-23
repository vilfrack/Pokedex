package com.pokedex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val pokemonList = listOf(
        Pokemon("Bulbasaur","https://assets.pokemon.com/assets/cms2/img/pokedex/full/001.png","001","Grass","Poison"),
        Pokemon("Ivysaur","https://assets.pokemon.com/assets/cms2/img/pokedex/full/002.png","002","Grass","Poison"),
        Pokemon("Venusaur","https://assets.pokemon.com/assets/cms2/img/pokedex/full/003.png","003","Grass","Poison"),
        Pokemon("Charmander","https://assets.pokemon.com/assets/cms2/img/pokedex/full/004.png","004","Fire",""),
        Pokemon("Charmeleon","https://assets.pokemon.com/assets/cms2/img/pokedex/full/005.png","005","Fire",""),
        Pokemon("Charizard","https://assets.pokemon.com/assets/cms2/img/pokedex/full/006.png","006","Fire",""),
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        iniRecycler()
    }

    fun iniRecycler(){
        rvPokemon.layoutManager = LinearLayoutManager(this)
        val adapter = PokemonAdapter(pokemonList)
        rvPokemon.adapter = adapter

    }
}