import java.util.Scanner;

public class Matriz2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i, j;
        int[][] matriz;
        System.out.print("Informe a quantidade de linhas: ");
        i = in.nextInt();
        while (i <= 0) {
            System.out.print("Por favor, informe uma qtd maior que zero: ");
            i = in.nextInt();
        }
        System.out.print("Informe a quantidade de colunas: ");
        j = in.nextInt();
        while (j <= 0) {
            System.out.print("Por favor, informe uma qtd maior que zero: ");
            j = in.nextInt();
        }
        matriz = new int[i][j];
        System.out.println("Digite os valores da matriz");
        preencher(matriz);
        System.out.println("Exibição da matriz");
        exibir(matriz);
        colocarMaiorNumero(matriz);
    }

    public static void colocarMaiorNumero(int[][] mat) {
        Scanner in = new Scanner(System.in);
        String retorno = "";
        int r = 0;
        int c = 0;
        int i = 0;
        for (int[] jm : mat) {
            for (int jMai = 0; jMai < jm.length; jMai++) {
                i = jm[jMai];
                if (r < i) {
                    r = i;
                    retorno = "O maior numero da Matriz é " + jm[jMai] + " Presente na coluna: " + c + " e na linha: "
                            + jMai;
                }
            }
            c++;
        }

        System.out.println(retorno);
    }

    public static void exibir(int[][] mat) {
        int i, j;
        for (i = 0; i < mat.length; i++) {
            for (j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
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

}