public class Ponto2D {
    private double x;
    private double y;

    public Ponto2D(){//construtor com padrão 0 para os pontos (double default = 0.00)
    }

    public Ponto2D(double x, double y){//construtor com os pontos a serem inseridos no objeto
        this.x = x;
        this.y = y;
    }

    public boolean estaAcimaDe(Ponto2D p){//'p' é outro objeto Ponto2D que sera passado
        if(this.y > p.getY())
            return true;
        return false;
    }
    public boolean estaAbaixoDe(Ponto2D p){
        if(this.y < p.getY())
            return true;
        return false;
    }
    public boolean estaAEsquerdaDe(Ponto2D p){
        if (this.x < p.getX())
            return true;
        return false;
    }
    public boolean estaADireitaDe(Ponto2D p){
        if (this.x > p.getX())
            return true;
        return false;
    }

    public String toString(Ponto2D p){//Passara se os metodos foram true ou false e as coordenadas dos pontos passados

        return String.format("Esta Acima: %b%nEsta abaixo: %b%nEsta a Esquerda: %b%nEsta a Direita: %b", this.estaAcimaDe(p), this.estaAbaixoDe(p), this.estaAEsquerdaDe(p), this.estaADireitaDe(p));
    }

    public double getX() {//getter da coordenada x
        return x;
    }

    public double getY() {//getter da coordenada y
        return y;
    }

    public void setX(double x) {//setter da coordenada x
        this.x = x;
    }

    public void setY(double y) {//setter da coordenada y
        this.y = y;
    }
    
    
}