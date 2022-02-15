package de.neuefische.pokemonList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pokemon")

public class PokemonListController {

    @GetMapping

    public List<Pokemon> getPokemon(){

        List<Pokemon> pokemon = List.of(new Pokemon("001", "Bulbusaur", "https://cdn.myminifactory.com/assets/object-assets/5e9e5f15b5bc2/images/resize-bulbasaur-original.jpg"), new Pokemon("002", "Charmander", "https://i.etsystatic.com/8607787/r/il/2f20e9/1844034204/il_794xN.1844034204_j15u.jpg"), new Pokemon("003", "Squirtle", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/007.png"));
        return pokemon;
    }

}
