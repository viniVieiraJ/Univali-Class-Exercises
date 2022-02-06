package Questao7;
import java.util.ArrayList;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vinic
 */
public class Aluno {
    private String nome;
    private int matricula;
    private int idade;
    ArrayList<Disciplinas> diciplinas = new ArrayList<>();

    public Aluno(String nome, int matricula, int idade) {
        this.nome = nome;
        this.matricula = matricula;
        this.idade = idade;
    }

    
    public int cargaHoraria(){
        int cargaTotal = 0;
        for(Disciplinas dic : this.diciplinas){
            cargaTotal += dic.getCargaHoraria();
        }
        return cargaTotal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public ArrayList<Disciplinas> getDiciplinas() {
        return diciplinas;
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", matricula=" + matricula + ", idade=" + idade + ", diciplinas=" + diciplinas + '}';
    }
}
