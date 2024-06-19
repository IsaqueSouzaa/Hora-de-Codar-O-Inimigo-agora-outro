package com.company;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

       // 2 -  Hello Clarice
      //  Escreva um programa em Java em que o usuário informe o seu nome e exiba a mensagem "Olá, [NomeDoUsuario]".

        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, informe o seu nome:");

        String nome = scanner.nextLine();

        System.out.print("Olá, "+ nome);

        scanner.close();
    }
}
