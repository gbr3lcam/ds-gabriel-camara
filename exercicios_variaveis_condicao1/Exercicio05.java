package com.mycompany.exercicio5;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        System.out.println("== Exercício 05 ==");
        
        int numa;
        int numb;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("\nInsira o número A:");
        numa = teclado.nextInt();
        System.out.println("Insira o número B:");
        numb = teclado.nextInt();
        
        int troca = numa;
        numa = numb;
        numb = troca;
        
        System.out.println("\nNúmero A = " + numa);
        System.out.println("Número B = " + numb);
    }
}
