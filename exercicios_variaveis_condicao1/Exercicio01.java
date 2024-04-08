package exercicio01;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        System.out.println("Exercício 01");
        
        int num1;
        int num2;
        int numsoma;
        int numsub;
        int nummult;
        int numdiv;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Insira um número");
        num1 = teclado.nextInt();
        System.out.println("Insira outro número");
        num2 = teclado.nextInt();
        
        numsoma = num1 + num2;
        numsub = num1 - num2;
        nummult = num1*num2;
        numdiv = num1/num2;
        
        System.out.println("A soma entre esses números é " + numsoma + ", a subtração entre esses números é " + numsub + ", a multiplicação entre esses números é " + nummult + ", a divisão entre esses números é " + numdiv);
        
    }
    
}
