package exercicio13_for;

import java.util.Scanner;

public class Exercicio13_for {

    public static void main(String[] args) {
        System.out.println("== Exercício 13 ==");
        
        Scanner resposta = new Scanner(System.in);     
        
        int mult;
        int n;
        int i;
        
        System.out.println("Tabuada do: ");
        
        do {  
            
        mult = resposta.nextInt();
        
            if (mult <= 0) {
                System.out.println("Número inválido, insira outro: ");
            }
            
        } while (mult <= 0);
        
        for (i = 1; i <= 10; i++) {
            n = mult * i;
            System.out.println(n);
        }
        
    }
    
}