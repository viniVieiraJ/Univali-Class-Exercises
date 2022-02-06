public class Teste {

    public static void main(String[] args) {
        Termo t1 = new Termo(1, 2);
        Termo t2 = new Termo(2, 2);
        Termo t3 = new Termo(3, 2);
        Termo t4 = new Termo(4, 2);

        Polinomio p1 = new Polinomio(t1);
        p1.insere(t2);

        Polinomio p2 = new Polinomio(t3);
        p2.insere(t4);

        p1.fusao(p2);

        System.out.println("f(x) = " + p1.toString());

        PolinomioComSub ps1 = new PolinomioComSub();
        ps1.insere(p1);
        ps1.insere(p2);
        System.out.println("f(x) = " + ps1.toString());
    }
}
