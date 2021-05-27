package com.pokedex.utility.typepokemon

import com.pokedex.utility.ColorContainerPokemon


class Constant {
    fun GetPokemonType(): Map<String, PokemonTypeEnum> {
        val map = mapOf<String, PokemonTypeEnum>(
                "Normal" to PokemonTypeEnum.Normal,
                "Fighting" to PokemonTypeEnum.Fighting,
                "Flying" to PokemonTypeEnum.Flying,
                "Poison" to PokemonTypeEnum.Poison,
                "Ground" to PokemonTypeEnum.Ground,
                "Rock" to PokemonTypeEnum.Rock,
                "Steel" to PokemonTypeEnum.Steel,
                "Fire" to PokemonTypeEnum.Fire,
                "Water" to PokemonTypeEnum.Water,
                "Grass" to PokemonTypeEnum.Grass,
                "Electric" to PokemonTypeEnum.Electric,
                "Dark" to PokemonTypeEnum.Dark,
                "Bug" to PokemonTypeEnum.Bug,
                "Fairy" to PokemonTypeEnum.Fairy,
                "" to  PokemonTypeEnum.Fire,

        )

        return map
    }
    //#fase 1
//    fun ColorContainer(typePokemon: PokemonTypeEnum,position:Int){
//        ColorContainerPokemon().getColorContainerPokemon(typePokemon,position)
//    }
}