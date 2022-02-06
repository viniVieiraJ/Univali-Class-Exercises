
import java.util.ArrayList;

public class Cliente {
    private String nom_cli;
    private String end_cli;
    private String tel_cli;
    private long cep_cli;
    private String email_cli;
    
    private ArrayList<Animal> animais;

    public Cliente(String nom_cli, String end_cli, String tel_cli, long cep_cli, String email_cli, ArrayList<Animal> animais) {
        this.nom_cli = nom_cli;
        this.end_cli = end_cli;
        this.tel_cli = tel_cli;
        this.cep_cli = cep_cli;
        this.email_cli = email_cli;
        this.animais = animais;
    }

}
