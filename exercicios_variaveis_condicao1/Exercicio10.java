package com.mycompany.exercicio10;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio10 {

    public static void main(String[] args) {
        System.out.println("== Exercí­cio 10 ==");
        
        double salario;
        double reajuste;
        double reajustecalc;
        double salariofinal;
        
        Scanner resposta = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        
        System.out.println("\nQual é o seu salário?");
        salario = resposta.nextDouble();
        System.out.println("Qual é o seu percentual de reajuste?");
        reajuste = resposta.nextDouble();
        
        reajustecalc = salario*(reajuste/100);
        salariofinal = salario + reajustecalc;
        
        System.out.println("\nSeu novo salário é: R$" + df.format(salariofinal));
    }
}
