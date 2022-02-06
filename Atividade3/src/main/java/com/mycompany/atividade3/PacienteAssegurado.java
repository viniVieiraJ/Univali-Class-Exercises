package com.mycompany.atividade3;
import java.util.Scanner;

public class PacienteAssegurado extends Paciente
{    
    Scanner sc = new Scanner(System.in);//uso de entradas 
    private String seguradora;
    private int numeroSeguro;

    public PacienteAssegurado(String nome, int telefone) {
        super(nome, telefone);
    }    
    
    public void lerSeguro()
    {
        System.out.println("Digite a sua seguradora:");
        this.seguradora = sc.next();
        
        System.out.println("Digite o número do seguro:");
        this.numeroSeguro = sc.nextInt();
    }

    public String getSeguradora() {
        return seguradora;
    }

    public void setSeguradora(String seguradora) {
        this.seguradora = seguradora;
    }

    public int getNumeroSeguro() {
        return numeroSeguro;
    }

    public void setNumeroSeguro(int numeroSeguro) {
        this.numeroSeguro = numeroSeguro;
    }
    
    @Override
    public String toString()
    {
        return "Nome do paciente: " + super.getNome() + " / Telefone: " + super.getTelefone() + " / Seguradora: " + this.seguradora + " / Número do seguro: " + this.numeroSeguro;
    }    
}
