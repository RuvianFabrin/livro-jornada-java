package interfaces;

public class Computador implements Eletronico{

    @Override
    public void ligar() {
        System.out.println("Ligando computador...");
        
    }
    void desligar() {
        System.out.println("Desligando computador...");
    }
    
}
