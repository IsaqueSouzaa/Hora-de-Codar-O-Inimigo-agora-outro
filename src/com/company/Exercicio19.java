package com.company;

import java.util.Scanner;

public class Exercicio19 {

    public static void main (String[] args){
        //17. Custa quanto?
        //O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do distribuidor
        //e dos impostos (aplicados ao custo de fábrica).

        //Supondo que o percentual do distribuidor seja de 28% e os impostos de 45% sobre o valor da fábrica,
        //escreva um programa para ler o custo de fábrica de um carro, calcular e escrever o custo final ao consumidor.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, informe o valor de fabrica do carro: ");
        double fabrica= scanner.nextDouble();

        double distribuidor=  (fabrica / 100) * 28;

        double impostos= (fabrica / 100) * 25;

        double consumidor= fabrica + impostos + distribuidor;

        System.out.println("O valor final do carro para o consumidor é de " + consumidor + " reais");

        scanner.close();

    }
}
