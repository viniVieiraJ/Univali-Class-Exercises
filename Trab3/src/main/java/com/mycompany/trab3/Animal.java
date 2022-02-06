import java.io.Serializable;
import java.util.ArrayList;

public class Animal implements Serializable {
    private String nome_animal;
    private int idade_animal;
    private String sexo_animal;
    private Especie especie;

    private ArrayList<Tratamento> tratamentos = new ArrayList<Tratamento>();

    public Animal(String nome_animal, int idade_animal, String sexo_animal, Especie especie) {
        this.nome_animal = nome_animal;
        this.idade_animal = idade_animal;
        this.sexo_animal = sexo_animal;
        this.especie = especie;
    }

    public String getNome_animal() {
        return nome_animal;
    }

    public void setNome_animal(String nome_animal) {
        this.nome_animal = nome_animal;
    }

    public Especie getEspecie() {
        return especie;
    }

    public void adicionaTratamento(Tratamento tratamento){
        tratamentos.add(tratamento);
    }
    
    public boolean temTratamento()
    {
        return tratamentos.isEmpty();
    }

    public ArrayList<Tratamento> getTratamentos() {
        return tratamentos;
    }

    public int getIdade_animal() {
        return idade_animal;
    }

    public void setIdade_animal(int idade_animal) {
        this.idade_animal = idade_animal;
    }

    public String getSexo_animal() {
        return sexo_animal;
    }

    public void setSexo_animal(String sexo_animal) {
        this.sexo_animal = sexo_animal;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

    public void AlterarValores( int idade_animal, String sexo_animal, Especie especie) {
        this.idade_animal = idade_animal;
        this.sexo_animal = sexo_animal;
        this.especie = especie;
    }

    @Override
    public String toString() {
        return "-----Animal-----\n" +
                "Nome: " + nome_animal + "\n" +
                "Idade: " + idade_animal + "\n" +
                "Sexo: " + sexo_animal + "\n" +
                "Espécie: " + especie + "\n" +
                "--------------";
    }
}