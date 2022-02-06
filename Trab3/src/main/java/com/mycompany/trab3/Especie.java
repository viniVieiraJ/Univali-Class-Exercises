import java.io.Serializable;

public class Especie implements Serializable {
    private String nom_esp;

    public Especie(String nom_esp) {
        this.nom_esp = nom_esp;
    }

    public String getNom_esp() {
        return nom_esp;
    }

    @Override
    public String toString() {
        return nom_esp;
    }
}