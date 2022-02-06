package Questao7;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vinic
 */
public class Teste {

    public static void main(String[] args) {
        Aluno Vinicius = new Aluno("Vinicius", 123, 18);
        Aluno Jamile = new Aluno("Jamile", 321, 16);
        Disciplinas Matematica = new Disciplinas("Matematica", 48);

        Situacao sitVinicius = new Situacao(100, Matematica, Vinicius);
        Situacao sitJamile = new Situacao(86, Matematica, Jamile);

        try{
            sitVinicius.inserirNota(8f);
            sitVinicius.inserirNota(9f);
            sitVinicius.inserirNota(9f);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        System.out.println("Média: " + sitVinicius.calcularMedia());

        try{
            sitJamile.inserirNota(4f);
            sitJamile.inserirNota(4.5f);
            sitJamile.inserirNota(8f);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        System.out.print("Media = " + sitJamile.calcularMedia() + " / Media = " + sitVinicius.calcularMedia());
       


    }

}
