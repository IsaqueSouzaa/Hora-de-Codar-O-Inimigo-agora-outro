package com.company;

import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args){

        //7 - Qual o quê?
        //Faça um programa que leia  3 valores (considere que não serão informados valores iguais) e escrever a soma dos 2 maiores.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, informe o primeiro valor: ");
        double primeiro= scanner.nextDouble();

        System.out.print("Por favor, informe o segundo valor: ");
        double segundo= scanner.nextDouble();

        System.out.print("Por favor, informe o terceiro valor: ");
        double terceiro= scanner.nextDouble();

        if( primeiro > segundo && primeiro > terceiro && segundo > terceiro){
            double maior = primeiro + segundo;
            System.out.print("Os maiores valores são o primeiro e segundo. A soma dos dois maiores é: " + maior);
        }

        else if ( primeiro > segundo && primeiro > terceiro && terceiro > segundo){
            double maior= primeiro + terceiro;
            System.out.print("Os maiores valores são o primeiro e terceiro. A soma dos dois maiores é: " + maior);
        }

        else if (segundo > primeiro && segundo > terceiro && primeiro > terceiro){
            double maior= segundo + primeiro;
            System.out.print("Os maiores valores são o segundo e primeiro. A soma dos dois maiores é: " + maior);
        }

        else if (segundo > primeiro && segundo > terceiro && terceiro > primeiro) {
            double maior = segundo + terceiro;
            System.out.print("Os maiores valores são o segundo e terceiro. A soma dos dois maiores é: " + maior);
        }
        else if(terceiro > primeiro && terceiro > segundo && primeiro > segundo){
            double maior= terceiro + primeiro;
            System.out.print("Os maiores valores são o terceiro e primeiro. A soma dos dois maiores é: " + maior);
        }

        else {
            double maior= terceiro + segundo;
            System.out.print("Os maiores valores são o terceiro e segundo. A soma dos dois maiores é: " + maior);
            }

        scanner.close();

       }
    }


