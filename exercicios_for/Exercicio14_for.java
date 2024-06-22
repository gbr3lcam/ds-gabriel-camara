package exercicio14_for;

public class Exercicio14_for {

    public static void main(String[] args) {
        System.out.println("== Exercício 14 ==");
        
        int A = 80000;
        int B = 200000;
        double porA = 0.03;
        double porB = 0.015;
        
        int anos;
        
        for (anos = 0; A <= B; anos++) {
            A += (int) (A * porA);
            B += (int) (B * porB);
        }
        
        System.out.println("Anos necessários: " + anos);
    }
    
}