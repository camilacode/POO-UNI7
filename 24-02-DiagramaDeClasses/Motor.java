public class Motor(){
  private int cilindros;
  private int potenciaPorCilindro;
  
  public class Motor( int cilindros, int potenciaPorCilindro){
    this.cilindros = cilindros;
    this.potenciaPorCilindro = potenciaPorCilindro;
  }

  public int getCilindros(){
    return this.cilindros;
  }
  public void setPotenciaPorCilindros(int potenciaPorCilindro){
    this.potenciaPorCilindro = potenciaPorCilindro;
  }
  public int getPotenciaPorCilindros(){
    return this.potenciaPorCilindro;
  }
}