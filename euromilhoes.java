import java.util.Random;
import java.util.Arrays;

public class euromilhoes {
    public static void main(String[] args) {
        int[] Numeros = new int[5];
        int[] Estrelas = new int[2];
        random(Numeros, Estrelas);
        ordenar(Numeros, Estrelas);
        mostrar(Numeros, Estrelas);
    }
    public static void random(int[] numeros, int[] estrelas) {
        Random gerar = new Random();

        // gerar 5 numeros
        for (int i = 0; i < 5; i++) {
            int num = gerar.nextInt(50) + 1;
            while (contem(numeros, num)) {
                // ficar a gerar ate o numero ser unico
                num = gerar.nextInt(50) + 1;
            }
            numeros[i] = num;
        }

        // gerar 2 estrelas
        for (int i = 0; i < 2; i++) {
            int estrela = gerar.nextInt(12) + 1;
            while (contem(estrelas, estrela)) {
                // ficar a gerar ate o numero ser unico
                estrela = gerar.nextInt(12) + 1;
            }
            estrelas[i] = estrela;
        }
    }

    public static void ordenar(int[] numeros, int[] estrelas) {
        // arruma os numeros e estrelas em ordem crescente
        Arrays.sort(numeros);
        Arrays.sort(estrelas);
    }

    public static void mostrar(int[] numeros, int[] estrelas) {
        System.out.println("*****************");
        System.out.println("|  EUROMILHOES  |");
        System.out.println("*****************");

        // mostra os numeros e estrelas
        System.out.println("E os numeros desta noite sao: ");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();

        System.out.println("E as estrelas desta noite sao: ");
        for (int estrela : estrelas) {
            System.out.print(estrela + " ");
        }
        System.out.println();
    }

    // boolean contem para verificar se o n e repetido
    private static boolean contem(int[] array, int num) {
        for (int valor : array) {
            // se repetido retorna true
            if (valor == num) {
                return true;
            }
        }
        // se NAO repetido retorna false
        return false;
    }
}