package array;
public class UsandoArrays {
    //Como declarar um array?
    int[] numeros = new int[10];
    String nomes[] = new String[10];

    public static String trazerConteudoSemA(String[] palavras) {
        String resultado = "";
        if (palavras != null && palavras.length > 0) {
            for (int i = 0; i < palavras.length; i++) {
                resultado = resultado + palavras[i].replace("A", "");
            }
            
        }
        return resultado;
    }

    public static String trazerConteudoSemAComForEach(String[] palavras) {
        String resultado = "";
        if (palavras != null && palavras.length > 0) {
            for (String palavra : palavras) {
                resultado = resultado + palavra.replace("A", "");
            }
        }
        return resultado;
    } 
    //Quando usar varargs, tem que deixar sempre no final
    public static String trazerConteudoSemAComVarArgs(String... palavras) {
        String resultado = "";
        if (palavras != null && palavras.length > 0) {
            for (String palavra : palavras) {
                resultado = resultado + palavra.replace("A", "");
            }
        }
        return resultado;
    }
}
