package com.mycompany.atividade3;
import java.util.Scanner;

public class PacienteNaoAssegurado extends Paciente
{
    Scanner sc = new Scanner(System.in);
    private float valorConsulta;
    private int codigoBanco;
    private int numCheque;
    
    public PacienteNaoAssegurado(String nome, int telefone) {
        super(nome, telefone);
    }
    
    public void lerPagamento()
    {
        System.out.println("Digite o valor da consulta:");
        this.valorConsulta = sc.nextFloat();
        
        System.out.println("Digite o código do banco:");
        this.codigoBanco = sc.nextInt();
        
        System.out.println("Digite o número do cheque:");
        this.numCheque = sc.nextInt();
    }

    public float getValorConsulta() {
        return valorConsulta;
    }

    public void setValorConsulta(float valorConsulta) {
        this.valorConsulta = valorConsulta;
    }

    public int getCodigoBanco() {
        return codigoBanco;
    }

    public void setCodigoBanco(int codigoBanco) {
        this.codigoBanco = codigoBanco;
    }

    public int getNumCheque() {
        return numCheque;
    }

    public void setNumCheque(int numCheque) {
        this.numCheque = numCheque;
    }

    @Override
    public String toString() {
        return "Nome do paciente: " + super.getNome() + " / Telefone: " + super.getTelefone() + " / Valor da consulta: " + this.valorConsulta + 
                " / Código do banco: " + this.codigoBanco + " / Número do cheque: " + this.numCheque;
    }
}
