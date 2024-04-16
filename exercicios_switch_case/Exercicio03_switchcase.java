package com.mycompany.exercicio03_switchcase;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio03_switchcase {

    public static void main(String[] args) {
        System.out.println("== Exercício 03 ==");
        
        double num1;
        double num2;
        int opt;
        double calc = 0;
        
        Scanner resposta = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        
        System.out.println("\nInsira um número");
        num1 = resposta.nextDouble();
        System.out.println("Insira outro número");
        num2 = resposta.nextDouble();
        System.out.println("O que você quer fazer com esses números?\n1 - Calcular a média\n2 - Calcular a diferença\n3 - Calcular o produto\n4 - Calcular a divisão");
        opt = resposta.nextInt();
        
        switch (opt) {
            case 1:
                calc = (num1+num2)/2;
            System.out.println("\nMédia: " + df.format(calc));
                break;
            case 2:
                calc = num1-num2;
            System.out.println("\nDiferença: " + df.format(calc));
                break;
            case 3:
                calc = num1*num2;
            System.out.println("\nProduto: " + df.format(calc));
                break;
            case 4:
                calc = num1/num2;
            System.out.println("\nDivisão: " + df.format(calc));
                break;
            default:
                System.out.println("\nOpção inválida");
        }
    }
}
