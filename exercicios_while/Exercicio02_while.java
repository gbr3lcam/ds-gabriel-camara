package com.mycompany.exercicio02_while;

public class Exercicio02_while {

    public static void main(String[] args) {
        System.out.println("== Exercício 02 ==");
        
        int num = 2;

        System.out.println("\nTodos os números pares de 1 a 100:");

        while (num <= 100) {
            System.out.println(num);
            num += 2;
        }
    }
}
