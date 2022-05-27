package heranca;

public class Aluno {
    private String nome;
    private int idade;
    private String  serie;

    public Aluno(String nome, int idade, String serie) {
        this.nome = nome;
        this.idade = idade;
        this.serie = serie;
    }

    public void fazerAniversario() {
        this.idade++;
        System.out.println("Parabéns, você fez aniversário!");
    }
}
