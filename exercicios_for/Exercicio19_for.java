package exercicio19_for;

import java.util.Scanner;

public class Exercicio19_for {

    public static void main(String[] args) {
        System.out.println("== Exercício 19 ==");
        
        Scanner resposta = new Scanner(System.in);

        int n;
        
        System.out.print("Quantos valores deseja inserir?: ");   
        
        do {  
 
        n = resposta.nextInt();
        
            if (n <= 0 || n > 1000) {
                System.out.println("Número inválido, insira outro: ");
            }
            
        } while (n <= 0 || n > 1000);
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int soma = 0;
        
        for (int i = 1; i <= n; i++) {
            System.out.print("Digite o " + i + "° número: ");
            int num = resposta.nextInt();
            
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
