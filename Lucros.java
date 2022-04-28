import java.util.Scanner;

public class Lucros {
   public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      double gastos = 0.0;
      double lucros = 0.0;
      double ganhos = 0.0;
      double media = 0.0;
      double[] vetGanhos = new double[12];
      double[] vetGastos = new double[12];
      double[] vetLucros = new double[12];
      System.out.println("Digite os valores dos Ganhos dos meses de Janeiro à Dezembro:");
      preencher(vetGanhos);
      System.out.println("Digite os valores dos Gastos dos meses de Janeiro à Dezembro:");
      preencher(vetGastos);
      calcularLucros(vetGanhos, vetGastos, vetLucros);
      exibirVetor(vetGanhos);
      exibirVetor(vetGastos);
      System.out.println("Os valores dos lucros dos meses de Janeiro à Dezembro são:");
      exibirVetor(vetLucros);
      ganhos = somarValores(vetGanhos);
      gastos = somarValores(vetGastos);
      lucros = somarValores(vetLucros);
      System.out.println("O valor dos GASTOS de 2020 foi: " + gastos);
      System.out.println("O valor dos GANHOS de 2020 foi: " + ganhos);
      System.out.println("O valor dos LUCROS de 2020 foi: " + lucros);
      media = calcularMedia(vetLucros);
      System.out.println("A média dos lucros de 2020 foi: " + media);
   }

   public static void preencher(double vetor[]) {
      Scanner a = new Scanner(System.in);
      for (int i = 0; i < vetor.length; i++) {
         vetor[i] = a.nextInt();
      }
   }

   public static void calcularLucros(double vetorGanhos[], double vetorGastos[], double vetorLucros[]) {
      for (int i = 0; i < 12; i++) {
         vetorLucros[i] = vetorGanhos[i] - vetorGastos[i];
      }
   }

   public static void exibirVetor(double vetor[]) {
      for (int i = 0; i < 12; i++) {
         System.out.println(vetor[i]);
      }
   }

   public static double somarValores(double vet[]) {
      double soma = 0;
      for (int i = 0; i < vet.length; i++) {
         soma = soma + vet[i];
      }
      return soma;
   }

   public static double calcularMedia(double vet[]) {
      double media = 0;
      double soma = 0;
      soma = somarValores(vet);
      media = soma / vet.length;
      return media;
   }
}
