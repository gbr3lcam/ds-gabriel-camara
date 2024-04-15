package com.mycompany.exercicio12;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio12 {

    public static void main(String[] args) {
        System.out.println("== Exercício 12 ==");
        
        double salario;
        double comissao;
        double quantcarros;
        double valorcarros;
        double calcvalorcarro;
        double valorcomissao;
        double salariofinal;
        
        Scanner resposta = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        
        System.out.println("\nQual é o seu salário?");
        salario = resposta.nextFloat();
        System.out.println("Qual o valor da sua comissão?");
        comissao = resposta.nextFloat();
        System.out.println("Quantos carros você vendeu esse mês?");
        quantcarros = resposta.nextFloat();
        System.out.println("Qual é o valor das suas vendas?");
        valorcarros = resposta.nextFloat();
        
        calcvalorcarro = 0.05*valorcarros;
        valorcomissao = comissao*quantcarros;
        salariofinal = salario+valorcomissao+calcvalorcarro;
        
        System.out.println("\nO seu salário final é: R$" + df.format(salariofinal));
    }
}
