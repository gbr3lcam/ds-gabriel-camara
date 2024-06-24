package at1_getset;

// Atividade 1: get & set parte b

import java.util.Random;

public class At1_getset2 {
    
    public static void main(String[] args) {
        
        At1_getset carro = new At1_getset();
        
        carro.setNome("UNO");
        carro.setMarca("Fiat");
        carro.setAno(2013);
        carro.setVel(60);
        carro.setSensor(false);
         
        Random num = new Random();
        int numero = num.nextInt(100) + 1;

        if (numero % 2 == 0) {
            carro.setSensor(true);
        } else {
            carro.setSensor(false);
        }
    }
}
