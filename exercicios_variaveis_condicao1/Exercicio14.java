package com.mycompany.exercicio14;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio14 {

    public static void main(String[] args) {
        System.out.println("== Exercício 14 ==");
        
        String combustivel;
        int litros;
        double valortotal = 0;
        
        Scanner resposta = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
            
        System.out.println("\nQuantos litros você vai abastecer?");
        litros = resposta.nextInt();
        resposta.nextLine();
        System.out.println("Qual é o tipo de combustível? (A para álcool e G para gasolina)");
        combustivel = resposta.nextLine();
        
        if (combustivel.equalsIgnoreCase("a") && litros<=20){
            valortotal = litros * (2.90 - (2.90*0.03));
        } else if (combustivel.equalsIgnoreCase("a") && litros>20){
            valortotal = litros * (2.90 - (2.90*0.05));
        } else if (combustivel.equalsIgnoreCase("g") && litros<=20){
            valortotal = litros * (3.30 - (3.30*0.04));
        } else if (combustivel.equalsIgnoreCase("g") && litros>20){
            valortotal = litros * (3.30 - (3.30*0.06));
        } else {
            System.out.println("Tipo de combustível inválido.");
            return;
        }
        
        System.out.println("\nValor a ser pago: R$" + df.format(valortotal));
    }
}
