package de.neuefische.pokemonList;

public class Pokemon {
    private final String id;
    private final String name;

    public Pokemon(String id, String name){
        this.id = id;
        this.name = name;

    }

    public String getId(){
        return id;
    }

    public String getName(){
        return name;
    }


}
