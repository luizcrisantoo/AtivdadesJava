import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] matriz;
        int i, j;
        System.out.println("Digite o número de linhas da matriz: ");
        i = s.nextInt();
        while (i <= 0) {
            System.out.println("Número inválido, digite um número maior que 0: ");
            i = s.nextInt();
        }
        System.out.println("Digite o número de colunas da matriz: ");
        j = s.nextInt();
        while (j <= 0) {
            System.out.println("Número inválido, digite um número maior que 0: ");
            j = s.nextInt();
        }
        matriz = new int[i][j];
        System.out.println("Digite os valores da matriz");
        preencher(matriz);
        System.out.println("Sua matriz: ");
        exibir(matriz);
        colocarMaiorNum(matriz);
    }

    public static void exibir(int[][] mat) {
        int i, j;
        for (i = 0; i < mat.length; i++) { // Preencher o vetor
            for (j = 0; i < mat.length; j++) {
            }
            System.out.print("" + mat[i][j]);
        }
        System.out.println();
    }

    public static void preencher(int[][] mat) {
        Scanner in = new Scanner(System.in);

        int i, j;
        for (i = 0; i <= mat.length - 1; i++) {
            for (j = 0; j <= mat[i].length - 1; j++) {
                System.out.print("Digite o valor da linha: " + i + " conluna: " + j + " = ");
                mat[i][j] = in.nextInt();
            }
        }
    }

    public static void colocarMaiorNum(int[][] mat) {
        Scanner in = new Scanner(System.in);
        String retorno = "";
        int r = 0;
        int c = 0;
        int i = 0;
        for (int[] jotas : mat) {
            for (int jm = 0; jm < jotas.length; jm++) {
                i = jotas[jm];
                if (r < i) {
                    r = i;
                    retorno = "O maior número da Matriz é " + jotas[jm] + " na coluna: " + c + " e na linha: " + jm;
                }
            }
            c++;
        }
        System.out.println(retorno);
    }
}