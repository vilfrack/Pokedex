package com.pokedex.utility

import android.view.View
import com.pokedex.R
import com.pokedex.utility.typepokemon.PokemonTypeEnum
import kotlinx.android.synthetic.main.item_pokedex.*
import kotlinx.android.synthetic.main.item_pokedex.view.*

class ColorContainerPokemon() {
    //#fase 2
    fun getColorContainerPokemon(typePokemon: String, numberPosition:Int, view: View){
        if (typePokemon == "Electric"){
                when(numberPosition){
                    1->{
                        view.ivCardOne.setImageResource( R.drawable.electric1)
                    }
                    2->{
                        view.ivCardTwo.setImageResource(R.drawable.electric2)
                    }
                    3->{
                        view.ivCardThree.setImageResource( R.drawable.electric3)
                    }
                    4->{
                        view.ivCardFourd.setImageResource(R.drawable.electric4)
                    }
                }
            }
        if (typePokemon== "Fire"){
            when(numberPosition){
                1->{
                    view.ivCardOne.setImageResource( R.drawable.fire1)
                }
                2->{
                    view.ivCardTwo.setImageResource(R.drawable.fire2)
                }
                3->{
                    view.ivCardThree.setImageResource( R.drawable.fire3)
                }
                4->{
                    view.ivCardFourd.setImageResource(R.drawable.fire4)
                }
            }
        }
        if (typePokemon == "Bug"){
            when(numberPosition){
                1->{
                    view.ivCardOne.setImageResource( R.drawable.bug1)
                }
                2->{
                    view.ivCardTwo.setImageResource(R.drawable.bug2)
                }
                3->{
                    view.ivCardThree.setImageResource( R.drawable.bug3)
                }
                4->{
                    view.ivCardFourd.setImageResource(R.drawable.bug4)
                }
            }
        }
        if (typePokemon == "Grass"){
            when(numberPosition){
                1->{
                    view.ivCardOne.setImageResource( R.drawable.grass1)
                }
                2->{
                    view.ivCardTwo.setImageResource(R.drawable.grass2)
                }
                3->{
                    view.ivCardThree.setImageResource( R.drawable.grass3)
                }
                4->{
                    view.ivCardFourd.setImageResource(R.drawable.grass4)
                }
            }
        }
        if (typePokemon== "Water"){
            when(numberPosition){
                1->{
                    view.ivCardOne.setImageResource( R.drawable.water1)
                }
                2->{
                    view.ivCardTwo.setImageResource(R.drawable.water2)
                }
                3->{
                    view.ivCardThree.setImageResource( R.drawable.water3)
                }
                4->{
                    view.ivCardFourd.setImageResource(R.drawable.water4)
                }
            }
        }
    }
}