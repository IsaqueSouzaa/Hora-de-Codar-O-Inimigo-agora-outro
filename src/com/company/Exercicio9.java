package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
       // Faça um programa que leia 5  valores (considere que não serão informados valores iguais) e escrever a soma dos
     //2 maiores.

        Scanner scanner = new Scanner(System.in);
        double[] values = new double[5];

        // Ler os 5 valores
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            values[i] = scanner.nextDouble();
        }

        // Ordenar os valores em ordem decrescente
        Arrays.sort(values);
        double sumOfLargest = values[3] + values[4];

        // Imprimir o resultado
        System.out.println("A soma dos dois maiores valores é: " + sumOfLargest);

        scanner.close();
    }
}