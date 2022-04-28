package Biblioteca;

import java.util.Scanner;

public class CadastroLivros {
    // atributos
    private Livro[] dados;
    private int contador;
    private boolean ordenado;

    // construtor
    public CadastroLivros(int tamanho) {
        this.dados = new Livro[tamanho];
    }

    public void cadastrarLivro(Livro livro) {
        Scanner in = new Scanner(System.in);
        String ISBN, titulo;
        double preco;
        int Estoque;
        int pos;
        if (this.contador == this.dados.length) {
            System.out.print("Cadastro cheio! ");
            System.out.println("Produto não pode ser cadastrado!");
        } else {
            pos = this.buscarLivro(livro);
            if (pos == -1) {
                System.out.print("Informe o ISBN do livro: ");
                ISBN = in.nextLine();
                livro.setISBN(ISBN);
                System.out.print("Informe o titulo do livro: ");
                titulo = in.nextLine();
                livro.settitulo(titulo);
                System.out.print("Informe o preço do livro: ");
                preco = in.nextDouble();
                in.nextLine();
                livro.setPreco(preco);
                System.out.print("Informe o livro do produto: ");
                Estoque = in.nextInt();
                in.nextLine();
                livro.atualizarEstoque(Estoque);
                this.dados[this.contador] = livro;
                this.contador++;
                System.out.println("Livro cadastrado com sucesso!");
            } else {
                System.out.println("Já existe um livro com este ISBN no cadastro.");
            }
        }
    }

    public void exibirLivros() {
        int i;
        if (this.contador == 0) {
            System.out.println("Cadastro de Livros vazio!");
        } else {
            for (i = 0; i <= this.contador - 1; i++) {
                System.out.println(this.dados[i]);
            }
        }
    }

    private int buscarLivro(Livro livro) {
        int i;
        if (this.contador == 0) {
            return -1;
        } else {
            for (i = 0; i <= this.contador - 1; i++) {
                if (this.dados[i].compareTo(livro) == 0) {
                    return i;
                }
            }
            return -1;
        }
    }

    public void alterarPreco(String ISBN, char tipo, double perc) {
        int pos;
        Livro livro;
        double preco, diferenca;
        if (this.contador == 0) {
            System.out.println("Cadastro vazio!");
        } else {
            livro = new Livro(ISBN);
            pos = this.buscarLivro(livro);
            if (pos == -1) {
                System.out.println("Este produto não está cadastrado");
            } else {
                preco = this.dados[pos].getPreco();
                System.out.println("Preço atual: " + preco);
                diferenca = preco * perc / 100;
                if (tipo == '1') {
                    preco = preco + diferenca;
                } else {
                    preco = preco - diferenca;
                }
                this.dados[pos].setPreco(preco);
                System.out.println("Alteracao realizada com sucesso!");
                System.out.println("Novo preço: " + preco);
            }
        }
    }
}
