import java.util.Scanner;
import java.util.Locale; 

public class PontosTeste {
    
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);//uso de entradas 
        sc.useLocale(Locale.ENGLISH);//para aceitar entradas com ponto ao inves de virgula

        Ponto2D ponto1 = new Ponto2D(1,2);
        System.out.printf("%nPonto 1: x = %.2f y = %.2f%n", ponto1.getX(),ponto1.getY());
        System.out.printf("---------------------------%n");
        Ponto2D ponto2 = new Ponto2D(4,5);
        System.out.printf("Ponto 2: x = %.2f y = %.2f%n", ponto2.getX(),ponto2.getY());
        System.out.printf("---------------------------%n");
        System.out.println("Relacao ponto 1 e ponto 2");
        System.out.println(ponto1.toString(ponto2));
        System.out.printf("---------------------------%n");
        Ponto3D ponto3 = new Ponto3D();
        Ponto3D ponto4 = new Ponto3D(2,2,2);
        System.out.printf("Ponto 3: x = %.2f y = %.2f, z = %.2f%n", ponto3.getX(),ponto3.getY(), ponto3.getZ());
        System.out.printf("---------------------------%n");
        System.out.printf("Ponto 4: x = %.2f y = %.2f, z = %.2f%n", ponto4.getX(),ponto4.getY(), ponto4.getZ());
        System.out.printf("---------------------------%n");
        System.out.println("Relacao ponto 3 e ponto 4");
        System.out.println(ponto3.toString(ponto4));
        
        Ponto3D primeiroPonto = new Ponto3D();
        Ponto3D segundoPonto = new Ponto3D();
        boolean teste = true;
        
        do{
            String entrada;
            System.out.println("|| Verificação dinâmica de dois pontos 3D ||");
            System.out.println("Digite o valor de X do primeiro ponto:");
            primeiroPonto.setX(sc.nextFloat());
            
            System.out.println("Digite o valor de Y do primeiro ponto:");
            primeiroPonto.setY(sc.nextFloat());
            
            System.out.println("Digite o valor de Z do primeiro ponto:");
            primeiroPonto.setZ(sc.nextFloat());
            
            System.out.println("Digite o valor de X do segundo ponto:");
            segundoPonto.setX(sc.nextFloat());
            
            System.out.println("Digite o valor de Y do segundo ponto:");
            segundoPonto.setY(sc.nextFloat());
            
            System.out.println("Digite o valor de Z do segundo ponto:");
            segundoPonto.setZ(sc.nextFloat());
            
            System.out.printf("---------------------------%n");
            System.out.printf("Primeiro Ponto: x = %.2f y = %.2f, z = %.2f%n", primeiroPonto.getX(),primeiroPonto.getY(), primeiroPonto.getY());
            System.out.printf("---------------------------%n");
            System.out.printf("Segundo Ponto: x = %.2f y = %.2f, z = %.2f%n", segundoPonto.getX(),segundoPonto.getY(), segundoPonto.getZ());
            System.out.printf("---------------------------%n");
            System.out.println("Relação do primeiro ponto com o segundo ponto");
            System.out.println(primeiroPonto.toString(segundoPonto));
            
            System.out.println("Continuar? (S/N)");
            entrada = sc.next();
            
            if(entrada.equalsIgnoreCase("N"))
            {
                teste = false;
            }
        }while(teste);
                    
    }
}