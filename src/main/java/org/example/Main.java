package org.example;


import org.example.oop.Bolo;

public class Main {
    public static void main(String[] args) {
        Bolo boloDeChocolate = new Bolo("chocolate", "preto", "chocolate");
        Bolo boloFormigueiro = new Bolo("formigueiro", "branco", "chocolate");

        System.out.println(boloDeChocolate.getSabor());

        boloDeChocolate.setSabor("morango");


        System.out.println(boloDeChocolate.getSabor());
    }
}