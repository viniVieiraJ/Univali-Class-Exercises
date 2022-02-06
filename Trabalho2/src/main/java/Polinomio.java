import java.util.ArrayList;

public class Polinomio implements Calculavel{

    private ArrayList<Termo> termos = new ArrayList<Termo>();

    public Polinomio() {
    }

    public Polinomio(Termo termo) {
        termos.add(termo);
    }

    public void insere(Termo termo){
        termos.add(termo);
    }

    public double calcula(int x){
        double total = 0;
        for(Termo termo :termos){
            total += termo.calcula(x);
        }
        return total;
    }

    public void fusao(Polinomio polinomio){
        for(Termo termo : polinomio.getTermos()){
            termos.add(termo);
        }
    }

    public ArrayList<Termo> getTermos() {
        return termos;
    }

    public void setTermos(ArrayList<Termo> termos) {
        this.termos = termos;
    }

    @Override
    public String toString() {
        String string = "   ";
        int index = 0;

        for(Termo termo : termos){

            if(termos.get(index) != termos.get(termos.size()-1)){
                index++;
                string += termo.toString() + " + ";
            }else {
                string += termo.toString();
            }
        }

        return string;
    }
}
