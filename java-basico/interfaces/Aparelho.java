package interfaces;

public interface Aparelho {
    default void desligar() {
        System.out.println("Desligando aparelho...");
    }
}
