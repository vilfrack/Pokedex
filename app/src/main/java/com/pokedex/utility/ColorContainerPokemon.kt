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
        if (typePokemon == "Fire"){
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
        if (typePokemon == "Water"){
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
        if (typePokemon == "Ground"){
            when(numberPosition){
                1->{
                    view.ivCardOne.setImageResource(R.drawable.ground1)
                }
                2->{
                    view.ivCardTwo.setImageResource(R.drawable.ground2)
                }
                3->{
                    view.ivCardThree.setImageResource( R.drawable.ground3)
                }
                4->{
                    view.ivCardFourd.setImageResource(R.drawable.ground4)
                }
            }
        }
        if (typePokemon == "Ice"){
            when(numberPosition){
                1->{
                    view.ivCardOne.setImageResource( R.drawable.ice1)
                }
                2->{
                    view.ivCardTwo.setImageResource(R.drawable.ice2)
                }
                3->{
                    view.ivCardThree.setImageResource( R.drawable.ice3)
                }
                4->{
                    view.ivCardFourd.setImageResource(R.drawable.ice4)
                }
            }
        }
        if (typePokemon == "Poison"){
            when(numberPosition){
                1->{
                    view.ivCardOne.setImageResource( R.drawable.poison1)
                }
                2->{
                    view.ivCardTwo.setImageResource(R.drawable.poison2)
                }
                3->{
                    view.ivCardThree.setImageResource( R.drawable.poison3)
                }
                4->{
                    view.ivCardFourd.setImageResource(R.drawable.poison4)
                }
            }
        }
        if (typePokemon == "Psychic"){
            when(numberPosition){
                1->{
                    view.ivCardOne.setImageResource( R.drawable.psyco1)
                }
                2->{
                    view.ivCardTwo.setImageResource(R.drawable.psyco2)
                }
                3->{
                    view.ivCardThree.setImageResource( R.drawable.psyco3)
                }
                4->{
                    view.ivCardFourd.setImageResource(R.drawable.psyco4)
                }
            }
        }
        if (typePokemon == "Rock"){
            when(numberPosition){
                1->{
                    view.ivCardOne.setImageResource( R.drawable.rock1)
                }
                2->{
                    view.ivCardTwo.setImageResource(R.drawable.rock2)
                }
                3->{
                    view.ivCardThree.setImageResource( R.drawable.rock3)
                }
                4->{
                    view.ivCardFourd.setImageResource(R.drawable.rock4)
                }
            }
        }
        if (typePokemon == "Steal"){
            when(numberPosition){
                1->{
                    view.ivCardOne.setImageResource( R.drawable.steal1)
                }
                2->{
                    view.ivCardTwo.setImageResource(R.drawable.steal2)
                }
                3->{
                    view.ivCardThree.setImageResource( R.drawable.steal3)
                }
                4->{
                    view.ivCardFourd.setImageResource(R.drawable.steal4)
                }
            }
        }
        if (typePokemon == "Dark"){
            when(numberPosition){
                1->{
                    view.ivCardOne.setImageResource( R.drawable.dark1)
                }
                2->{
                    view.ivCardTwo.setImageResource(R.drawable.dark2)
                }
                3->{
                    view.ivCardThree.setImageResource( R.drawable.dark3)
                }
                4->{
                    view.ivCardFourd.setImageResource(R.drawable.dark4)
                }
            }
        }
        if (typePokemon == "Dragon"){
            when(numberPosition){
                1->{
                    view.ivCardOne.setImageResource( R.drawable.dragon1)
                }
                2->{
                    view.ivCardTwo.setImageResource(R.drawable.dragon2)
                }
                3->{
                    view.ivCardThree.setImageResource( R.drawable.dragon3)
                }
                4->{
                    view.ivCardFourd.setImageResource(R.drawable.dragon4)
                }
            }
        }
        if (typePokemon == "Fairy"){
            when(numberPosition){
                1->{
                    view.ivCardOne.setImageResource( R.drawable.fairy1)
                }
                2->{
                    view.ivCardTwo.setImageResource(R.drawable.fairy2)
                }
                3->{
                    view.ivCardThree.setImageResource( R.drawable.fairy3)
                }
                4->{
                    view.ivCardFourd.setImageResource(R.drawable.fairy4)
                }
            }
        }
        if (typePokemon == "Fighting"){
            when(numberPosition){
                1->{
                    view.ivCardOne.setImageResource( R.drawable.fighting1)
                }
                2->{
                    view.ivCardTwo.setImageResource(R.drawable.fighting2)
                }
                3->{
                    view.ivCardThree.setImageResource( R.drawable.fighting3)
                }
                4->{
                    view.ivCardFourd.setImageResource(R.drawable.fighting4)
                }
            }
        }
        if (typePokemon == "Flying"){
            when(numberPosition){
                1->{
                    view.ivCardOne.setImageResource( R.drawable.fly1)
                }
                2->{
                    view.ivCardTwo.setImageResource(R.drawable.fly2)
                }
                3->{
                    view.ivCardThree.setImageResource( R.drawable.fly3)
                }
                4->{
                    view.ivCardFourd.setImageResource(R.drawable.fly4)
                }
            }
        }


    }

    fun getSkillOnePokemon(typePokemonOne: String, numberPosition:Int, view: View){
        if (typePokemonOne == "Electric"){
            when(numberPosition){
                1->{
                    view.ivTypeOne1.setImageResource(R.drawable.electric)
                }
                2->{
                    view.ivTypeOne2.setImageResource(R.drawable.electric)
                }
                3->{
                    view.ivTypeOne3.setImageResource( R.drawable.electric)
                }
                4->{
                    view.ivTypeOne4.setImageResource(R.drawable.electric)
                }
            }
        }
        if (typePokemonOne == "Fire"){
            when(numberPosition){
                1->{
                    view.ivTypeOne1.setImageResource(R.drawable.fire)
                }
                2->{
                    view.ivTypeOne2.setImageResource(R.drawable.fire)
                }
                3->{
                    view.ivTypeOne3.setImageResource( R.drawable.fire)
                }
                4->{
                    view.ivTypeOne4.setImageResource(R.drawable.fire)
                }
            }
        }
        if (typePokemonOne == "Bug"){
            when(numberPosition){
                1->{
                    view.ivTypeOne1.setImageResource(R.drawable.bug)
                }
                2->{
                    view.ivTypeOne2.setImageResource(R.drawable.bug)
                }
                3->{
                    view.ivTypeOne3.setImageResource( R.drawable.bug)
                }
                4->{
                    view.ivTypeOne4.setImageResource(R.drawable.bug)
                }
            }
        }
        if (typePokemonOne == "Grass"){
            when(numberPosition){
                1->{
                    view.ivTypeOne1.setImageResource(R.drawable.grass)
                }
                2->{
                    view.ivTypeOne2.setImageResource(R.drawable.grass)
                }
                3->{
                    view.ivTypeOne3.setImageResource( R.drawable.grass)
                }
                4->{
                    view.ivTypeOne4.setImageResource(R.drawable.grass)
                }
            }
        }
        if (typePokemonOne == "Water"){
            when(numberPosition){
                1->{
                    view.ivTypeOne1.setImageResource(R.drawable.water)
                }
                2->{
                    view.ivTypeOne2.setImageResource(R.drawable.water)
                }
                3->{
                    view.ivTypeOne3.setImageResource( R.drawable.water)
                }
                4->{
                    view.ivTypeOne4.setImageResource(R.drawable.water)
                }
            }
        }
        if (typePokemonOne == "Poison"){
            when(numberPosition){
                1->{
                    view.ivTypeOne1.setImageResource(R.drawable.poison)
                }
                2->{
                    view.ivTypeOne2.setImageResource(R.drawable.poison)
                }
                3->{
                    view.ivTypeOne3.setImageResource( R.drawable.poison)
                }
                4->{
                    view.ivTypeOne4.setImageResource(R.drawable.poison)
                }
            }
        }
        if (typePokemonOne== "Ground"){
            when(numberPosition){
                1->{
                    view.ivTypeOne1.setImageResource(R.drawable.ground)
                }
                2->{
                    view.ivTypeOne2.setImageResource(R.drawable.ground)
                }
                3->{
                    view.ivTypeOne3.setImageResource( R.drawable.ground)
                }
                4->{
                    view.ivTypeOne4.setImageResource(R.drawable.ground)
                }
            }
        }
        if (typePokemonOne== "Ice"){
            when(numberPosition){
                1->{
                    view.ivTypeOne1.setImageResource(R.drawable.ice)
                }
                2->{
                    view.ivTypeOne2.setImageResource(R.drawable.ice)
                }
                3->{
                    view.ivTypeOne3.setImageResource( R.drawable.ice)
                }
                4->{
                    view.ivTypeOne4.setImageResource(R.drawable.ice)
                }
            }
        }
        if (typePokemonOne== "Psychic"){
            when(numberPosition){
                1->{
                    view.ivTypeOne1.setImageResource(R.drawable.psychic)
                }
                2->{
                    view.ivTypeOne2.setImageResource(R.drawable.psychic)
                }
                3->{
                    view.ivTypeOne3.setImageResource( R.drawable.psychic)
                }
                4->{
                    view.ivTypeOne4.setImageResource(R.drawable.psychic)
                }
            }
        }
        if (typePokemonOne== "Rock"){
            when(numberPosition){
                1->{
                    view.ivTypeOne1.setImageResource(R.drawable.rock)
                }
                2->{
                    view.ivTypeOne2.setImageResource(R.drawable.rock)
                }
                3->{
                    view.ivTypeOne3.setImageResource( R.drawable.rock)
                }
                4->{
                    view.ivTypeOne4.setImageResource(R.drawable.rock)
                }
            }
        }
        if (typePokemonOne== "Steal"){
            when(numberPosition){
                1->{
                    view.ivTypeOne1.setImageResource(R.drawable.steel)
                }
                2->{
                    view.ivTypeOne2.setImageResource(R.drawable.steel)
                }
                3->{
                    view.ivTypeOne3.setImageResource( R.drawable.steel)
                }
                4->{
                    view.ivTypeOne4.setImageResource(R.drawable.steel)
                }
            }
        }
        if (typePokemonOne== "Dark"){
            when(numberPosition){
                1->{
                    view.ivTypeOne1.setImageResource(R.drawable.dark)
                }
                2->{
                    view.ivTypeOne2.setImageResource(R.drawable.dark)
                }
                3->{
                    view.ivTypeOne3.setImageResource( R.drawable.dark)
                }
                4->{
                    view.ivTypeOne4.setImageResource(R.drawable.dark)
                }
            }
        }
        if (typePokemonOne== "Dragon"){
            when(numberPosition){
                1->{
                    view.ivTypeOne1.setImageResource(R.drawable.dragon)
                }
                2->{
                    view.ivTypeOne2.setImageResource(R.drawable.dragon)
                }
                3->{
                    view.ivTypeOne3.setImageResource( R.drawable.dragon)
                }
                4->{
                    view.ivTypeOne4.setImageResource(R.drawable.dragon)
                }
            }
        }
        if (typePokemonOne== "Fairy"){
            when(numberPosition){
                1->{
                    view.ivTypeOne1.setImageResource(R.drawable.fairy)
                }
                2->{
                    view.ivTypeOne2.setImageResource(R.drawable.fairy)
                }
                3->{
                    view.ivTypeOne3.setImageResource( R.drawable.fairy)
                }
                4->{
                    view.ivTypeOne4.setImageResource(R.drawable.fairy)
                }
            }
        }
        if (typePokemonOne== "Fighting"){
            when(numberPosition){
                1->{
                    view.ivTypeOne1.setImageResource(R.drawable.fighting)
                }
                2->{
                    view.ivTypeOne2.setImageResource(R.drawable.fighting)
                }
                3->{
                    view.ivTypeOne3.setImageResource( R.drawable.fighting)
                }
                4->{
                    view.ivTypeOne4.setImageResource(R.drawable.fighting)
                }
            }
        }
        if (typePokemonOne== "Flying"){
            when(numberPosition){
                1->{
                    view.ivTypeOne1.setImageResource(R.drawable.flying)
                }
                2->{
                    view.ivTypeOne2.setImageResource(R.drawable.flying)
                }
                3->{
                    view.ivTypeOne3.setImageResource( R.drawable.flying)
                }
                4->{
                    view.ivTypeOne4.setImageResource(R.drawable.flying)
                }
            }
        }
    }
    fun getSkillTwoPokemon(typePokemonTwo: String, numberPosition:Int, view: View){
        if (typePokemonTwo == "Electric"){
            when(numberPosition){
                1->{
                    view.ivTypeTwo1.setImageResource(R.drawable.electric)
                }
                2->{
                    view.ivTypeTwo2.setImageResource(R.drawable.electric)
                }
                3->{
                    view.ivTypeTwo3.setImageResource( R.drawable.electric)
                }
                4->{
                    view.ivTypeTwo4.setImageResource(R.drawable.electric)
                }
            }
        }
        if (typePokemonTwo == "Fire"){
            when(numberPosition){
                1->{
                    view.ivTypeTwo1.setImageResource(R.drawable.fire)
                }
                2->{
                    view.ivTypeTwo2.setImageResource(R.drawable.fire)
                }
                3->{
                    view.ivTypeTwo3.setImageResource( R.drawable.fire)
                }
                4->{
                    view.ivTypeTwo4.setImageResource(R.drawable.fire)
                }
            }
        }
        if (typePokemonTwo == "Bug"){
            when(numberPosition){
                1->{
                    view.ivTypeTwo1.setImageResource(R.drawable.bug)
                }
                2->{
                    view.ivTypeTwo2.setImageResource(R.drawable.bug)
                }
                3->{
                    view.ivTypeTwo3.setImageResource( R.drawable.bug)
                }
                4->{
                    view.ivTypeTwo4.setImageResource(R.drawable.bug)
                }
            }
        }
        if (typePokemonTwo == "Grass"){
            when(numberPosition){
                1->{
                    view.ivTypeTwo1.setImageResource(R.drawable.grass)
                }
                2->{
                    view.ivTypeTwo2.setImageResource(R.drawable.grass)
                }
                3->{
                    view.ivTypeTwo3.setImageResource( R.drawable.grass)
                }
                4->{
                    view.ivTypeTwo4.setImageResource(R.drawable.grass)
                }
            }
        }
        if (typePokemonTwo == "Water"){
            when(numberPosition){
                1->{
                    view.ivTypeTwo1.setImageResource(R.drawable.water)
                }
                2->{
                    view.ivTypeTwo2.setImageResource(R.drawable.water)
                }
                3->{
                    view.ivTypeTwo3.setImageResource( R.drawable.water)
                }
                4->{
                    view.ivTypeTwo4.setImageResource(R.drawable.water)
                }
            }
        }
        if (typePokemonTwo == "Poison"){
            when(numberPosition){
                1->{
                    view.ivTypeTwo1.setImageResource(R.drawable.poison)
                }
                2->{
                    view.ivTypeTwo2.setImageResource(R.drawable.poison)
                }
                3->{
                    view.ivTypeTwo3.setImageResource( R.drawable.poison)
                }
                4->{
                    view.ivTypeTwo4.setImageResource(R.drawable.poison)
                }
            }
        }

        if (typePokemonTwo== "Ground"){
            when(numberPosition){
                1->{
                    view.ivTypeTwo1.setImageResource(R.drawable.ground)
                }
                2->{
                    view.ivTypeTwo2.setImageResource(R.drawable.ground)
                }
                3->{
                    view.ivTypeTwo3.setImageResource( R.drawable.ground)
                }
                4->{
                    view.ivTypeTwo4.setImageResource(R.drawable.ground)
                }
            }
        }
        if (typePokemonTwo== "Ice"){
            when(numberPosition){
                1->{
                    view.ivTypeTwo1.setImageResource(R.drawable.ice)
                }
                2->{
                    view.ivTypeTwo2.setImageResource(R.drawable.ice)
                }
                3->{
                    view.ivTypeTwo3.setImageResource( R.drawable.ice)
                }
                4->{
                    view.ivTypeTwo4.setImageResource(R.drawable.ice)
                }
            }
        }
        if (typePokemonTwo== "Psychic"){
            when(numberPosition){
                1->{
                    view.ivTypeTwo1.setImageResource(R.drawable.psychic)
                }
                2->{
                    view.ivTypeTwo2.setImageResource(R.drawable.psychic)
                }
                3->{
                    view.ivTypeTwo3.setImageResource( R.drawable.psychic)
                }
                4->{
                    view.ivTypeTwo4.setImageResource(R.drawable.psychic)
                }
            }
        }
        if (typePokemonTwo== "Rock"){
            when(numberPosition){
                1->{
                    view.ivTypeTwo1.setImageResource(R.drawable.rock)
                }
                2->{
                    view.ivTypeTwo2.setImageResource(R.drawable.rock)
                }
                3->{
                    view.ivTypeTwo3.setImageResource( R.drawable.rock)
                }
                4->{
                    view.ivTypeTwo4.setImageResource(R.drawable.rock)
                }
            }
        }
        if (typePokemonTwo== "steal"){
            when(numberPosition){
                1->{
                    view.ivTypeTwo1.setImageResource(R.drawable.steel)
                }
                2->{
                    view.ivTypeTwo2.setImageResource(R.drawable.steel)
                }
                3->{
                    view.ivTypeTwo3.setImageResource( R.drawable.steel)
                }
                4->{
                    view.ivTypeTwo4.setImageResource(R.drawable.steel)
                }
            }
        }
        if (typePokemonTwo== "dark"){
            when(numberPosition){
                1->{
                    view.ivTypeTwo1.setImageResource(R.drawable.dark)
                }
                2->{
                    view.ivTypeTwo2.setImageResource(R.drawable.dark)
                }
                3->{
                    view.ivTypeTwo3.setImageResource( R.drawable.dark)
                }
                4->{
                    view.ivTypeTwo4.setImageResource(R.drawable.dark)
                }
            }
        }
        if (typePokemonTwo== "dragon"){
            when(numberPosition){
                1->{
                    view.ivTypeTwo1.setImageResource(R.drawable.dragon)
                }
                2->{
                    view.ivTypeTwo2.setImageResource(R.drawable.dragon)
                }
                3->{
                    view.ivTypeTwo3.setImageResource( R.drawable.dragon)
                }
                4->{
                    view.ivTypeTwo4.setImageResource(R.drawable.dragon)
                }
            }
        }
        if (typePokemonTwo== "Fairy"){
            when(numberPosition){
                1->{
                    view.ivTypeTwo1.setImageResource(R.drawable.fairy)
                }
                2->{
                    view.ivTypeTwo2.setImageResource(R.drawable.fairy)
                }
                3->{
                    view.ivTypeTwo3.setImageResource( R.drawable.fairy)
                }
                4->{
                    view.ivTypeTwo4.setImageResource(R.drawable.fairy)
                }
            }
        }
        if (typePokemonTwo== "Fighting"){
            when(numberPosition){
                1->{
                    view.ivTypeTwo1.setImageResource(R.drawable.fighting)
                }
                2->{
                    view.ivTypeTwo2.setImageResource(R.drawable.fighting)
                }
                3->{
                    view.ivTypeTwo3.setImageResource( R.drawable.fighting)
                }
                4->{
                    view.ivTypeTwo4.setImageResource(R.drawable.fighting)
                }
            }
        }
        if (typePokemonTwo== "Flying"){
            when(numberPosition){
                1->{
                    view.ivTypeTwo1.setImageResource(R.drawable.flying)
                }
                2->{
                    view.ivTypeTwo2.setImageResource(R.drawable.flying)
                }
                3->{
                    view.ivTypeTwo3.setImageResource( R.drawable.flying)
                }
                4->{
                    view.ivTypeTwo4.setImageResource(R.drawable.flying)
                }
            }
        }
    }
}