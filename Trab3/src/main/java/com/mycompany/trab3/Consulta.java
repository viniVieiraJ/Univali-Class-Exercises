import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Consulta implements Serializable {
    private Date dat_con;
    private String historico;
    private String resumo;
    private Tratamento tratamento;
    private Veterinario veterinario;
    private String toString;

    private ArrayList<Exame> exames = new ArrayList<Exame>();

    public Consulta(Date dat_con, String historico, String resumo, Tratamento tratamento, Veterinario veterinario) {
        this.dat_con = dat_con;
        this.historico = historico;
        this.tratamento = tratamento;
        this.veterinario = veterinario;
        this.resumo = resumo;
    }

    public void addExame(Exame exame){
        exames.add(exame);
    }

    public Date getDat_con() {
        return dat_con;
    }

    public String getHistorico() {
        return historico;
    }

    public String getResumo() {
        return resumo;
    }

    public Tratamento getTratamento() {
        return tratamento;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public String getToString() {
        return toString;
    }

    public ArrayList<Exame> getExames() {
        return exames;
    }


    
}
