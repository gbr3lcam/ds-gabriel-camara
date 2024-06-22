package exercicio11_for;

import java.util.Scanner;

public class Exercicio11_for {
    
    public static void main(String[] args) {
        System.out.println("== Exercício 11 ==");
        
        Scanner resposta = new Scanner(System.in);
        
        int n;
        
        System.out.println("Contar até: ");
        
        do {  
            
        n = resposta.nextInt();
        
            if (n <= 0) {
                System.out.println("Número inválido, insira outro: ");
            }
            
        } while (n <= 0);
        
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
        
    }
    
}