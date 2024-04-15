package com.mycompany.exercicio01_switchcase;

import java.util.Scanner;

public class Exercicio01_switchcase {

    public static void main(String[] args) {
        System.out.println("== Exercício 01 ==");
        
        Scanner resposta = new Scanner(System.in);

        System.out.println("\nInsira o código do produto");
        int cod = resposta.nextInt();
        
        if (cod == 1) {
            System.out.println("Classificação: Alimento não perecível");
        } else if (cod >= 2 && cod <= 4){
            System.out.println("Classificação: Alimento perecível");
        } else if (cod == 5 || cod == 6){
            System.out.println("Classificação: Vestuário");
        } else if (cod == 7){
            System.out.println("Classificação: Higiene Pessoal");
        } else if (cod >= 8 && cod <= 15) {
            System.out.println("Classificação: Limpeza e Utensílios Domésticos");
        } else {
            System.out.println("Código inválido");
        }
        
        }
}
