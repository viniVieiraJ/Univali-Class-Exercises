public class Ponto3D extends Ponto2D{
    private double z;

    public Ponto3D(){//Construtor com padrão 0 para x,y,z (double default = 0.00)
    }

    public Ponto3D(double x, double y, double z){
        super(x,y);

        if (z<0)
            throw new IllegalArgumentException("Z tem que ser maior que 0");
        this.z = z;
    }
    public boolean estaAfrenteDe(Ponto3D p){//nao foi especificado, mas faz sentido saber a profundidade em relação ao outro ponto
        if(this.z > p.getZ())
            return true;
        return false;
    }
    public boolean estaAtrasDe(Ponto3D p){
        if(this.z < p.getZ())
            return true;
        return false;
    }


    public String toString(Ponto3D p){//Passara se os metodos foram true ou false e as coordenadas dos pontos passados

        return String.format("Esta Acima: %b%nEsta abaixo: %b%nEsta a Esquerda: %b%nEsta a Direita: %b%nEsta a Frente: %b%nEsta Atras: %b%n", this.estaAcimaDe(p), this.estaAbaixoDe(p), this.estaAEsquerdaDe(p), this.estaADireitaDe(p), this.estaAfrenteDe(p), this.estaAtrasDe(p));
    }
    
    public double getZ() {//getter da coordenada z
        return z;
    }

    public void setZ(double z) {//setter da coordenada z
        this.z = z;
    }

}