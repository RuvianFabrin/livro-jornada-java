package heranca;

public class AlunoHerdaPessoa extends Pessoa {
    private String serie;

    public AlunoHerdaPessoa(String nome, int idade, String serie) {
        super(nome, idade);//Herda da SuperClasse Pessoa, super deve ser sempre o primeiro
        this.serie = serie;
    }

    //Subscrevendo o método fazerAniversario da SuperClasse Pessoa
    public void fazerAniversario() {
        super.fazerAniversario();//Chama o método da SuperClasse Pessoa
        System.out.println("Feliz Aniversário, querido(a) aluno(a)!");
    }

    @Override
    public void fazerAdmissao() {
        System.out.println("Peça a seus pais para que você seja admitido(a) na " + this.serie);
        
    }
    
}
