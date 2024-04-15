package com.mycompany.exercicio7;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {
        System.out.println("== Exercício 07 ==");
        
        int num;
        int numsub;
        
        Scanner resposta = new Scanner(System.in);
        
        System.out.println("\nInsira um número");
        num = resposta.nextInt();
        
        numsub = num - 1;
        
        System.out.println("O número antecessor a esse é " + numsub);
        
    }
}
