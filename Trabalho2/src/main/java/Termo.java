public class Termo {

    private int a;
    private int i;

    public Termo(int a, int i) {
        this.a = a;
        this.i = i;
    }

    public void insere(Termo termo){
        this.a = termo.getA();
        this.i = termo.getI();
    }

    public double calcula(int x){
        return getA() * Math.pow(x, getI());
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return  a +
                "x^" + i;
    }
}
