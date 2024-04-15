package com.mycompany.exercicio3;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio03 {

    public static void main(String[] args) {
        System.out.println("== Exercício 3 ==");
        
        String nome;
        double salario;
        double vendas;
        double comissao;
        double salariofinal;
        
        Scanner resposta = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        
        System.out.println("\nQual é o seu nome?");
        nome = resposta.nextLine();
        System.out.println("Qual é o seu salário fixo?");
        salario = resposta.nextDouble();
        System.out.println("Qual é o seu total de vendas efetuadas (em R$)");
        vendas = resposta.nextDouble();
        
        comissao = 0.15 * vendas;
        salariofinal = salario + comissao;
        
        System.out.println("\n" + nome + ", seu salário fixo é de R$" + df.format(salario) + " e seu salário no final do mês será de: " + df.format(salariofinal));
    }
}
