package exercicio05_array;

import java.util.Scanner;

public class Exercicio05_array {

    public static void main(String[] args) {
        System.out.println("== Exercício 5 ==");
        
        Scanner resposta = new Scanner(System.in);
        
        int[][] matriz = new int[4][4];
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Valor para a posição " + i + ", " + j + ": ");
                matriz[i][j] = resposta.nextInt();
            }
        }
        
        System.out.print("Qual valor você procura? ");
        int procura = resposta.nextInt();
        
        boolean find = false;
        int linha = -1;
        int coluna = -1;
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matriz[i][j] == procura) {
                    find = true;
                    linha = i;
                    coluna = j;
                    break;
                }
            }
            if (find) {
                break;
            }
        }
        
        if (find) {
            System.out.println("posição: [" + linha + "][" + coluna + "]");
        } else {
            System.out.println("não encontrado na matriz");
        }
        
    }
}