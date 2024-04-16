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
        
        switch ((int) media) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("\nMédia: " + df.format(media));
            System.out.println("Status: Reprovado");
                break;
            case 5:
            case 6:
            case 7:
                System.out.println("\nMédia: " + df.format(media));
            System.out.println("Status: Exame");
                break;
            case 8:
            case 9:
            case 10:
                System.out.println("\nMédia: " + df.format(media));
            System.out.println("Status: Aprovado");
                break;
            default:
                System.out.println("Valores inválidos.");
        }
    }
}
