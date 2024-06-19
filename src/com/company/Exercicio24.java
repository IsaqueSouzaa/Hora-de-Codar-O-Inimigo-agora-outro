package com.company;



public class Exercicio24 {
        public static void main(String[] args) {
            // Itera de 1 até 20
            for (int i = 1; i <= 20; i++) {
                // Imprime o número antes da vírgula
                System.out.print("(" + i + ", ");

                // Calcula o número inicial da sequência
                int startNumber = (i - 1) * 10 + 1;

                // Itera para imprimir os próximos 10 números
                for (int j = startNumber; j < startNumber + 10; j++) {
                    // Imprime o número da sequência
                    System.out.print(j);

                    // Adiciona uma vírgula e espaço entre os números, exceto o último
                    if (j < startNumber + 9) {
                        System.out.print(", ");
                    }
                }

                // Fecha a sequência com uma parêntese
                System.out.println(")");
            }
        }
    }
