package com.mycompany.exercicio4;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio04 {

    public static void main(String[] args) {
        System.out.println("== Exercício 04 ==");
        
        double lado;
        double altura;
        double area;
        
        Scanner resposta = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        
        System.out.println("\nInsira o lado do retângulo");
        lado = resposta.nextDouble();
        System.out.println("Insira a altura do retângulo");
        altura = resposta.nextDouble();
        
        area = lado * altura;
        
        System.out.println("\nA área do retângulo é: " + area);
    }
}
