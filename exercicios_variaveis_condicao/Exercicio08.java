package com.mycompany.exercicio8;

import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {
        System.out.println("== Exercício 08 ==");
        
        int idade;
        int meses;
        int dias;
        int diasvividos;
        
        Scanner resposta = new Scanner(System.in);
        
        System.out.println("\nQuantos anos você tem?");
        idade = resposta.nextInt();
        
        System.out.println("Em que mês você nasceu? (Escreva em números)");
        meses = resposta.nextInt();
        
        System.out.println("Em que dia você nasceu?");
        dias = resposta.nextInt();
        
        diasvividos = (idade*365) + (meses*30) + dias;
        
        System.out.println("\nSua idade em dias é " + diasvividos + " dias");
    }
}
