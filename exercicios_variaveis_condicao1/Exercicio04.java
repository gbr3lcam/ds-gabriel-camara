package exercicio04;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        System.out.println("Exercício 4");
        
        int lado;
        int altura;
        int area;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Insira o lado do retângulo");
        lado = teclado.nextInt();
        System.out.println("Insira a altura do retângulo");
        altura = teclado.nextInt();
        
        area = lado * altura;
        
        System.out.println("A área do retângulo é " + area);
    }
    
}
