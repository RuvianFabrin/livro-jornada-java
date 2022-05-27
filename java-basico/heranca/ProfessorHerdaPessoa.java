package heranca;

public class ProfessorHerdaPessoa extends Pessoa {
    private double salario;

    public ProfessorHerdaPessoa(String nome, int idade, double salario) {
        super(nome, idade);//Herda da SuperClasse Pessoa
        this.salario = salario;
    }

    
}
