package com.company;

import java.util.Scanner;

public class Exercicio6 {

    public static void main ( String[] args){

       // 6 - Qual o maior?
        //Faça um programa para ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, informe o primeiro valor: ");
        double primeiro= scanner.nextDouble();

        System.out.print("Por favor, informe o segundo valor: ");
        double segundo= scanner.nextDouble();

        System.out.print("Por favor, informe o terceiro valor: ");
        double terceiro= scanner.nextDouble();

        if(primeiro > segundo && primeiro > terceiro)
            System.out.print("O primeiro valor é o maior deles");

        else if (segundo > primeiro && segundo > terceiro) {
            System.out.print("O Segundo valor é o maior deles");
        }
        else {
            System.out.print("O terceiro valor é o maior deles ");
            }

        scanner.close();
    }

}
