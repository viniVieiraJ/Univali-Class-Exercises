class Microondas extends Eletrodomestico {
  private boolean portaFechada;

  public Microondas(String marcaModelo, boolean ligado, boolean portaFechada) {
      super(marcaModelo, ligado);
      this.portaFechada = portaFechada;
  }

  public void abrirPorta() {
    this.portaFechada = false;
  }

  public void fecharPorta() {
    this.portaFechada = true;
  }

  public boolean getEstadoPorta(){
    return portaFechada;
  }

   public void ligar() {
     if(portaFechada){
        super.ligar();
     }
  }

  public String toString(){
    return "Marca/Modelo: " + super.getMarcaModelo() + "/ Ligado: " + super.getLigado() + "/ Porta: " + portaFechada;
  } 

}