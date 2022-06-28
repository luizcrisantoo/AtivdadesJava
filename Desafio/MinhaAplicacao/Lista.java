package Desafio.MinhaAplicacao;

import java.util.*;

public class Lista {

    public boolean isEmpty() { // está vazia?
        if (this.primeiro == null && this.qtd == 0 && this.ultimo == null) {
            return true;
        } else {
            return false;
        }
    }

    public void alterarInfo(String crm) {
        Scanner in = new Scanner(System.in);
        Node aux;
        Medico med;
        String nome;
        String email;
        String telefone;
        aux = this.buscar(crm);
        if (aux == null) {
            System.out.println("Crm inexistente!");
        } else {
            med = aux.getInfo();
            System.out.println("Médico encontrado");
            System.out.print("Informe o nome do médico: ");
            nome = in.nextLine();
            med.setNome(nome);
            System.out.print("Informe o email do médico: ");
            email = in.nextLine();
            med.setEmail(email);
            System.out.print("Informe o telefone do médico: ");
            telefone = in.nextInt();
            in.nextLine();
            med.setFaltas(telefone);
            System.out.println("Alterações efetuadas!");
        }
    }

    private Node buscar(String crm) {
        Node aux;
        if (this.isEmpty() == true) {
            return null;
        } else {
            Medico proc = new Medico(crm);
            aux = this.primeiro;
            while (aux != null) {
                if (aux.getInfo().equals(proc) == true) {
                    return aux;
                } else {
                    aux = aux.getProx();
                }
            }
            return null;
        }
    }

    public void inserirFinal(Medico med) {
        Node novo = new Node(med);
        Node aux;
        if (this.isEmpty() == true) {
            this.primeiro = novo;
            this.ultimo = novo;
            this.qtd++;
            System.out.println("Cadastro realizado com sucesso!");
        } else {
            aux = this.buscar(med.getCrm());
            if (aux == null) {
                this.ultimo.setProx(novo);
                this.ultimo = novo;
                this.qtd++;
                System.out.println("Cadastro efetuada com sucesso!");
            } else {
                System.out.println("Crm repetido. Não pode fazer cadastro.");
            }
        }
    }

    public void exibirLista() {
        Node aux;
        if (this.isEmpty() == true) {
            System.out.println("Não existem médicos cadastrados!");
        } else {
            aux = this.primeiro;
            while (aux != null) {
                System.out.println(aux.getInfo());
                aux = aux.getProx();
            }
        }
    }

    public void remover(String crm) {
        Medico proc = new Medico(crm);
        Node anterior, atual;
        boolean achou = false;
        if (this.isEmpty() == true) {
            System.out.println("Lista vazia");
        } else if (this.qtd == 1) {
            if (proc.equals(this.primeiro.getInfo())) {
                this.primeiro = null;
                this.ultimo = null;
                this.qtd = 0;
                System.out.println("Removido!");
            } else {
                System.out.println("Não encontrado!");
            }
        } else { // lista tem mais de um elemento
            if (proc.equals(this.primeiro.getInfo()) == true) { // é o primeiro?
                this.primeiro = this.primeiro.getProx();
                this.qtd--;
                System.out.println("Removido!");
            } else if (proc.equals(this.ultimo.getInfo()) == true) { // é o último?
                anterior = this.primeiro;
                while (anterior.getProx() != this.ultimo) {
                    anterior = anterior.getProx();
                }
                anterior.setProx(null);
                this.ultimo = anterior;
                this.qtd--;
                System.out.println("Removido!");
            } else { // é um do meio ?
                anterior = this.primeiro;
                atual = anterior.getProx();
                while (atual != null) {
                    if (proc.equals(atual.getInfo()) == true) {
                        anterior.setProx(atual.getProx());
                        this.qtd--;
                        System.out.println("Removido!");
                        achou = true;
                        break;
                    } else {
                        atual = atual.getProx();
                        anterior = anterior.getProx();
                    }
                }
                if (achou == false) {
                    System.out.println("Não achei!");
                }
            }
        }
    }
}