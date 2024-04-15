package com.mycompany.exercicio01_while;

public class Exercicio01_while {

    public static void main(String[] args) {
        System.out.println("== Exercício 01 ==");
        
        int num = 1;

        System.out.println("\nTodos os números ímpares de 1 a 100:");

        while (num <= 100) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
            num++;
        }
    }
}