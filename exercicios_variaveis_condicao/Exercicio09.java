package com.mycompany.exercicio9;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio09 {

    public static void main(String[] args) {
        System.out.println("== Exeecício 09 ==");
        
        int brancos;
        int nulos;
        int validos;
        int eleitores;
        double porBrancos;
        double porNulos;
        double porValidos;
        
        Scanner resposta = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        
        System.out.println("\nQuantos são os votos brancos?");
        brancos = resposta.nextInt();
        System.out.println("Quantos são os votos nulos");
        nulos = resposta.nextInt();
        System.out.println("Quantos são os votos válidos");
        validos = resposta.nextInt();
        
        eleitores = brancos + nulos + validos;
        porBrancos = ((double)brancos/eleitores)*100;
        porNulos = ((double)nulos/eleitores)*100;
        porValidos = ((double)validos/eleitores)*100;
        
        System.out.println("\nTotal de eleitores do seu município: " + df.format(eleitores));
        System.out.println(df.format(porBrancos) + "% desses votos são brancos");
        System.out.println(df.format(porNulos) + "% desses votos são nulos");
        System.out.println(df.format(porValidos) + "% desses votos são válidos");

    }
}
