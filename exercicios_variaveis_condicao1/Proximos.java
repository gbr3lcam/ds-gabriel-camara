package proximos;

import java.util.Scanner;

public class Proximos {

    //esses são os exercícios que foram passados na primeira aula, percebi que eles foram repetidos, mas não foram formatados corretamente no arquivo word, então, esses são os exercícios que vem depois do 4 no último arquivo de exerícios de variaveis que você passou
    
    public static void main(String[] args) {
       System.out.println("Exercí­cio 1");
        
        int alt;
        int lado;
        int calcret;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Qual é a altura do retângulo?");
        alt = teclado.nextInt();
        System.out.println("Qual é o lado do retângulo?");
        lado = teclado.nextInt();
        
        calcret = lado*alt;
        
        System.out.println("A área do retângulo é: " + calcret);
        
        System.out.println("Exercí­cio 2");
        
        int numa;
        int numb;
        
        System.out.println("Insira o número A:");
        numa = teclado.nextInt();
        System.out.println("Insira o número B:");
        numb = teclado.nextInt();
        
        int troca = numa;
        numa = numb;
        
        System.out.println("Número A = " + numb + "Número B = " + troca);
        
        System.out.println("Exercí­cio 3");
        
        double kmpl;
        double km;
        float prl;
        double calc1;
        double valor;
        
        System.out.println("quilometros por litro: ");
        kmpl = teclado.nextDouble();
        System.out.println("distancia a ser percorrida (em km):");
        km = teclado.nextDouble();
        System.out.println("preço unitario do litro por combustivel");
        prl = teclado.nextFloat();
        calc1 = km / kmpl;
        valor = calc1*prl;
        
        
        System.out.printf("você vai usar = %.2f e você vai gastar = %.2f %n ", calc1,valor);
        //System.out.printf("vocÃª vai gastar = %.2f %n", valor);
        
        /** 
         * proximo exercÃ­cio
         */
        
        System.out.println("Exercí­cio 4");
        
        int num;
        int numsub;
        
        System.out.println("insira um numero");
        num = teclado.nextInt();
        
        numsub = num - 1;
        
        System.out.println("o numero antecessor e " + numsub);
        
        /** 
         * proximo exercÃ­cio
         */
        
        System.out.println("Exercí­cio 5");
        
        //perguntar pro professor se tem que ser baseado no dia de hj
        
        int ano;
        int meses;
        int dias;
        int idade;
        int anoemdias;
        int mesesemdias;
        int diasvividos;
        
        System.out.println("em que ano voce nasceu");
        ano = teclado.nextInt();
        
        System.out.println("em que mes voce nasceu (escreva em numeros)");
        meses = teclado.nextInt();
        
        System.out.println("em que dia voce nasceu");
        dias = teclado.nextInt();
        
        idade = 2024 - ano;
        anoemdias = idade*365;
        mesesemdias = meses*30;
        diasvividos = anoemdias + mesesemdias + dias;
        
        System.out.println("voce viveu aproximadamente " + diasvividos + " dias ");
        
        //proximo exercicio
        
        System.out.println("-- Exercí­cio 6 --");
        
        float brancos;
        float nulos;
        float validos;
        float eleitores;
        float porBrancos;
        float porNulos;
        float porValidos;
        
        System.out.println("Quantos são os votos brancos?");
        brancos = teclado.nextFloat();
        System.out.println("Quantos são os votos nulos");
        nulos = teclado.nextFloat();
        System.out.println("Quantos são os votos válidos");
        validos = teclado.nextFloat();
        
        eleitores = brancos + nulos + validos;
        porBrancos = (brancos/eleitores)*100;
        porNulos = (nulos/eleitores)*100;
        porValidos = (validos/eleitores)*100;
        
        System.out.println("Total de eleitores do seu município: %.2f %" + eleitores);
        System.out.println("Porcentagem de votos brancos: %.2f %" + porBrancos);
        System.out.println("Porcentagem de votos nulos: %.2f %" + porNulos);
        System.out.println("Porcentagem de votos válidos: %.2f %" + porValidos);

        // formula descobrir porcentagem em relaÃ§ao ao valor total % = (100/300)*100
        // prox exercicio
        
        System.out.println("-- Exercí­cio 7 --");
        
        float salario;
        float reajuste;
        float reajustecalc;
        float salariofinal;
        
        System.out.println("Qual é o seu salário?");
        salario = teclado.nextInt();
        System.out.println("Qual é o percentual de reajuste");
        reajuste = teclado.nextFloat();
        
        reajustecalc = (salario*reajuste)/100;
        salariofinal = salario + reajustecalc;
        
        System.out.println("O salário reajustado é: " + salariofinal);
        
        //prox exercicio
        
        System.out.println("-- Exercí­cio 8 --");
        
        float ccarro;
        float cfabrica;
        float cdistr;
        float cimp;
        
        System.out.println("Qual é o custo de fábrica do carro?");
        cfabrica = teclado.nextFloat();
        
        cdistr = (28*cfabrica)/100;
        System.out.println(cdistr);
        cimp = (45*cfabrica)/100;
        System.out.println(cimp);
        ccarro = cfabrica + cimp + cdistr;
        
        System.out.printf("Custo final do carro: " + ccarro);
        
        //prox exercicio
        
        System.out.println("-- Exercí­cio 9(a) --");
        
        float salario9;
        float comissao;
        float quantcarros;
        float valorcarros;
        float calcvalorcarro;
        float valorcomissao;
        float salario9final;
        
        System.out.println("Qual é o seu salário?");
        salario9 = teclado.nextFloat();
        System.out.println("Qual o valor da sua comissão?");
        comissao = teclado.nextFloat();
        System.out.println("Quantos carros você vendeu esse mês?");
        quantcarros = teclado.nextFloat();
        System.out.println("Quanto você vendeu esse mês?");
        valorcarros = teclado.nextFloat();
        
        calcvalorcarro = (5*valorcarros)/100;
        valorcomissao = comissao*quantcarros;
        salario9final = salario9+valorcomissao+calcvalorcarro;
        
        System.out.println("O seu salário final é de:" + salario9final);
        
        //prox exercicio
        
        System.out.println("-- Exercí­cio 9(b) --");
        
        String nome;
        String genere;
        float altura;
        double calcimch;
        double calcimcm;
        
        System.out.println("Qual é o seu nome");
        nome = teclado.next();
        System.out.println("Você é homem ou mulher (insira H para homem ou M para mulher)");
        genere = teclado.next();
        System.out.println("Qual é a sua altura");
        altura = teclado.nextFloat();
        
        calcimch = (72.7f*altura)-58;
        calcimcm = (62.1*altura)-44.7;
        
        if (genere.equalsIgnoreCase("h")){
            System.out.println(nome + ", seu peso ideal de acordo com seu IMC é: " + calcimch);
        } else
            if (genere.equalsIgnoreCase("m"))
            {
                System.out.println(nome + ", seu peso ideal de acordo com seu IMC é: " + calcimcm);
            }
        
        //ultimo exercicio amo
        
        System.out.println("Exercí­cio 10");
        
        String combustivel;
        float litros10;
        double precoalc;
        double precogaso;
        double acalc3;
        double acalc5;
        double gcalc3;
        double gcalc5;
        double descalc3;
        double descalc5;
        double descgaso3;
        double descgaso5;
        
        System.out.println("vai ser no alcool ou gasolina");
        combustivel = teclado.nextLine();
        System.out.println("quantos litros voce vai por?");
        litros10 = teclado.nextFloat();
        
        precoalc = litros10*2.90;
        precogaso = litros10*3.30;
        
        acalc3 = (3*precoalc)/100;
        acalc5 = (5*precoalc)/100;
        gcalc3 = (3*precogaso)/100;
        gcalc5 = (5*precogaso)/100;
        
        descalc3 = precoalc-acalc3;
        descalc5 = precoalc-acalc5;
        descgaso3 = precogaso-gcalc3;
        descgaso5 = precogaso-gcalc5;
        
        if (combustivel.equalsIgnoreCase("a") && litros10<=20){
            System.out.println("valor final: " + descalc3);
        } else if (combustivel.equalsIgnoreCase("a") && litros10>20){
            System.out.println("valor final: " + descalc5);
        } else if (combustivel.equalsIgnoreCase("g") && litros10<=20){
            System.out.println("valor final: " + descgaso3);
        } else if (combustivel.equalsIgnoreCase("g") && litros10>20){
            System.out.println("valor final: " + descgaso5);
        }
        
    }
}
