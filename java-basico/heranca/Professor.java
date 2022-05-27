package heranca;

public class Professor {
    private String nome;
    private int idade;
    private double  salario;

    public Professor(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public void fazerAniversario() {
        this.idade++;
        System.out.println("Parabéns, você fez aniversário!");
    }
}
