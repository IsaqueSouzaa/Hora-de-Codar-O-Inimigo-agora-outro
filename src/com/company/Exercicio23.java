package com.company;

import  java.util.Scanner;

public class Exercicio23 {

    public  static void main (String[] args){

        //21. Descanso merecido
        //Uma empresa quer verificar se um empregado está qualificado para a aposentadoria ou não. Para estar em condições,
        //um dos seguintes requisitos deve ser satisfeito:

        //- Ter no mínimo 65 anos de idade.
                //- Ter trabalhado no mínimo 30 anos.
                //- Ter no mínimo 60 anos e ter trabalhado no mínimo 25 anos.

              //  Com base nas informações acima, faça um algoritmo que leia: o número do empregado (código), o ano de
        //  seu nascimento e o ano de seu ingresso na empresa. O programa deverá escrever a idade e o tempo de trabalho
        //  do empregado e a mensagem 'Requerer aposentadoria' ou 'Não requerer'. 1964 1997

        Scanner scanner = new Scanner(System.in);

       System.out.print("Por favor, informe o numero do empregado: ");
       int id= scanner.nextInt();

       System.out.print("Por favor, informe o ano de nascimento do empregado: ");
       int nascimento= scanner.nextInt();

       System.out.print("Por favor, informe o ano que o funcionario ingressou na empresa: ");
       int ingressou= scanner.nextInt();

       int idade = 2024 - nascimento;

       int casa = 2024 - ingressou;

        System.out.print("idade" + idade);
        System.out.println("casa" + casa);


        if( idade >=60 && casa >=25) {
            System.out.print("Requerer aponsetadoria");
        }
      else if (idade < 65 && casa < 30 ){

           System.out.print("Não quererer");
       }

       else if( idade < 60 && casa < 25){
           System.out.print("Não requerer");
       }

       else {
               System.out.print("Requerer aponsetadoria");
                   }


            scanner.close();
    }
}
