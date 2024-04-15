
package com.mycompany.exercicio2;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio02 {

    public static void main(String[] args) {
        System.out.println("== Exercício 02 ==");
        
        double distancia;
        double litros;
        double media;
        
        Scanner resposta = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        
        System.out.println("\nDigite a distância total percorrida (em km): ");
        distancia = resposta.nextDouble();
        System.out.println("Digite o total de combustível gasto (em litros): ");
        litros = resposta.nextDouble();
        
        media = distancia/litros;
        
        System.out.println("\nA média de consumo do seu carro é de: " + df.format(media) + " km/1.");
        
    }
    
}
