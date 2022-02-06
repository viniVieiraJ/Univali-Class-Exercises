import java.io.Serializable;
import java.util.ArrayList;

public class Veterinario implements Serializable {
    private String nom_vet;
    private String end_vet;
    private String tel_vet;

    public Veterinario(String nom_vet, String end_vet, String tel_vet) {
        this.nom_vet = nom_vet;
        this.end_vet = end_vet;
        this.tel_vet = tel_vet;
    }

    public String getNom_vet() {
        return nom_vet;
    }

    public String getEnd_vet() {
        return end_vet;
    }

    public String getTel_vet() {
        return tel_vet;
    }


}
