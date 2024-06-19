package com.company;

import  java.util.Scanner;

public class Exercicio13 {

    public static void  main (String[] args){

        //11 - BOOOOMMM
       // Crie uma bomba relógio (usando somente código - para deixar claro!)
       // cuja contagem regressiva vá de 30 a 0. Escreva a contagem em tela e no final da repetição escreva "EXPLOSÃO".

        Scanner scanner = new Scanner(System.in);

        int i=30;

        for(i=30; i >= 0; i--){
            System.out.print(i + "\n");

        try {
            Thread.sleep(1000);
        }

        catch (InterruptedException e){

            System.err.print("Erro na contagem regressiva: "+ e.getMessage());

        }
             }

        System.out.print("EXPLOSÃOOOO!!!!!");

        scanner.close();
    }
}
