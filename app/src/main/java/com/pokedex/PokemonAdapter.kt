package com.pokedex

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_pokedex.view.*

class PokemonAdapter(val pokemon:List<Pokemon>):RecyclerView.Adapter<PokemonAdapter.PokemonHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokemonAdapter.PokemonHolder {
       val layoutInflater = LayoutInflater.from(parent.context)
        return PokemonHolder(layoutInflater.inflate(R.layout.item_pokedex,parent,false))
    }

    override fun onBindViewHolder(holder: PokemonAdapter.PokemonHolder, position: Int) {
        holder.render(pokemon[position])
    }

    override fun getItemCount():Int = pokemon.size

    class PokemonHolder(val view:View): RecyclerView.ViewHolder(view){
        fun render(pokemon:Pokemon){
            view.tvNamePokemon.text = pokemon.pokemon
            view.tvNumberPokemon.text = pokemon.numberPokemon
            view.tvTypeOne.text = pokemon.typeOne
            view.tvTypeTwo.text = pokemon.typeTwo
            Picasso.get().load(pokemon.imagenPokemon).into(view.ivPokemon)
        }
    }
}