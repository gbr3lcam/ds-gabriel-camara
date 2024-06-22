package exercicio16_for;

public class Exercicio16_for {

    public static void main(String[] args) {
        System.out.println("== Exercício 16 ==");
        
        int once = 0;
        int twice = 1;
        int prox = once + twice;
        
        System.out.print(once + " " + twice + " ");
        
        for (; prox <= 611; prox = once + twice) {
            System.out.print(prox + " ");
            once = twice;
            twice = prox;
        }
        
    }
    
}
