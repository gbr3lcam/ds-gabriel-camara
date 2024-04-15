package com.mycompany.exercicio6;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio06 {

    public static void main(String[] args) {
        System.out.println("== Exercício 06 ==");
        
        double kmpl;
        double km;
        double prl;
        double calc1;
        double valor;
        
        Scanner resposta = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        
        System.out.println("\nQual é o consumo de combustível do carro (Km/l)?");
        kmpl = resposta.nextDouble();
        System.out.println("Qual é a distância a ser percorrida (em Km)?");
        km = resposta.nextDouble();
        System.out.println("Qual é o preço unitario do litro por combustível?");
        prl = resposta.nextDouble();
        calc1 = km / kmpl;
        valor = calc1*prl;
        
        System.out.println("\n Custo estimado: R$" + df.format(valor));
    }
}
