package com.mycompany.questao8;

public class Teste {
    
    
    public static void main(String[] args)
    {

    RetanguloEscalavel retangulo = new RetanguloEscalavel(15,20,35,-2); 
    
    System.out.println(retangulo.toString());
    
    retangulo.amplia("P1", 35, 5, 0, 0);
    
    System.out.println(retangulo.toString());
    
    retangulo.amplia("P2", 0, 0, 84, 23);
    
    System.out.println(retangulo.toString());
    
    retangulo.amplia("P1/P2", 51, 65, 1, -41);
    
    System.out.println(retangulo.toString());
    }
}
