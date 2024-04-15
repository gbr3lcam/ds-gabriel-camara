package com.mycompany.exercicio03_while;

import java.util.Scanner;

public class Exercicio03_while {

    public static void main(String[] args) {
        System.out.println("== Exercício 03 ==");
        
        int num;
        int impar = 1;
        int par = 2;
        
        Scanner resposta = new Scanner(System.in);
        
        System.out.println("\nInsira um número maior que 1");
        num = resposta.nextInt();
        
        System.out.println("\nTodos os números ímpares de 1 a " + num +":");

        while (impar <= num) {
            if (impar % 2 != 0) {
                System.out.println(impar);
            }
            impar++;
        }
        
        System.out.println("\nTodos os números pares de 1 a " + num + ":");
        while (par <= num) {
            System.out.println(par);
            par += 2;
        }
    }
}