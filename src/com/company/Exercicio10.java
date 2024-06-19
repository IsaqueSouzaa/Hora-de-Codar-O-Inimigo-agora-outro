package com.company;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {

        // 8 - Enquanto isso
        // Faça um programa para ler 2 valores informados pelo usuário e se o segundo valor informado for neutro, deve ser
        // lido um novo valor - ou seja, para o segundo valor não pode ser aceito o valor zero nem um valor negativo.
        // O programa deve imprimir o resultado da divisão do primeiro valor lido pelo segundo valor lido.

        Scanner corleone = new Scanner(System.in);

        System.out.print("Por favor, informe o primeiro valor: ");
        double primeiro = corleone.nextDouble();

        double segundo;
        do {
            System.out.print("Por favor, informe o segundo valor (deve ser maior que zero): ");
            segundo = corleone.nextDouble();

            if (segundo <= 0) {
                System.out.println("O segundo valor não pode ser igual ou menor que zero. Tente novamente.");
            }
        } while (segundo <= 0);

        double resultado = primeiro / segundo;
        System.out.println("A divisão do primeiro valor pelo segundo é: " + resultado);

        corleone.close();
    }
}
