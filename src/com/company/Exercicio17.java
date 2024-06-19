package com.company;

public class Exercicio17 {

    public static void main(String[] args){

        // 15 - Uma Brincadeira Sobre Alturas
        // Anacleto tem 1,50 metro e cresce 2 centímetros por ano,
        // enquanto Felisberto tem 1,10 metro e cresce 3 centímetros por ano.
        // Construa um programa que calcule e imprima quantos anos serão necessários
        // para que Felisberto seja maior que Anacleto.


        int quantidadeAno = 0;


        double alturaAnacleto = 1.50;
        double alturaFelisberto = 1.10;


        while (alturaFelisberto <= alturaAnacleto) {

            alturaAnacleto += 0.02;
            alturaFelisberto += 0.03;


            quantidadeAno++;
        }


        System.out.println("A quantidade de anos para que Felisberto seja maior que Anacleto é: " + quantidadeAno);
    }
}