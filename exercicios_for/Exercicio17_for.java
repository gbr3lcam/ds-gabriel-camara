package exercicio17_for;

import java.util.Scanner;

public class Exercicio17_for {

    public static void main(String[] args) {
        System.out.println("== Exercício 17 ==");
        
        Scanner scanner = new Scanner(System.in);
        
        int fato = 1;
        
        System.out.println("Calcular fatorial do número: ");
        int n = scanner.nextInt();
        
        for (int i = 1; i <= n; i++) {
            fato *= i;
        }
        
        System.out.println("Resultado: " + fato);
        
    }
    
}
