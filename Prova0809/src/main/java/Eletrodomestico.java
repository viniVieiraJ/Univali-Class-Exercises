class Eletrodomestico {
  private String marcaModelo;
  private boolean ligado = false;

  public Eletrodomestico(String marcaModelo, boolean ligado){
    this.marcaModelo = marcaModelo;
    this.ligado = ligado;
  }

  public void ligar() {
    this.ligado = true;
  }

  public void desligar() {
    this.ligado = false;
  }

  public String getMarcaModelo() {
    return marcaModelo;
  }

  public void setMarcaModelo(String marcaModelo) {
    this.marcaModelo = marcaModelo;
  }

  public boolean getLigado() {
    return ligado;
  }
}