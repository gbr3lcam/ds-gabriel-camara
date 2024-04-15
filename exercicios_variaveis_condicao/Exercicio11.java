package com.mycompany.exercicio11;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio11 {

    public static void main(String[] args) {
        System.out.println("== Exercício 11 ==");
        
        double ccarro;
        double cfabrica;
        double cdistr;
        double cimp;
        
        Scanner resposta = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        
        System.out.println("\nQual é o custo de fábrica do carro?");
        cfabrica = resposta.nextDouble();
        
        cdistr = 0.28*cfabrica;
        cimp = 0.45*cfabrica;
        ccarro = cfabrica + cimp + cdistr;
        
        System.out.printf("\nCusto final do carro: R$" + df.format(ccarro));
    }
}
