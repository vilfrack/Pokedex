package com.pokedex

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.pokedex.dataclass.PokemonContainerItem
import com.pokedex.utility.ColorContainerPokemon
import com.pokedex.utility.typepokemon.Constant
import com.pokedex.utility.typepokemon.PokemonTypeEnum
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_pokedex.*
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
        fun render(pokemon: PokemonContainerItem, itemPokemon:Int ){


            ColorContainerPokemon().getColorContainerPokemon(pokemon.itemOne.typeOne,1, view)
            ColorContainerPokemon().getColorContainerPokemon(pokemon.itemTwo.typeOne,2, view)
            ColorContainerPokemon().getColorContainerPokemon(pokemon.itemThree.typeOne,3, view)
            ColorContainerPokemon().getColorContainerPokemon(pokemon.itemFour.typeOne,4, view)

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


            if (pokemon.itemOne.pokemon==""){
                view.ivCardOne.visibility = View.INVISIBLE
                view.ivPokemon.visibility= View.INVISIBLE
                view.ivTypeOne1.visibility= View.INVISIBLE
                view.ivTypeTwo1.visibility= View.INVISIBLE
            }else{
                view.ivCardOne.visibility = View.VISIBLE
                view.ivPokemon.visibility= View.VISIBLE
                view.ivTypeOne1.visibility= View.VISIBLE
                view.ivTypeTwo1.visibility= View.VISIBLE
            }

            if (pokemon.itemTwo.pokemon==""){
                view.ivCardTwo.visibility = View.INVISIBLE
                view.ivPokemon2.visibility= View.INVISIBLE
                view.ivTypeOne2.visibility= View.INVISIBLE
                view.ivTypeTwo2.visibility= View.INVISIBLE
            }else{
                view.ivCardTwo.visibility = View.VISIBLE
                view.ivPokemon2.visibility= View.VISIBLE
                view.ivTypeOne2.visibility= View.VISIBLE
                view.ivTypeTwo2.visibility= View.VISIBLE
            }

            if (pokemon.itemThree.pokemon==""){
                view.ivCardThree.visibility = View.INVISIBLE
                view.ivPokemon3.visibility= View.INVISIBLE
                view.ivTypeOne3.visibility= View.INVISIBLE
                view.ivTypeTwo3.visibility= View.INVISIBLE
            }else{
                view.ivCardThree.visibility = View.VISIBLE
                view.ivPokemon3.visibility  = View.VISIBLE
                view.ivTypeOne3.visibility  = View.VISIBLE
                view.ivTypeTwo3.visibility  = View.VISIBLE
            }

            if (pokemon.itemFour.pokemon==""){
                view.ivCardFourd.visibility = View.INVISIBLE
                view.ivPokemon4.visibility= View.INVISIBLE
                view.ivTypeOne4.visibility= View.INVISIBLE
                view.ivTypeTwo4.visibility= View.INVISIBLE
            }else{
                view.ivCardFourd.visibility = View.VISIBLE
                view.ivPokemon4.visibility= View.VISIBLE
                view.ivTypeOne4.visibility= View.VISIBLE
                view.ivTypeTwo4.visibility= View.VISIBLE
            }

        }
    }
}