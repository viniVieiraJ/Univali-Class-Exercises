/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.questao8;


public class RetanguloEscalavel implements ObjetoGeometrico, Escalavel{
    
    private int P1X;
    private int P1Y;
    private int P2X;
    private int P2Y; 

    public RetanguloEscalavel(int P1X, int P1Y, int P2X, int P2Y) {
        this.P1X = P1X;
        this.P1Y = P1Y;
        this.P2X = P2X;
        this.P2Y = P2Y;
    }
    

    @Override
    public int getP1X() {
        return P1X;
    }

    @Override
    public int getP1Y() {
        return P1Y;
    }

    @Override
    public int getP2X() {
        return P2X;
    }

    @Override
    public int getP2Y() {
        return P2Y;
    }

    @Override
    public void amplia(String pontos, int novoP1X, int novoP1Y, int novoP2X, int novoP2Y) {
        
        switch(pontos){
            case "P1":
            P1X = novoP1X;
            P1Y = novoP1Y;
            break;
            
            case "P2":
            P2X = novoP2X;
            P2Y = novoP2Y;
            break;
            
            case "P1/P2":
            P1X = novoP1X;
            P1Y = novoP1Y;
            P2X = novoP2X;
            P2Y = novoP2Y;
        }
        
        
    }

    @Override
    public String toString() {
        return "RetanguloEscalavel{" + "P1 = X:" + P1X + ", Y:" + P1Y + " / P2 = X:" + P2X + ", Y" + P2Y + '}';
    }
}
