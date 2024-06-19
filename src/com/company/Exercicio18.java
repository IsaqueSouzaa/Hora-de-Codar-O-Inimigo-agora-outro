package com.company;

import java.util.Scanner;

public class Exercicio18 {

    public static void main (String[] args){

        //16. O Voto é secreto
        //Escreva um programa para ler:

       //o número total de eleitores de um município.

        //Agora o programa deve receber a quantindade (percentual):

       //o número de votos brancos;
       // o número de votos válidos;
        //o número de votos nulos.
        // Por fim, o programa vai calcular e escrever a quantidade de votos que cada categoria (brancos, nulos e válidos) representa em relação ao total
        //de eleitores.

       Scanner scanner = new Scanner(System.in);

       System.out.print("Por favor, informe a quantidade de eleitores : ");
       int eleitores= scanner.nextInt();

       System.out.print("Por favor informe a quantidade de votos brancos (porcentagem): ");
       double brancos= scanner.nextInt();

       System.out.print("Por favor, informe a quantidade de votos validos (porcentagem)");
       double validos= scanner.nextInt();

       System.out.print("Por favor, informe a quantidade de votos nulos (porcentagem): ");
       double nulos= scanner.nextInt();

       double tBrancos= ( brancos / 100) * eleitores;

       double tValidos= (validos / 100) * eleitores;

       double tNulos= ( nulos / 100) * eleitores;

       System.out.println("O total de pessoas que votaram em branco foram: " + (int)tBrancos);

       System.out.println("O total de pessoas que votaram em válido foram: " + (int) tValidos);

       System.out.println("O total de pessoas que votaram em nulo foram: " + (int) tNulos );

       scanner.close();

    }
}
