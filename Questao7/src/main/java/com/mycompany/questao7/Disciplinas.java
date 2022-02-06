package com.mycompany.questao7;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vinic
 */
public class Disciplinas {
    
    private String nome;
    private int CargaHoraria;

    public Disciplinas(String nome, int cargaHoraria) {
        this.nome = nome;
        CargaHoraria = cargaHoraria;

    }
    public int getCargaHoraria() {
        return CargaHoraria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCargaHoraria(int cargaHoraria) {
        CargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Disciplinas{" + "nome=" + nome + ", CargaHoraria=" + CargaHoraria + '}';
    }
    
    

}
