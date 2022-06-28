package Desafio.MinhaAplicacao;

public class Node {
    private Medico info;
    private Node prox;

    public Node(Medico med) { // construtor
        this.info = med;
    }

    public void setInfo(Medico med) {
        this.info = med;
    }

    public Medico getInfo() {
        return this.info;
    }

    public void setProx(Node novoProx) {
        this.prox = novoProx;
    }

    public Node getProx() {
        return this.prox;
    }

    public boolean equals(Medico med) {
        if (this.crm.equals(med.crm) == true) {
            return true;
        } else {
            return false;
        }
    }
}