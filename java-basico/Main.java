import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import heranca.Aluno;
import heranca.AlunoHerdaPessoa;
import heranca.Professor;
import heranca.ProfessorHerdaPessoa;

public class Main {
    public static void main(String[] args) {
        String[] palavras = new String[]{"Abacate", "Bola", "Cola", "Dedo"};
        String usandoArray2 = UsandoArrays.trazerConteudoSemA(palavras);
        System.out.println(usandoArray2);

        String usandoArrays = UsandoArrays.trazerConteudoSemAComVarArgs("Abacaxi", "Amora", "Abacate");
        System.out.println(usandoArrays);

        //transformar array em lista
        Integer[] array = new Integer[]{1, 2, 3, 482, 569};
        List<Integer> lista = Arrays.asList(array);

        Stream fluxo = Arrays.stream(palavras);

        int[] fibonacci = new int[]{1, 3, 5, 13, 21, 55,1,2,8,34};
        Arrays.sort(fibonacci);


        //Código duplicado em Professor e Aluno
        Professor professor = new Professor("João", 30, 2000);
        professor.fazerAniversario();

        Aluno aluno = new Aluno("Maria", 20, "1º ano");
        aluno.fazerAniversario();

        //Código onde Professor e Aluno extendem a mesma classe Pessoa
        ProfessorHerdaPessoa professorH = new ProfessorHerdaPessoa("João", 30, 2000);
        professorH.fazerAniversario();

        AlunoHerdaPessoa alunoH = new AlunoHerdaPessoa("Maria", 20, "1º ano");
        alunoH.fazerAniversario();
    }
}
