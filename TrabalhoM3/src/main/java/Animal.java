
import java.util.ArrayList;

public class Animal extends Especie{
    private String nome_animal;
    private int idade_animal;
    private int sexo_animal;
    
    private ArrayList<Tratamento> tratamentos;

    public Animal(String nome_animal, int idade_animal, int sexo_animal, ArrayList<Tratamento> tratamentos, String nom_esp) {
        super(nom_esp);
        this.nome_animal = nome_animal;
        this.idade_animal = idade_animal;
        this.sexo_animal = sexo_animal;
        this.tratamentos = tratamentos;
    }
}
