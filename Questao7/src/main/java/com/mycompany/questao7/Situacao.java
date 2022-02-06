package com.mycompany.questao7;
import java.util.Arrays;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vinic
 */
public class Situacao {
    private float[] notas = new float[3];
    private int frequencia;
    private Disciplinas diciplinas;
    private Aluno aluno;

    public Situacao(int frequencia, Disciplinas diciplinas, Aluno aluno) {
        this.frequencia = frequencia;
        this.diciplinas = diciplinas;
        this.aluno = aluno;
    }

    public float calcularMedia()
    {
        int total = 0;
        for(int i = 0; i < notas.length; i++) 
        {
            total += notas[i];
        }
        return total/3;
    }

    public void inserirNota(float nota)
    {
        if(nota > 10 || nota < 0) throw new IllegalArgumentException("Numero invalido");

            for(int i = 0; i < notas.length; i++) 
            {
                if (notas[i] == 0.0)
                {
                    notas[i] = nota;
                    System.out.println("Nota adicionada");
                    return;
                }
            }
        throw new IllegalArgumentException("Array cheio");

    }

    public int getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(int frequencia) {
        this.frequencia = frequencia;
    }

    public float[] getNotas() {
        return notas;
    }

    @Override
    public String toString() {
        return "Situacao{" + "notas=" + notas + ", frequencia=" + frequencia + ", diciplinas=" + diciplinas + ", aluno=" + aluno + '}';
    }

    
    
}

