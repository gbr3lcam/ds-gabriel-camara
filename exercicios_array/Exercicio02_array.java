package exercicio02_array;

import java.util.Scanner;

public class Exercicio02_array {

    public static void main(String[] args) {
        System.out.println("== Exercício 2 ==");
        
        Scanner resposta = new Scanner(System.in);
        
        int[] vetor = new int[10];
        
        System.out.println("Insira os 10 valores do vetor");
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            vetor[i] = resposta.nextInt();
        }
        
        System.out.print("Qual número você procura? ");
        int num = resposta.nextInt();
        
        int posicao = -1;
        
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == num) {
                posicao = i;
                break;
            }
        }
        
        if (posicao != -1) {
            System.out.println("Posição: " + posicao);
        } else {
            System.out.println("Número não encontrado no vetor.");
        }
        
    }
}
