import java.util.Scanner;

public class CalcularMedia {
    public static void preencher(String[] nomes, double primeiraNota[], double[] segundaNota, double[] media) {
        Scanner a = new Scanner(System.in);
        for (int i = 0; i < 50; i++) {
            System.out.println("Digite o nome do aluno " + (i + 1));
            nomes[i] = a.next();
            System.out.println("Digite a primeira nota do aluno " + (i + 1));
            primeiraNota[i] = a.nextInt();
            System.out.println("Digite a segunda nota do aluno " + (i + 1));
            segundaNota[i] = a.nextInt();

            media[i] = (2 * primeiraNota[i] + 350 * segundaNota[i]) / 5;
        }
    }

    public static void printar(String[] nomes, double[] media) {
        Scanner a = new Scanner(System.in);
        for (int i = 0; i < 50; i++) {
            System.out.println("O aluno " + nomes[i] + " obteve média " + media[i]);
        }
    }

    public static double calcularMediaTurma(double[] media) {
        Scanner a = new Scanner(System.in);
        double mediaGeral = 0;
        double soma = 0;
        for (int i = 0; i < 50; i++) {
            soma = soma + media[i];
        }
        mediaGeral = (soma / 50);
        System.out.println("A média da turma é " + mediaGeral);

        return mediaGeral;
    }

    public static void calcularAbaixoDaMediaTurma(double[] media, double mediaGeral) {
        Scanner a = new Scanner(System.in);
        double contador = 0;
        double percentual = 0;
        for (int i = 0; i < 50; i++) {
            if (media[i] < mediaGeral) {
                contador++;
            }
        }

        percentual = (contador / 50) * 100;
        System.out.println("O percentual da turma que ficou abaixo da média foi de " + percentual + "%");

    }

    public static void calcularAcimaDaMediaTurma(double[] media, double mediaGeral) {
        Scanner a = new Scanner(System.in);
        double contador = 0;
        double percentual = 0;
        for (int i = 0; i < 50; i++) {
            if (media[i] > mediaGeral) {
                contador++;
            }
        }

        System.out.println("A quantidade de alunos que ficaram acima da média foi de " + contador);
    }

    public static void calcularMaiorMedia(double[] media) {
        Scanner a = new Scanner(System.in);
        double maior = 0;
        for (int i = 0; i < 50; i++) {
            if (media[i] > maior) {
                maior = media[i];
            }
        }
        System.out.println("A maior média da turma é " + maior);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] nomes = new String[50];
        double[] primeiraNota = new double[50];
        double[] segundaNota = new double[50];
        double[] media = new double[50];
        double mediaGeral = 0;

        preencher(nomes, primeiraNota, segundaNota, media);
        printar(nomes, media);
        mediaGeral = calcularMediaTurma(media);
        calcularAbaixoDaMediaTurma(media, mediaGeral);
        calcularAcimaDaMediaTurma(media, mediaGeral);
        calcularMaiorMedia(media);

    }
}
