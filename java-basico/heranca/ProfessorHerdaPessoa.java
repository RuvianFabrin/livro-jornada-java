package heranca;

public class ProfessorHerdaPessoa extends Pessoa {
    private double salario;

    public ProfessorHerdaPessoa(String nome, int idade, double salario) {
        super(nome, idade);//Herda da SuperClasse Pessoa
        this.salario = salario;
    }

    @Override
    public void fazerAdmissao() {
        System.out.println("Olá, querido(a) professor(a)! Seu salário é de R$" + this.salario);
        
    }

    
}
