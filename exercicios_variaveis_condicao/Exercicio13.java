package com.mycompany.exercicio13;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio13 {

    public static void main(String[] args) {
        System.out.println("== Exercício 13 ==");
        
        String nome;
        String genere;
        double altura;
        double calcimch;
        double calcimcm;
        
        Scanner resposta = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        
        System.out.println("\nQual é o seu nome?");
        nome = resposta.next();
        System.out.println("Qual é a sua altura?");
        altura = resposta.nextFloat();
        System.out.println("Você é homem ou mulher? (insira H para homem ou M para mulher)");
        genere = resposta.next();      
        
        calcimch = (72.7f*altura)-58;
        calcimcm = (62.1*altura)-44.7;
        
        if (genere.equalsIgnoreCase("h")){
            System.out.println("\n" + nome + ", seu peso ideal de acordo com seu IMC é: " + df.format(calcimch) + " Kg");
        } else
            if (genere.equalsIgnoreCase("m"))
            {
                System.out.println("\n" + nome + ", seu peso ideal de acordo com seu IMC é: " + df.format(calcimcm) + " Kg");
            }
            else {
                System.out.println("Valor inválido.");
                return;
            }
    }
}
