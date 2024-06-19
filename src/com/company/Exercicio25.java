package com.company;

public class Exercicio25 {

    public static void main(String[] args){

        //23. Não Conta comigo
        //Escreva um algoritmo que imprima as seguintes seqüências de números:

        //(1, 1 2 3 4 5 6 7 8 9 10)
        //(2, 1 2 3 4 5 6 7 8 9 10)
        //(3, 1 2 3 4 5 6 7 8 9 10)


       // E assim sucessivamente, até que o primeiro número (antes da vírgula), também chegue a 20.


            // Itera de 1 até 20
            for (int i = 1; i <= 20; i++) {
                // Imprime o número antes da vírgula
                System.out.print("(" + i + ", ");

                // Itera para imprimir os números de 1 a 10
                for (int j = 1; j <= 10; j++) {
                    // Imprime o número da sequência
                    System.out.print(j);

                    // Adiciona um espaço entre os números, exceto o último
                    if (j < 10) {
                        System.out.print(" ");
                    }
                }

                // Fecha a sequência com um parêntese
                System.out.println(")");
            }
        }
    }