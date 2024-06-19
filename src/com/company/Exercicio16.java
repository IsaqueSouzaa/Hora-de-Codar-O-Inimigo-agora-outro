package com.company;

import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadeAprovados = 0;
        String resposta;

        do {

            System.out.print("Por favor, informe a primeira nota: ");
            double primeira = scanner.nextDouble();

            System.out.print("Por favor, informe a segunda nota: ");
            double segunda = scanner.nextDouble();

            System.out.print("Por favor, informe a terceira nota: ");
            double terceira = scanner.nextDouble();

            System.out.print("Por favor, informe a quarta nota: ");
            double quarta = scanner.nextDouble();

            System.out.print("Por favor, informe a quinta nota: ");
            double quinta = scanner.nextDouble();

            System.out.print("Por favor, informe a sexta nota: ");
            double sexta = scanner.nextDouble();


            double media = (primeira + segunda + terceira + quarta + quinta + sexta) / 6;
            System.out.println("A média do aluno é: " + media);


            if (media >= 6.5) {
                System.out.println("O aluno está aprovado.");
                quantidadeAprovados++;
            } else {
                System.out.println("O aluno não está aprovado.");
            }


            System.out.print("Calcular a média de outro aluno? (Sim/Não): ");
            resposta = scanner.next();

        } while (resposta.equalsIgnoreCase("Sim"));


        System.out.println("Quantidade de alunos aprovados: " + quantidadeAprovados);

        scanner.close();
    }
}