package com.company;

import java.util.Scanner;

public class Exercicio7 {

    public static void main (String[] args){

        //6.1 - Qual o maior? (4 vezes pior)
       // Faça um programa para ler 4 valores (considere que não serão informados valores iguais) e escrever o maior deles.

        Scanner scanner= new Scanner(System.in);

        System.out.print("Por favor, informe o primeiro valor: ");
        double primeiro = scanner.nextDouble();

        System.out.print("Por favor, informe o segundo valor: ");
        double segundo= scanner.nextDouble();

        System.out.print("Por favor, insira o terceiro valor: ");
        double terceiro= scanner.nextDouble();

        System.out.print("Por favor informe o quarto valor: ");
        double quarto= scanner.nextDouble();

        if (primeiro > segundo && primeiro > terceiro && primeiro > quarto) {
                System.out.print("O primeiro valor é o maior deles");
        }
        else if (segundo > primeiro && segundo > terceiro && segundo > quarto){
                System.out.print("O segundo valor é o maior deles");
        }

        else if (terceiro > primeiro && terceiro > segundo && terceiro > quarto ){
                System.out.print("O terceiro valor é o maior deles");
        }

        else {
            System.out.print("O quarto valor é o maior deles");
        }

        scanner.close();
    }

    }

