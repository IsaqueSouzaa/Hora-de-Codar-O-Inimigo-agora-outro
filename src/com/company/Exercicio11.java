package com.company;

import  java.util.Scanner;

public class Exercicio11 {

    public static void main (String[] args){

       // 9 -  Cansar de Digitar
       // Faça um programa que leia 10 valores informados pelo usuário, calcule,
       // exiba os números informados e escreva a média aritmética desses valores lidos.

        Scanner scanner = new Scanner(System.in);

        double soma= 0.0;

        for ( int i = 1; i <= 10; i++ ){
            System.out.print("Por Favor, informe o valor" + i + ":");
            double valor = scanner.nextDouble();
            soma += valor;
        }

        double aritmetica = soma /10;

        System.out.print("A média aritmética é " + aritmetica);

        scanner.close();
    }
}
