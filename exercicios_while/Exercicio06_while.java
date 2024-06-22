package exercicio06_while;

import java.util.Scanner;

public class Exercicio06_while {

    public static void main(String[] args) {
            System.out.println("== Exercício 05 ==");
            
            Scanner resposta = new Scanner(System.in);
            
            int cont = 1;
            int max1 = Integer.MIN_VALUE;
            int max2 = Integer.MIN_VALUE;
            
            while (cont <=10){
            System.out.print("Digite o " + cont + "° número: ");
            int n = resposta.nextInt();
            
            if (n > max1) {
                max2 = max1;
                max1 = n;
            } else if (n > max2){
                max2 = n;
            }
                cont++;
        }
            System.out.println("Primeiro maior número: " + max1);      
            System.out.println("Segundo maior número: " + max2);      
    }
    
}
