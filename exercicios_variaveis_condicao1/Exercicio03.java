package exercicio03;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        System.out.println("Exercício 3");
        
        String nome;
        int salario;
        int vendas;
        float comissao;
        float salariofinal;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Qual é o seu nome?");
        nome = teclado.nextLine();
        System.out.println("Qual é o seu salário fixo?");
        salario = teclado.nextInt();
        System.out.println("Quanto você vendeu no Mês? (em dinheiro)");
        vendas = teclado.nextInt();
        
        comissao = (vendas*15)/100;
        salariofinal = salario + comissao;
        
        System.out.println(nome + ", Seu salário fixo é de R$" + salario + ",00 e seu salário no final do mês será de: " + salariofinal);
    }
    
}
