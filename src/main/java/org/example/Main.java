package org.example;

import org.example.grupo.Macaco;

public class Main {
    public static void main(String[] args) {
        Macaco orangotango = new Macaco("Tapanuli", 12, "Florestas Tropicais",
                "Mongo", false);
        System.out.println("O primata Orangotango é da especie " + orangotango.getEspecie());
        System.out.println("Sua idade é " + orangotango.getIdade() + " anos");
        System.out.println("Seu principal habitat são as " + orangotango.getHabitat());
        System.out.println("Seu nome é " + orangotango.getNome());
        orangotango.setAcordado(true);
        orangotango.getAcordado();
      }
    }