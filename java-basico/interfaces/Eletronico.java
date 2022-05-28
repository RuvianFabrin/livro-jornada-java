package interfaces;

public interface Eletronico {
    void ligar();//Mótodo abstrato
    /*default void desligar() {//Método default
        System.out.println("Desligando...");
    }*/
    static boolean ehEletronico() {//Método static
        return true;
    }
}
