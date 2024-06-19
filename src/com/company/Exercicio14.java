package com.company;

import  java.util.Scanner;

public class Exercicio14 {

    public static void main (String[] args){

       // 12 - 10, 9, 8, 7, 6, 5, 4, 3, 2, 1...
      //  Escreva um algoritmo para imprimir os números de 1 (inclusive) a 10 (inclusive) em ordem decrescente.

        Scanner smith = new Scanner(System.in);

        int i=10;

        for(i=10; i > 0; i--);{
           System.out.print(i + ", ");
        }

        try{
            Thread.sleep(1000);
        }

        catch (InterruptedException e){
           System.err.print("Erro na contagem regressiva: " + e.getMessage());
        }

        smith.close();

    }

}
