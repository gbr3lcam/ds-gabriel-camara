package com.mycompany.exercicio02_switchcase;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio02_switchcase {

    public static void main(String[] args) {
        System.out.println("== Exercício 02 ==");
        
        double nota1;
        double nota2;
        double media;
        
        Scanner resposta = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.#");
        
        System.out.println("\nInsira sua primeira nota");
        nota1 = resposta.nextDouble();
        
        System.out.println("Insira sua segunda nota");
        nota2 = resposta.nextDouble();
        
        media = (nota1+nota2)/2;
        
        if (media >= 0 && media <= 4.0) {
            System.out.println("\nMédia: " + df.format(media));
            System.out.println("Status: Reprovado");
        } else if (media >= 4.1 && media <=7.0) {
            System.out.println("\nMédia: " + df.format(media));
            System.out.println("Status: Exame");
        } else if (media >= 7.1 && media <=10){
            System.out.println("\nMédia: " + df.format(media));
            System.out.println("Status: Aprovado");
        } else {
            System.out.println("Valores inválidos.");
        }
    }
}
