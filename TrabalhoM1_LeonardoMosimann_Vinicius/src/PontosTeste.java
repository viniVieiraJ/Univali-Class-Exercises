public class PontosTeste {
    public static void main(String[] args) {

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

    }
}
