import java.util.Scanner;

public class Vetor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] valores;
        int qtd, i;
        System.out.print("Quantos valores você deseja armazemar? ");
        qtd = in.nextInt();
        while (qtd <= 0) {
            System.out.print("Informe quantidade maior que zero: ");
            qtd = in.nextInt();
        }
        valores = new int[qtd];
        System.out.println("Valores iniciais do vetor");
        for (i = 0; i <= valores.length - 1; i++) {
            System.out.print(valores[i] + " ");
        }
        System.out.println();
        System.out.println("Preenchimento do vetor");
        for (i = 0; i <= valores.length - 1; i++) {
            System.out.print("Informe o valor da posição " + (i + 1) + ": ");
            valores[i] = in.nextInt();
        }
        System.out.println("Valores armazenados no vetor após o preenchimento");
        for (i = 0; i <= valores.length - 1; i++) {
            System.out.print(valores[i] + " ");
        }
        System.out.println("oi");
    }
}