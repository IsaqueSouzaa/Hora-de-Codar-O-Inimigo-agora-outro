package com.company;

import  java.util.Scanner;

public class Exercicio20 {

    public static void main(String[] args) {

        //18. A pagar

        //Desenvolva um programa para uma revendedora de carros usados que calcula o salário final de seus funcionários
        // vendedores. O algoritmo deve receber como entrada o número de carros vendidos, o valor total das vendas,
        // o salário fixo mensal do vendedor e a comissão fixa por carro vendido.

        // salário final do vendedor é calculado somando o salário fixo mensal, a comissão fixa por carro vendido e 5%
        // do valor total das vendas realizadas pelo vendedor.

        //Considere que o salário inicial é de R$ 5.000,00.

        //O Programa deve exibir e detalhar cada venda, a comissão e o percentual e exibir o valor final.


        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, informe a quantidade de carros vendidos: ");
        int carros = scanner.nextInt();

        System.out.print("Por favor, informe o valor total das vendas: ");
        double total = scanner.nextDouble();

        System.out.print("Por favor, informe o salario fixo do vendedor: ");
        double fixo = scanner.nextDouble();

        System.out.print("Por favor, informe a comissão fixa por carro vendido(porcentagem): ");
        double comissao= scanner.nextDouble();


        double media= total / carros;

        double salario= ((total / 100) * comissao) + fixo;

        System.out.println("A media por carros vendidos é de " + media + " reais.");

        System.out.println("O salario final do vendedor é de " + salario + "reais.");

        scanner.close();

    }
}