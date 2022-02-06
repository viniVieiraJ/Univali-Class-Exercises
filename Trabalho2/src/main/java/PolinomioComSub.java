import java.util.ArrayList;

public class PolinomioComSub extends Polinomio{

    ArrayList<Polinomio> subTermos = new ArrayList<Polinomio>();
    
    public ArrayList<Polinomio> getPolinomios()
    {
        return subTermos;
    }

    public void insere(Polinomio polinomio){
        subTermos.add(polinomio);
    }
    public void insere(PolinomioComSub polinomio){
        subTermos.add(polinomio);
    }
    
    public double calcula(int x){
        double total = 0;
        for(Polinomio polinomio : subTermos){
           total += polinomio.calcula(x);
        }
        return total;
    }

    public void fusao(){
        Polinomio fusao = new Polinomio(new Termo(0,1));
        
        for(Polinomio p: this.subTermos)
        {
            while(true)
            {
                if(p instanceof PolinomioComSub)
                {
                    PolinomioComSub psub = (PolinomioComSub) p;
                    for (Polinomio psubs : psub.getPolinomios())
                    {
                        fusao.fusao(psubs);
                    }
                    
                    break;
                }else
                {
                    fusao.fusao(p);
                    
                    break;
                }
            }
        }
    }

    public void fusao(Polinomio polinomio){
        this.insere(polinomio);
        this.fusao();
    }

    @Override
    public String toString() {
        String string = "";
        int index = 0;
        for(Polinomio polinomio : subTermos){
            if(subTermos.get(index) != subTermos.get(subTermos.size()-1)) {
                index++;
                string += "(" + polinomio + ") + ";
            }
            else string += "(" + polinomio + ")";
        }
        return string;
    }
}
