package com.company;

import java.util.Scanner;

public class Exercicio26 {

    public static void main(String[] args){

        Scanner scanner= new Scanner(System.in);

        //24. Jornada de trabalho
        //A jornada de trabalho semanal de um funcionário é de 40 horas.
            //O funcionário que trabalhar mais de 40 horas receberá hora extra,
        //cujo cálculo é o valor da hora regular com um acréscimo de 50%.

        //Escreva um programa que leia o número de horas trabalhadas em um mês,
                //o salário por hora e escreva o salário total do funcionário,
                //que deverá ser acrescido das horas extras, caso tenham sido trabalhadas
                //(considere que o mês possua 4 semanas exatas)

        System.out.print("Por favor, informe o salario do funcionario:");
        double salario= scanner.nextDouble();

        System.out.print("Por favor, informe a horas trabalhadas:");
        double semanal= scanner.nextDouble();

        double hora_extra = semanal - 160;

        double salario_hora= (salario/30)/8;

         double extra = (salario_hora / 100) * 50;


        if( hora_extra > 0 ){

            double total= salario + (extra * hora_extra);
            System.out.print("O funcionario tem " + hora_extra + " de hora extra na casa, " + "total a receber: " + total);
        }

        else{
            System.out.print("O funcionario é preguiçoso e não tem hora extra");
        }
    }
}
