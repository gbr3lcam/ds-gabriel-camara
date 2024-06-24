package exercicio03_array;

import java.util.Scanner;

public class Exercicio03_array {

    public static void main(String[] args) {
        System.out.println("== Exercício 3 ==");
        
        Scanner resposta = new Scanner(System.in);
        
        int[] vetor = new int[6];
        int aux;
        
        System.out.println("Insira os 6 valores do vetor: ");
        
        for (int i = 0; i < 6; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            vetor[i] = resposta.nextInt();
        }
        
        for (int i = 0; i < vetor.length / 2; i++) {
            aux = vetor[i];
            vetor[i] = vetor[vetor.length - 1 - i];
            vetor[vetor.length - 1 - i] = aux;
        }
        
        System.out.print("Vetores invertidos: ");
        for (int i = 0; i < 6; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
        
    }
}