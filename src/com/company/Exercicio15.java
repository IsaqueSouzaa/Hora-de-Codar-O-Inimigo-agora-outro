package com.company;

import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {

        //13 - De quanto até quanto?
        // Faça um algoritmo que calcule e escreva a média aritmética dos dois números inteiros
        // informados pelo usuário e todos os números inteiros entre eles. Considere que o primeiro sempre
        // será menor que o segundo.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, informe o primeiro número: ");
        int primeiro = scanner.nextInt();

        System.out.print("Por favor, informe o segundo número: ");
        int segundo = scanner.nextInt();


        int soma = 0;
        int quantidadeDeNumeros = 0;


        for (int i = primeiro; i <= segundo; i++) {
            soma += i;
            quantidadeDeNumeros++;
        }


        double media = (double) soma / quantidadeDeNumeros;


        System.out.println("A média aritmética dos números entre " + primeiro + " e " + segundo + " é: " + media);


        scanner.close();
    }
}
