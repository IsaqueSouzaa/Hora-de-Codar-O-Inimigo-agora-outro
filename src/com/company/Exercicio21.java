package com.company;

import java.util.Scanner;

public class Exercicio21 {

    public static void main(String[] args){

        //19. É o quê?
        // Crie um programa para ler 3 valores (A, B e C) representando as medidas dos lados de um triângulo e escrever
        // se formam ou não um triângulo.

        //Obs: para formar um triângulo, o valor de cada lado deve ser menor que a soma dos outros 2 lados.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, informe o primeiro valor: ");
        double primeiro= scanner.nextDouble();

        System.out.print("Por favor, informe o segundo valor: ");
        double segundo= scanner.nextDouble();

        System.out.print("Por favor, informe o terceiro: ");
        double terceiro= scanner.nextDouble();

        if(primeiro + segundo > terceiro && primeiro + terceiro > segundo && terceiro + segundo > primeiro){

            System.out.print("Os valores informados formam um triângulo");
        }

        else {
            System.out.print("Os valores informados não formam um triângulo");
        }


        scanner.close();
    }

}
