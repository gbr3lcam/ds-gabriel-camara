package exercicio05_while;

import java.util.Scanner;

public class Exercicio05_while {

    public static void main(String[] args) {
            System.out.println("== Exercício 05 ==");
            
            Scanner resposta = new Scanner(System.in);
            
            int cont = 1;
            int max = Integer.MIN_VALUE;
            
            while (cont <=10){
            System.out.print("Digite o " + cont + "° número: ");
            int n = resposta.nextInt();
            
            if (n > max) {
                max = n;
            }
                cont++;
        }
            System.out.println("Maior número: " + max);      
    }
    
}
