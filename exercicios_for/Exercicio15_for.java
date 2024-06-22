package exercicio15_for;

import java.util.Scanner;

public class Exercicio15_for {

    public static void main(String[] args) {
        System.out.println("== Exercício 15 ==");
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Fibonacci generator");
        System.out.print("contar até o número de posição: ");
        int n = scanner.nextInt();
        
        int once = 0;
        int twice = 1;
        int prox;
        
        System.out.println("Número de " + n + "° posição:");
        
        System.out.print(once + " " + twice + " ");
        
        for (int i = 3; i <= n; i++) {
            prox = once + twice;
            System.out.print(prox + " ");
            once = twice;
            twice = prox;
        }
        
    }
    
}