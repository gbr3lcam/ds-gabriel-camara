package at1_getset;

// Atividade 1: get & set parte a

public class At1_getset {
    private String nome;
    private String marca;
    private int ano;
    private int vel;
    private boolean sensor;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getVel() {
        return vel;
    }

    public void setVel(int vel) {
        this.vel = vel;
    }

    public boolean isSensor() {
        return sensor;
    }

    public void setSensor(boolean sensor) {
        this.sensor = sensor;
    }
    
    // funcoes
    
    public void acelerar(int aceleracao) {
        vel += aceleracao;
    }
    
    public void freiar(int reduzir) {
        vel -= reduzir;
    }
    
    public void buzinar() {
        System.out.println("bibi!!!");
    } 

    public void ACC() {
        if (sensor) {
            while (vel > 0) {
                freiar(5);
                System.out.println("Velocidade: " + vel);
            }
        } else {
            while (vel < 120) { // Limite de velocidade arbitrário para exemplo
                acelerar(5);
                System.out.println("Velocidade: " + vel);
            }
        }
    }                                        
}
