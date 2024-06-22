package exercicio07_while;

import java.util.Scanner;

public class Exercicio07_while {

    public static void main(String[] args) {
        System.out.println("== Exercicio 07 ==");
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do quadrado (entre 1 e 20): ");
        int lado = scanner.nextInt();

        if (lado >= 1 && lado <= 20) {
            int i = 0;
            while (i < lado) {
                int j = 0;
                while (j < lado) {
                    System.out.print("*");
                    j++;
                }
                System.out.println();
                i++;
            }
        } else {
            System.out.println("Valor inválido");
        }
    }
    
}
