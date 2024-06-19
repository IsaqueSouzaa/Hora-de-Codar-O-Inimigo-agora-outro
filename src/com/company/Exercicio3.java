package com.company;

import java.util.Scanner;

public class Exercicio3 {

    public static void main (String[] arg){

        //3 - A Bit of Information
        //Escreva um programa em Java em que o usuário informe o seu nome e em seguida o programa perguntará a idade do
        //usuário. Agora o programa deve exibir a mensagem "Olá, [NomeDoUsuario], sua idade é [idade]".

        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, informe o seu nome: ");

        String nome = scanner.nextLine();

        System.out.print("Por favor, informe a sua idade: ");

        String idade= scanner.nextLine();

        System.out.print("Olá, " + nome + " sua idade é "+ idade);

    }
}
