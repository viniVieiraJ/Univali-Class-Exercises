import java.io.Serializable;
import java.util.ArrayList;

public class Cliente implements Serializable {
    private String nom_cli;
    private String end_cli;
    private String tel_cli;
    private long cep_cli;
    private String email_cli;

    private ArrayList<Animal> animais = new ArrayList<Animal>();

    public Cliente(String nom_cli, String end_cli, String tel_cli, long cep_cli, String email_cli) {
        this.nom_cli = nom_cli;
        this.end_cli = end_cli;
        this.tel_cli = tel_cli;
        this.cep_cli = cep_cli;
        this.email_cli = email_cli;
    }

    public String getNom_cli() {
        return nom_cli;
    }

    public void setNom_cli(String nom_cli) {
        this.nom_cli = nom_cli;
    }

    public void adicionaAnimal(Animal animal){
        animais.add(animal);
    }

    public ArrayList<Animal> getAnimais() {
        return animais;
    }

    public String getEnd_cli() {
        return end_cli;
    }

    public void setEnd_cli(String end_cli) {
        this.end_cli = end_cli;
    }

    public String getTel_cli() {
        return tel_cli;
    }

    public void setTel_cli(String tel_cli) {
        this.tel_cli = tel_cli;
    }

    public long getCep_cli() {
        return cep_cli;
    }

    public void setCep_cli(long cep_cli) {
        this.cep_cli = cep_cli;
    }

    public String getEmail_cli() {
        return email_cli;
    }

    public void setEmail_cli(String email_cli) {
        this.email_cli = email_cli;
    }

    public void AlterarValores(String end_cli, String tel_cli, long cep_cli, String email_cli) {
        this.end_cli = end_cli;
        this.tel_cli = tel_cli;
        this.cep_cli = cep_cli;
        this.email_cli = email_cli;
    }

    @Override
    public String toString() {
        return "-----Cliente-----\n" +
                "Nome: " + nom_cli + "\n" +
                "Endereço: " + end_cli + "\n" +
                "Telefone: " + tel_cli + "\n" +
                "CEP: " + cep_cli + "\n" +
                "Email: " + email_cli + "\n" +
                "---------------";
    }
}