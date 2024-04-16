package com.mycompany.exercicio01_switchcase;

import java.util.Scanner;

public class Exercicio01_switchcase {

    public static void main(String[] args) {
        System.out.println("== Exercício 01 ==");
        
        Scanner resposta = new Scanner(System.in);

        System.out.println("\nInsira o código do produto");
        int cod = resposta.nextInt();
        
        switch (cod) {
            case 1:
                System.out.println("Classificação: Alimento não-perecível");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("Classificação: Alimento perecível");
                break;
            case 5:
            case 6:
                System.out.println("Classificação: Vestuário");
                break;
            case 7:
                System.out.println("Classificação: Higiene Pessoal");
                break;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                System.out.println("Classificação: Limpeza e Utensílios Domésticos");
                break;
            default:
                System.out.println("Código inválido");
        }
        
        }
}
