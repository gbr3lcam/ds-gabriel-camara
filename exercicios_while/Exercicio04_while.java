package com.mycompany.exercicio04_while;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio04_while {

    public static void main(String[] args) {
        System.out.println("== Exercício 04 ==");
        
        int alunos;
        int num = 1;
        double nota1;
        double nota2;
        double media;
        
        Scanner resposta = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        
        System.out.println("\nQuantos alunos tem na sala?");
        alunos = resposta.nextInt();
        
        while (num <= alunos){
            System.out.println("\nInsira a primeira nota do aluno");
            nota1 = resposta.nextDouble();
            System.out.println("Insira a segunda nota do aluno");
            nota2 = resposta.nextDouble();
            media = (nota1+nota2)/2; 
            if (media >= 0 && media <=10){
                System.out.println("A média desse aluno é: " + df.format(media));
            } else {
                System.out.println("Notas inválidas, impossíel calcular média");
            } num++;
        }  
    }
}
