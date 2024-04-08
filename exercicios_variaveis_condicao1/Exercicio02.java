package exercicio02;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        System.out.println("Exercícios 02");
        
        int distancia;
        int litros;
        int media;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Qual a distância que você percorreu com o seu carro? (em Km)");
        distancia = teclado.nextInt();
        System.out.println("Quantos litros você usou na viagem ");
        litros = teclado.nextInt();
        
        media = distancia/litros;
        
        System.out.println("A média de consumo do seu carro é (aproximadamente): " + media);
        
    }
    
}
