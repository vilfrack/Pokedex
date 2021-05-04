package com.pokedex

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pokedex.dataclass.Pokemon
import com.pokedex.dataclass.PokemonContainerItem
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_pokedex.view.*

class PokemonAdapter(val pokemonList:List<PokemonContainerItem>):RecyclerView.Adapter<PokemonAdapter.PokemonHolder>() {

    var countItem:Int=0
    var fourItem:Boolean=false
    var pokemonPositionList=mutableListOf<PokemonContainerItem>()
    var pokemonTotal:Int = getItemCount()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokemonAdapter.PokemonHolder {
       val layoutInflater = LayoutInflater.from(parent.context)
        return PokemonHolder(layoutInflater.inflate(R.layout.item_pokedex,parent,false))
    }

    override fun onBindViewHolder(holder: PokemonAdapter.PokemonHolder, position: Int) {
        holder.render(pokemonList[position],countItem)
    }

    override fun getItemCount():Int = pokemonList.size

    class PokemonHolder(val view:View): RecyclerView.ViewHolder(view){
        fun render(pokemon: PokemonContainerItem, itemPokemon:Int){

            view.tvNamePokemon.text = pokemon.itemOne.pokemon
            view.tvNumberPokemon.text = pokemon.itemOne.numberPokemon
            if(!pokemon.itemOne.imagenPokemon.isEmpty()){
                Picasso.get().load(pokemon.itemOne.imagenPokemon).into(view.ivPokemon)
            }

            view.tvNamePokemon2.text = pokemon.itemTwo.pokemon
            view.tvNumberPokemon2.text = pokemon.itemTwo.numberPokemon
            if(!pokemon.itemTwo.imagenPokemon.isEmpty()){
                Picasso.get().load(pokemon.itemTwo.imagenPokemon).into(view.ivPokemon2)
            }


            view.tvNamePokemon3.text = pokemon.itemThree.pokemon
            view.tvNumberPokemon3.text = pokemon.itemThree.numberPokemon
            if(!pokemon.itemThree.imagenPokemon.isEmpty()){
                Picasso.get().load(pokemon.itemThree.imagenPokemon).into(view.ivPokemon3)
            }


            view.tvNamePokemon4.text = pokemon.itemFour.pokemon
            view.tvNumberPokemon4.text = pokemon.itemFour.numberPokemon
            if(!pokemon.itemFour.imagenPokemon.isEmpty()){
                Picasso.get().load(pokemon.itemFour.imagenPokemon).into(view.ivPokemon4)
            }


//            when(itemPokemon){
//                1->{
//                    view.tvNamePokemon.text = pokemon.pokemon
//                    view.tvNumberPokemon.text = pokemon.numberPokemon
//                    Picasso.get().load(pokemon.imagenPokemon).into(view.ivPokemon)
//                }
//                2->{
//                    view.tvNamePokemon2.text = pokemon.pokemon
//                    view.tvNumberPokemon2.text = pokemon.numberPokemon
//                    Picasso.get().load(pokemon.imagenPokemon).into(view.ivPokemon2)
//                }
//                3->{
//                    view.tvNamePokemon3.text = pokemon.pokemon
//                    view.tvNumberPokemon3.text = pokemon.numberPokemon
//                    Picasso.get().load(pokemon.imagenPokemon).into(view.ivPokemon3)
//                }
//                else->{
//                    view.tvNamePokemon4.text = pokemon.pokemon
//                    view.tvNumberPokemon4.text = pokemon.numberPokemon
//                    Picasso.get().load(pokemon.imagenPokemon).into(view.ivPokemon4)
//                }
//            }




        }
    }
}