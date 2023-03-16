package org.example.grupo;

public class Macaco extends Animal{
    private static final String NOME = "Mongo";
    private boolean acordado;

    public Macaco(String especie, int idade, String habitat) {
        super(especie, idade, habitat);
    }

    public Macaco(String especie, int idade, String habitat, String nome, boolean acordado) {
        super(especie, idade, habitat);
        this.acordado = acordado;
    }

    public void getAcordado() {
        if (this.acordado) {
            System.out.println("No momento ele está acordado");
        } else {
            System.out.println("No momento ele está dormindo");
        }
    }

    public void setAcordado(boolean acordado) {
        this.acordado = acordado;
    }

    public String getNome() {
        return NOME;
    }

}
