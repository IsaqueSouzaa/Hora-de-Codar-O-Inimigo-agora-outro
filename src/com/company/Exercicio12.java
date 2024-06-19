package com.company;

import java.util.Scanner;

public class Exercicio12 {

    public static void main (String[] args){

        //10 - Parabéns
       // Escreva um programa para ler as notas das 4 avaliações de um aluno no semestre, calcular e escrever a
   // média do semestre e a seguinte mensagem: PARABÉNS! Você foi aprovado! somente se o aluno foi aprovado
     //  (considere 6.0 a média mínima para aprovação e 4 notas informadas).

    Scanner scanner= new Scanner(System.in);

    System.out.print("Por favor, informe a primeira nota: ");
    double primeira= scanner.nextDouble();

    System.out.print("Por favor, informe a segunda nota: ");
    double segunda= scanner.nextDouble();

    System.out.print("Por favor, informe a terceira nota: ");
    double terceira= scanner.nextDouble();

    System.out.print("Por favor, informe a quarta nota: ");
    double quarta= scanner.nextDouble();

    double resultado= (primeira + segunda + terceira + quarta) / 2;

    if( resultado < 6.0){
        System.out.print("INFELIZMENTE, Você não foi aprovado! Tente um pouco mais!");
    }

    else{
        System.out.print("PARABÉNS! Você foi aprovado!");
    }

        scanner.close();


    }
}
