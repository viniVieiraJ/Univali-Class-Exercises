import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Tratamento implements Serializable {
    private Date dat_ini;
    private Date dat_fin;
    private Animal animal;
    public String toString;

    private ArrayList<Consulta> consultas = new ArrayList<Consulta>();

    public Tratamento(Date dat_ini, Date dat_fin, Animal animal) {
        this.dat_ini = dat_ini;
        this.dat_fin = dat_fin;
        this.animal = animal;
    }

    public void adicionarConsulta(Consulta consulta){
        consultas.add(consulta);
    }

    public Date getDat_ini() {
        return dat_ini;
    }

    public Date getDat_fin() {
        return dat_fin;
    }

    public Animal getAnimal() {
        return animal;
    }

    public String getToString() {
        return toString;
    }

    public ArrayList<Consulta> getConsultas() {
        return consultas;
    }


    
    
}