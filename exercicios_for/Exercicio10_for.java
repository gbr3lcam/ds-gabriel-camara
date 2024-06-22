package exercicio10_for;

import java.util.Scanner;

public class Exercicio10_for {
    
    public static void main(String[] args) {
        System.out.println("== Exercício 10 ==");
        
        Scanner resposta = new Scanner(System.in);
        
        System.out.println("Contar até: ");
        int n = resposta.nextInt();
        
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
        
    }
    
}