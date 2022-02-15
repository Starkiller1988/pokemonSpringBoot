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

        List<Pokemon> pokemon = List.of(new Pokemon("001", "Bulbusaur"), new Pokemon("002", "Charmander"), new Pokemon("003", "Squirtle"));
        return pokemon;
    }

}
