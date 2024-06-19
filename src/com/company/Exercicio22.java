package com.company;

import java.util.Scanner;

public class Exercicio22 {

    public static void main(String[] args){

        //20. CPF na nota?
                //Faça um programa para ler:

        //O nome do produto,
                //A quantidade adquirida do produto,
               // O preço unitário do produto.

                //Agora o programa deve calcular e escrever:

        //O valor da venda (valor da venda = quantidade adquirida * preço unitário),
        //O percentual de desconto,
        //O valor fixo de imposto que é 20%.
       // O total a pagar (total a pagar = valor da venda - desconto).

        //Sabendo-se que:

        //Se quantidade <= 5 o desconto será de 2%

                        //Se quantidade > 5 e quantidade <=10 o desconto será de 3%

                        //Se quantidade > 10 o desconto será de 5%

                //No fim, escreva um recibo que detalhe a compra como uma nota fiscal.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, informe o nome do produto: ");
        String nome= scanner.nextLine();

        System.out.print("Por favor, informe a quantidade adquirida do produto: ");
        double quantidade= scanner.nextDouble();

        System.out.print("Por favor, informe o preço unitário do produto: ");
        double preco= scanner.nextDouble();

        double venda= quantidade * preco;

        System.out.println("O valor da venda foi de " + venda + " reais");

        double desconto;

        if(quantidade <= 5){

            desconto = (preco / 100) * 2;
        }

        else if (quantidade > 5 || quantidade <= 10){

            desconto = (preco / 100) * 3;
        }

        else {
            desconto = (preco / 100) * 5;
        }

        double imposto = (preco / 100) * 20;


        double descontoTotal = desconto - preco;

        double total = imposto + preco - descontoTotal;


        System.out.println("O desconto foi de " + desconto + "%");

        System.out.println("O imposto cobrado foi de " + imposto + " reais");

        System.out.println("O total a ser pago é de " + total + " reais");

        scanner.close();



    }
}
