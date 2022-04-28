package Biblioteca;

public class Livro implements Comparable<Livro> {
    String ISBN;
    String Titulo;
    double Preco;
    int Estoque;

    public Livro(String ISBN) {
        this.ISBN = bn;
    }

    public Livro(String isbn, String titulo, double preco, int estoque) {
        this.ISBN = isbn;
        this.Titulo = titulo;
        this.Preco = preco;
        this.Estoque = estoque;
    }

    // Começar os GETS
    public String getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getPreco() {
        return Preco;
    }

    public String getEstoque() {
        return Estoque;
    }

    // Começar os SETS
    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public void setPreco(double Preco) {
        this.Preco = Preco;
    }

    public void setEstoque(int Estoque) {
        this.Estoque = Estoque;
    }

    // Adicionar os toString
    public String toString(double Preco, int Estoque){
        String PrecoToString = Double.toString(preco);
        String EstoqueToString = Integer.toString(Estoque);
        return " "+ ISBN + " " + Titulo + " " + PrecoToString + " " + EstoqueToString +   
    }

    public int compareTo(Livro outroLivro) {
        int resultado;
        resultado = this.ISBN.compareTo(outroLivro.ISBN);
        return resultado;
    }
}
