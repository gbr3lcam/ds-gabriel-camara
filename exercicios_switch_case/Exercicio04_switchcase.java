package com.mycompany.exercicio04_switchcase;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio04_switchcase {

    public static void main(String[] args) {
        System.out.println("== Exercício 04 ==");
        
        int cod;
        int quant;
        double preco = 0;
        
        Scanner resposta = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        
        System.out.println("\nCardápio:\n100 - Cachorro quente (R$1,70)\n101 - Bauru simples (R$2,30)\n102 - Bauru com ovo (R$2,60)\n103 - Hamburguer (R$2,40)\n104 - Cheeseburguer (R$2,50)\n105 - Refrigerante (R$1,00)");
        System.out.println("\nInsira o código do seu pedido");
        cod = resposta.nextInt();
        System.out.println("Insira a quantidade");
        quant = resposta.nextInt();
        
        
        switch (cod){
            case 100:
                preco = (double) quant*1.70;
            System.out.println("\nValor total: R$" + df.format(preco));
                break;
            case 101:
                preco = (double) quant*2.30;
            System.out.println("\nValor total: R$" + df.format(preco));
                break;
            case 102:
                preco = (double) quant*2.60;
            System.out.println("\nValor total: R$" + df.format(preco));
                break;
            case 103:
                preco = (double) quant*2.40;
            System.out.println("\nValor total: R$" + df.format(preco));
                break;
            case 104:
                preco = (double) quant*2.50;
            System.out.println("\nValor total: R$" + df.format(preco));
                break;
            case 105:
                preco = quant*1;
            System.out.println("\nValor total: R$" + df.format(preco));
                break;
            default:
                System.out.println("\nCódigo inválido");               
        }
    }
}
