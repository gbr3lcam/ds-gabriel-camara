package exercicio18_for;

import java.util.Scanner;

public class Exercicio18_for {

    public static void main(String[] args) {
        System.out.println("== Exercício 18 ==");
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Quantos valores deseja inserir?: ");
        int n = scanner.nextInt();
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int soma = 0;
        
        for (int i = 1; i <= n; i++) {
            System.out.print("Digite o " + i + "° número: ");
            int num = scanner.nextInt();
            
            if (num < min) {
                min = num;
            }
            
            if (num > max) {
                max = num;
            }
            
            soma += num;
        }
      
        System.out.println("Menor valor: " + min);
        System.out.println("Maior valor: " + max);
        System.out.println("Soma dos valores: " + soma);
        
    }
   
}