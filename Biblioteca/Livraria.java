package Biblioteca;

import java.util.Scanner;

public class Livraria {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        livro mf = new livro(100);
        char op;
        String isbn;
        livro p;
        double preco;
        do {
            exibeMenu();
            op = in.next().charAt(0);
            in.nextLine();
            switch (op) {
                case '1':
                    System.out.println("Informe o codigo do livro: ");
                    isbn = in.nextLine();
                    p = new livro(isbn);
                    mf.CadastroLivros(p);
                    break;
                case '2':
                    mf.exibirlivro();
                    break;
                case '3':
                    System.out.println("Informe o codigo do livro: ");
                    isbn = in.nextLine();
                    System.out.println("Informe o novo preço do livro: ");
                    in.nextDouble();
                    mf.alterarPreco(preco);
                    break;
                case '4':
                    mf.bubblesort();
                    break;
                case '0':
                    System.out.println("Você acabou de sair do programa! Tchau");
                default:
                    System.out.println("Opcão inválida");
            }
        } while (op != '0');
    }

    public static void exibeMenu() {
        System.out.println("Opções");
        System.out.println("1 - Cadastrar um livro");
        System.out.println("2 - Exibir livros cadastrados");
        System.out.println("3 - Alterar preço de um livro");
        System.out.println("4 - Ordenar cadastro");
        System.out.println("0 - Sair do programa");
    }
}