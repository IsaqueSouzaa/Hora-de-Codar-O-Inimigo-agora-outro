package com.company;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        //4 - A Bit of Geometry
        //Considerando a figura abaixo, escreva um programa para cada forma que calcule e exiba em tela cada uma de
        //suas respectivas áreas. O usuário irá informar os valores de cada variável.

        Scanner scanner = new Scanner(System.in);
        int escolha;

        do {
            System.out.println("Escolha a forma que deseja calcular a área: ");
            System.out.println("1. Retângulo");
            System.out.println("2. Quadrado");
            System.out.println("3. Losango");
            System.out.println("4. Trapézio");
            System.out.println("5. Paralelogramo");
            System.out.println("6. Triângulo");
            System.out.println("7. Círculo");
            System.out.println("8. Sair");
            System.out.print("Opção: ");

            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    calcularAreaRetangulo(scanner);
                    break;
                case 2:
                    calcularAreaQuadrado(scanner);
                    break;
                case 3:
                    calcularAreaLosango(scanner);
                    break;
                case 4:
                    calcularAreaTrapezio(scanner);
                    break;
                case 5:
                    calcularAreaParalelogramo(scanner);
                    break;
                case 6:
                    calcularAreaTriangulo(scanner);
                    break;
                case 7:
                    calcularAreaCirculo(scanner);
                    break;
                case 8:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (escolha != 8);

        scanner.close();
    }

    public static void calcularAreaRetangulo(Scanner scanner) {
        System.out.print("Por favor, informe o valor do lado: ");
        double lado = scanner.nextDouble();

        System.out.print("Por favor, informe o valor da altura: ");
        double altura = scanner.nextDouble();

        double area = lado * altura;
        System.out.println("A área do Retângulo é " + area);
    }

    public static void calcularAreaQuadrado(Scanner scanner) {
        System.out.print("Por favor, informe o valor do lado: ");
        double lado= scanner.nextDouble();

        double area= lado * lado;

        System.out.print("A área do quadrado é "+ area);

    }

    public static void calcularAreaLosango(Scanner scanner) {
        System.out.print("Por favor, informe o valor da diagonal maior: ");
        double maior= scanner.nextDouble();

        System.out.print("Por favor, informe o valor da diagonal menor: ");
        double menor= scanner.nextDouble();

        double area= (maior * menor) / 2;

        System.out.print("A área do Losango é " + area);

    }

    public static void calcularAreaTrapezio(Scanner scanner) {
        System.out.print("Por Favor, informe o valor da base maior: ");
        double maior= scanner.nextDouble();

        System.out.print("Por favor, informe o valor da base menor: ");
        double menor= scanner.nextDouble();

        System.out.print("Por favor, informe o valor da altura: ");
        double altura= scanner.nextDouble();

        double area= ((maior + menor) * altura) / 2;

        System.out.print("A área do Trapézio é "+ area);

    }

    public static void calcularAreaParalelogramo(Scanner scanner) {
        System.out.print("Por favor, informe o valor da base: ");
        double base= scanner.nextDouble();

        System.out.print("Por favor, informe o valor da altura: ");
        double altura= scanner.nextDouble();

        double area= base * altura;

        System.out.print("A área do paralelogramo é " + area );

    }

    public static void calcularAreaTriangulo(Scanner scanner) {
        System.out.print("Por favor, informe o valor da base: ");
        double base= scanner.nextDouble();

        System.out.print("Por favor, informe o valor da altura: ");
        double altura= scanner.nextDouble();

        double area= (base * altura) / 2;

        System.out.print("A área do triangulo é " + area);

    }

    public static void calcularAreaCirculo(Scanner scanner) {
        System.out.print("Por favor, informe o valor do raio: ");
        double raio= scanner.nextDouble();

        double pi= 3.14;

        double area= (raio * raio) * pi;

        System.out.print("A área do circulo é " + area);

    }
}



