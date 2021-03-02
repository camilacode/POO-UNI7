public class Carro{
  private Motor motor;
  private int velocidadeMax;
  private Cor cor;
  private String montadora;
  private Pneu pneus;
  private int velocidadeAtual;
  private boolean ligado;

  public void ligar(){
    System.out.println("Carro ligado");
  }
  public void desligar(){
    System.out.println("Carro desligado");
  }
  public void acelerar(){
    System.out.println("Carro acelerando");
  }
  public void frear(){
    System.out.println("Carro freando");
  }
  public int getVelocidadeAtual(){
    return velocidadeAtual;
  }
}

