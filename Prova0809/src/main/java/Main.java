class Main {
  public static void main(String[] args) {
  
    Microondas m1 = new Microondas("Consul", false, false);
    m1.fecharPorta();
    m1.ligar();
    System.out.println(m1.toString());

    Televisor t1 = new Televisor("Panasonic", true, 5, 12);
    
    t1.canalAcima();
    t1.canalAbaixo();
    t1.canalAbaixo();
    
    System.out.println(t1.toString());
    
  }
}