package heranca;

//Tornando a classe Pessoa abstrata não podemos mais instanciar diretamente
public abstract class Pessoa {
    protected String nome; 
    protected int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void fazerAniversario() {
        this.idade++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    //Método abstrato não tem chaves e termina com ;
    //Isso obriga as subclasses a definir esse método colocando um corpo
    public abstract void fazerAdmissao();
}
