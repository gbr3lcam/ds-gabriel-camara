package exercicio04_array;

import java.util.Scanner;

public class Exercicio04_array {

    public static void main(String[] args) {
        System.out.println("== Exercício 4 ==");
        
        Scanner resposta = new Scanner(System.in);
        
        int[][] matriz = new int[4][4];
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Valor para a posição " + i + ", " + j + ": ");
                matriz[i][j] = resposta.nextInt();
            }
        }
        
        int min = matriz[0][0];
        int max = matriz[0][0];
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matriz[i][j] < min) {
                    min = matriz[i][j];
                }
                if (matriz[i][j] > max) {
                    max = matriz[i][j];
                }
            }
        }
        
        System.out.println("menor valor: " + min);
        System.out.println("maior valor: " + max);
        
    }
}
