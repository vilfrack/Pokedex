package com.pokedex

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.pokedex.dataclass.Pokemon
import com.pokedex.dataclass.PokemonContainerItem
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.item_pokedex.*

class MainActivity : AppCompatActivity() {

    val pokemonList = mutableListOf(
            Pokemon("Bulbasaur", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/001.png", "001", "Grass", "Poison"),
            Pokemon("Ivysaur", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/002.png", "002", "Grass", "Poison"),
            Pokemon("Venusaur", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/003.png", "003", "Grass", "Poison"),
            Pokemon("Charmander", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/004.png", "004", "Fire", ""),

            Pokemon("Charmeleon", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/005.png", "005", "Fire", ""),
            Pokemon("Charizard", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/006.png", "006", "Fire", ""),
            Pokemon("Squirtle", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/007.png", "007", "Water", ""),
            Pokemon("Wartortle", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/008.png", "008", "Water", ""),

            Pokemon("Blastoise", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/009.png", "009", "Water", ""),
            Pokemon("Caterpie", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/010.png", "010", "Bug", ""),
            Pokemon("Metapod", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/011.png", "011", "Bug", ""),
            Pokemon("Butterfree", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/012.png", "012", "Bug", "Flying"),

            Pokemon("Weedle", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/013.png", "013", "Bug", "Poison"),
            Pokemon("Kakuna", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/014.png", "014", "Bug", "Poison"),
            Pokemon("Beedrill", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/015.png", "015", "Bug", "Poison"),
            Pokemon("Pidgey", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/016.png", "016", "Normal", "Flying"),

            Pokemon("Pidgeotto", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/017.png", "017", "Normal", "Flying"),
            Pokemon("Pidgeot", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/018.png", "018", "Normal", "Flying"),
            Pokemon("Rattata", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/019.png", "019", "Normal", ""),
            Pokemon("Raticate", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/020.png", "020", "Normal", ""),

            Pokemon("Spearow", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/021.png", "021", "Normal", "Flying"),
            Pokemon("Fearow", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/022.png", "022", "Normal", "Flying"),
            Pokemon("Ekans", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/023.png", "023", "Poison", ""),
            Pokemon("Arbok", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/024.png", "024", "Poison", ""),

            Pokemon("Pikachu", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/025.png", "025", "Electric", ""),
            Pokemon("Raichu", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/026.png", "026", "Electric", ""),
            Pokemon("Sandshrew", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/027.png", "027", "Ground", ""),
            Pokemon("Sandslash", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/028.png", "028", "Ground", ""),

            Pokemon("Nidoran", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/029.png", "029", "Poison", ""),
            Pokemon("Nidorina", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/030.png", "030", "Poison", ""),
            Pokemon("Nidoqueen", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/031.png", "031", "Poison", ""),
            Pokemon("Nidoran", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/032.png", "032", "Poison", ""),

            Pokemon("Nidorino", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/033.png", "033", "Poison ", ""),
            Pokemon("Nidoking", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/034.png", "034", "Poison", ""),
            Pokemon("Clefairy", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/035.png", "035", "Fairy", ""),
            Pokemon("Clefable", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/036.png", "036", "Fairy", ""),

            Pokemon("Vulpix", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/037.png", "037", "Fire", ""),
            Pokemon("Ninetales", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/038.png", "038", "Fire", ""),
            Pokemon("Jigglypuff", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/039.png", "039", "Normal", "Fairy"),
            Pokemon("Wigglytuff", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/040.png", "040", "Normal", "Fairy"),

            Pokemon("Zubat", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/041.png", "041", "Poison", "Flying"),
            Pokemon("Golbat", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/042.png", "042", "Poison", "Flying"),
            Pokemon("Oddish", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/043.png", "043", "Grass", "Poison"),
            Pokemon("Gloom", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/044.png", "044", "Grass", "Poison"),

            Pokemon("Vileplume", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/045.png", "045", "Grass", "Poison"),
            Pokemon("Paras", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/046.png", "046", "Bug", "Grass"),
            Pokemon("Parasect", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/047.png", "047", "Bug", "Grass"),
            Pokemon("Venonat", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/048.png", "048", "Bug", "Poison"),

            Pokemon("Venomoth", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/049.png", "049", "Bug", "Poison"),
            Pokemon("Diglett", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/050.png", "050", "Ground", ""),
            Pokemon("Dugtrio", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/051.png", "051", "Ground", ""),
            Pokemon("Meowth", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/052.png", "052", "Normal", ""),

            Pokemon("Persian", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/053.png", "053", "Normal", ""),
            Pokemon("Psyduck", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/054.png", "054", "Water", ""),
            Pokemon("Golduck", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/055.png", "055", "Water", ""),
            Pokemon("Mankey", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/056.png", "056", "Fighting", ""),

            Pokemon("Primeape", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/057.png", "057", "Fighting", ""),
            Pokemon("Growlithe", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/058.png", "058", "Fire", ""),
            Pokemon("Arcanine", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/059.png", "059", "Fire", ""),
            Pokemon("Poliwag", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/060.png", "060", "Water", ""),

            Pokemon("Poliwhirl", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/061.png", "061", "Water", ""),
            Pokemon("Poliwrath", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/062.png", "062", "Water", "Fighting"),
            Pokemon("Abra", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/063.png", "063", "Psychic", ""),
            Pokemon("Kadabra", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/064.png", "064", "Psychic", ""),

            Pokemon("Alakazam", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/065.png", "065", "Psychic", ""),
            Pokemon("Machop", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/066.png", "066", "Fighting", ""),
            Pokemon("Machoke", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/067.png", "067", "Fighting", ""),
            Pokemon("Machamp", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/068.png", "068", "Fighting", ""),

            Pokemon("Bellsprout", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/069.png", "069", "Grass", "Poison"),
            Pokemon("Weepinbell", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/070.png", "070", "Grass", "Poison"),
            Pokemon("Victreebel", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/071.png", "071", "Grass", "Poison"),
            Pokemon("Tentacool", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/072.png", "072", "Water", "Poison"),

            Pokemon("Tentacruel", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/073.png", "073", "Water", "Poison"),
            Pokemon("Geodude", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/074.png", "074", "Rock", ""),
            Pokemon("Graveler", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/075.png", "075", "Rock", "Ground"),
            Pokemon("Golem", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/076.png", "076", "Rock", "Ground"),

            Pokemon("Ponyta", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/077.png", "077", "Fire", "")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        iniRecycler()

    }

    fun iniRecycler(){
        rvPokemon.layoutManager = LinearLayoutManager(this)


//--------------------------------------------------------------
        var i:Int=3
        var beginPokemon:Int = 0
        var indexList:Int=0

        var pokemonTupleList = mutableListOf<PokemonContainerItem>()


        while(i<pokemonList.size){
            pokemonTupleList.addAll(
                    mutableListOf(
                            PokemonContainerItem(
                                    Pokemon(pokemonList[beginPokemon].pokemon, pokemonList[beginPokemon].imagenPokemon, pokemonList[beginPokemon].numberPokemon, pokemonList[beginPokemon].typeOne, pokemonList[beginPokemon].typeTwo),
                                    Pokemon(pokemonList[beginPokemon + 1].pokemon, pokemonList[beginPokemon + 1].imagenPokemon, pokemonList[beginPokemon + 1].numberPokemon, pokemonList[beginPokemon + 1].typeOne, pokemonList[beginPokemon + 1].typeTwo),
                                    Pokemon(pokemonList[i - 1].pokemon, pokemonList[i - 1].imagenPokemon, pokemonList[i - 1].numberPokemon, pokemonList[i - 1].typeOne, pokemonList[i - 1].typeTwo),
                                    Pokemon(pokemonList[i].pokemon, pokemonList[i].imagenPokemon, pokemonList[i].numberPokemon, pokemonList[i].typeOne, pokemonList[i].typeTwo)
                            )
                    )
            )

            beginPokemon = i+1
            i+=4
        }

        println("pokemonTupleList ${pokemonTupleList.size}")
//AHORA ACA TENGO Q HACER OTRA VALIDACION Q COMPARE LOS TAMAÑOS DE CADA LISTA, EN CASO DE NO SE IGUALES EJECUTO OTRA VALIDACION
//EN DONDE BUSCO Q POKEMON HACE FALTA Y LO AGREGO A LA NUEVA LISTA
        var count:Int =0
        pokemonTupleList.forEach {
            if( it.itemOne!=null){
                count++
            }
            if( it.itemTwo!=null){
                count++
            }
            if( it.itemThree!=null){
                count++
            }
            if( it.itemFour!=null){
                count++
            }
        }
        println("count ${count}")

        var differenceBetween = pokemonList.size-count
        println("differenceBetween ${differenceBetween}")
        val reversedListPokemon = pokemonList.asReversed()

        i=0
        if (differenceBetween==1){
            pokemonTupleList.addAll(
                    mutableListOf(
                            PokemonContainerItem(
                                    Pokemon(reversedListPokemon[0].pokemon, reversedListPokemon[0].imagenPokemon, reversedListPokemon[0].numberPokemon, reversedListPokemon[0].typeOne, reversedListPokemon[0].typeTwo),
                                    Pokemon("", "", "", "", ""),
                                    Pokemon("", "", "", "", ""),
                                    Pokemon("", "", "", "", "")
                            )
                    )
            )
        }
        if (differenceBetween==2){
            pokemonTupleList.addAll(
                    mutableListOf(
                            PokemonContainerItem(
                                    Pokemon(reversedListPokemon[0].pokemon, reversedListPokemon[0].imagenPokemon, reversedListPokemon[0].numberPokemon, reversedListPokemon[0].typeOne, reversedListPokemon[0].typeTwo),
                                    Pokemon(reversedListPokemon[1].pokemon, reversedListPokemon[1].imagenPokemon, reversedListPokemon[1].numberPokemon, reversedListPokemon[1].typeOne, reversedListPokemon[1].typeTwo),
                                    Pokemon("", "", "", "", ""),
                                    Pokemon("", "", "", "", "")
                            )
                    )
            )
        }
        if (differenceBetween==3){
            pokemonTupleList.addAll(
                    mutableListOf(
                            PokemonContainerItem(
                                    Pokemon(reversedListPokemon[0].pokemon, reversedListPokemon[0].imagenPokemon, reversedListPokemon[0].numberPokemon, reversedListPokemon[0].typeOne, reversedListPokemon[0].typeTwo),
                                    Pokemon(reversedListPokemon[1].pokemon, reversedListPokemon[1].imagenPokemon, reversedListPokemon[1].numberPokemon, reversedListPokemon[1].typeOne, reversedListPokemon[1].typeTwo),
                                    Pokemon(reversedListPokemon[2].pokemon, reversedListPokemon[2].imagenPokemon, reversedListPokemon[2].numberPokemon, reversedListPokemon[2].typeOne, reversedListPokemon[2].typeTwo),
                                    Pokemon("", "", "", "", "")
                            )
                    )
            )
        }



       // println(reversedListPokemon.asReversed())
var list = pokemonTupleList
//---------------------------------------------------------------










        val adapter = PokemonAdapter(list)

        rvPokemon.adapter = adapter


    }
}