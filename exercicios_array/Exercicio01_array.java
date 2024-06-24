package exercicio01_array;

import java.util.Scanner;

public class Exercicio01_array {

    public static void main(String[] args) {
        System.out.println("== Exercício 1 ==");
        
        Scanner resposta = new Scanner(System.in);
        
        int[] vetor = new int[10];
        
        System.out.println("Insira os 10 valores do vetor");
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            vetor[i] = resposta.nextInt();
        }
        
        int min = vetor[0];
        
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < min) {
                min = vetor[i];
            }
        }
        
        System.out.println("Menor valor: " + min);
        
    }
}
