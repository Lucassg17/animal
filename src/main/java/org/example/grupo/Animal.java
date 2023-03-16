package org.example.grupo;

public class Animal {
    private String especie;
    private int idade;
    private String habitat;

    public Animal(String especie, int idade, String habitat) {
        this.especie = especie;
        this.idade = idade;
        this.habitat = habitat;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

}


