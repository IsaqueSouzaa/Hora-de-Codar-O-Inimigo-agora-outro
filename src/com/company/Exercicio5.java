package com.company;

import java.util.Scanner;

public class Exercicio5 {
   public static void main (String[] args){

       //5 - 1, 2 e 3
       //Faça um programa que leia um valor informado pelo usuário e diga se o valor informado é positivo, negativo ou neutro.

      Scanner scanner= new Scanner(System.in);

      System.out.print("Por favor, informe um valor: ");
      double valor= scanner.nextDouble();

      if (valor > 0){
         System.out.print("O valor informado é positivo");
      }
      else if (valor < 0){
         System.out.print("O valor informado é negativo");
      }

      else{
         System.out.print("O valor informado é neutro");
      }

         scanner.close();
   }
}