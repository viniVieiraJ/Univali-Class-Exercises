class Televisor extends Eletrodomestico{
  private int canal;
  private int numeroMaxCanais;

  public Televisor(String marcaModelo, boolean ligado, int canal, int numeroMaxCanais){
    super(marcaModelo, ligado);
    this.canal = canal;
    this.numeroMaxCanais = numeroMaxCanais;
  }

  public void canalAcima(){
    if(super.getLigado()){
      if(canal == numeroMaxCanais)
      {
        canal = 1;
      }else{
        canal++;
      }
    }
  }

  public void canalAbaixo(){
    if(super.getLigado()){
      if(canal == 1)
      {
        canal = numeroMaxCanais;
      }else{
        canal--;
      }
    }
  }
  
  public int getCanal(){
    return canal;
  }  

  public void setCanal(int canal){
    this.canal = canal;
  }

  public int getNumeroMaxCanais(){
    return canal;
  }  

  public void setNumeroMaxCanais(int numeroMaxCanais){
    this.numeroMaxCanais = numeroMaxCanais;
  } 

  public String toString(){
    return "Marca/Modelo: " + super.getMarcaModelo() + "/ Ligado: " + super.getLigado() + "/ Canal " + canal + " de " + numeroMaxCanais; 
  }

}