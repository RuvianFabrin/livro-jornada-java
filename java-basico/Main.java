import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

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
    }
}
