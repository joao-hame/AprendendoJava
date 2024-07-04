package org.example.oop;

public class Bolo {
    private String sabor;
    private String cor;
    private String cobertura;

    public Bolo(String sabor, String cor, String cobertura) {
        this.sabor = sabor;
        this.cor = cor;
        this.cobertura = cobertura;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }


}
