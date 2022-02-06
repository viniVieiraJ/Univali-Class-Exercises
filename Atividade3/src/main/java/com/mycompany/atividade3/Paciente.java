package com.mycompany.atividade3;

public abstract class Paciente 
{
    private static int qtdePaciente;
    private final String nome;
    private int telefone;
   
    public Paciente(String nome, int telefone)
    {
        this.nome = nome;
        this.telefone = telefone;
    }

    public static int getQtdePaciente() {
        return qtdePaciente;
    }

    public static void setQtdePaciente(int qtdePaciente) {
        Paciente.qtdePaciente = qtdePaciente;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }    

    public String getNome() {
        return nome;
    }
    
    @Override
    public String toString()
    {
        return "Nome do paciente: " + nome + " / Telefone: " + telefone;
    }
}

