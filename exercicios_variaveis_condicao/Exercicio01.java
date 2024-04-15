package com.mycompany.exercicio1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio01 {

    public static void main(String[] args) {
        System.out.println("== Exercício 01 ==");
        
        double num1;
        double num2;
        double soma;
        double sub;
        double mult;
        double div;
        
        Scanner resposta = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        
        System.out.println("\nDigite um número");
        num1 = resposta.nextDouble();
        System.out.println("Digite outro número");
        num2 = resposta.nextDouble();
        
        soma = num1 + num2;
        sub = num1 - num2;
        mult = num1 * num2;
        div = num1 / num2;
        
        System.out.println("\nA soma entre esses números é: " + df.format(soma));
        System.out.println("A subtração etnre esses números é: " + df.format(sub));
        System.out.println("A multiplicação entre esses números é: " + df.format(mult));
        System.out.println("A divisão entre esses números é: " + df.format(div));
    }
}
