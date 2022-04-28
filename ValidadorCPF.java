import java.util.Scanner;

public class ValidadorCPF {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    Scanner d = new Scanner(System.in);
    String CPF;
    boolean valido;
    char Pross = 's';
    do {
      System.out.println("Informe o seu CPF (somente números): ");
      CPF = s.nextLine();
      valido = verificarCPF(CPF);
      if (valido)
        System.out.println(" O CPF " + CPF + " é válido.");
      else if (!valido)
        System.out.println(" O CPF " + CPF + " não é válido.");
      System.out.println("Deseja verificar outro CPF? (s ou n)");
      Pross = d.next().charAt(0);
    } while (Pross == 's');
  }

  public static boolean verificarCPF(String CPF) {
    String baseC = "0,1,2,3,4,5,6,7,8,9";
    String[] NumerosCPF = new String[11];
    NumerosCPF = CPF.split("");
    if (CPF.length() != 11) {
      return false;
    }
    for (int i = 0; i < 11; i++) {
      if (baseC.contains(NumerosCPF[i]) == false) {
        return false;
      }
    }
    int pDigito = calcularDigito(NumerosCPF, "primeiro");
    if (Integer.parseInt(NumerosCPF[9]) != pDigito) {
      return false;
    }
    int sDigito = calcularDigito(NumerosCPF, "segundo");
    if (Integer.parseInt(NumerosCPF[10]) != sDigito) {
      return false;
    }
    return true;
  }

  public static int calcularDigito(String[] NumerosCPF, String NumDoDigito) {
    int soma = 0;
    if (NumDoDigito == "primeiro") {
      soma = Integer.parseInt(NumerosCPF[0]) * 10 +
          Integer.parseInt(NumerosCPF[1]) * 9 +
          Integer.parseInt(NumerosCPF[2]) * 8 +
          Integer.parseInt(NumerosCPF[3]) * 7 +
          Integer.parseInt(NumerosCPF[4]) * 6 +
          Integer.parseInt(NumerosCPF[5]) * 5 +
          Integer.parseInt(NumerosCPF[6]) * 4 +
          Integer.parseInt(NumerosCPF[7]) * 3 +
          Integer.parseInt(NumerosCPF[8]) * 2;
    } else if (NumDoDigito == "segundo") {
      soma = Integer.parseInt(NumerosCPF[0]) * 11 +
          Integer.parseInt(NumerosCPF[1]) * 10 +
          Integer.parseInt(NumerosCPF[2]) * 9 +
          Integer.parseInt(NumerosCPF[3]) * 8 +
          Integer.parseInt(NumerosCPF[4]) * 7 +
          Integer.parseInt(NumerosCPF[5]) * 6 +
          Integer.parseInt(NumerosCPF[6]) * 5 +
          Integer.parseInt(NumerosCPF[7]) * 4 +
          Integer.parseInt(NumerosCPF[8]) * 3 +
          Integer.parseInt(NumerosCPF[9]) * 2;
    }
    System.out.println(soma);
    System.out.println((soma % 11));
    if ((soma % 11) < 2) {
      return 0;
    } else {
      return (11 - (soma % 11));
    }
  }
}
