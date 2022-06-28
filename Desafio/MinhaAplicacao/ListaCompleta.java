package Desafio.MinhaAplicacao;

import java.util.Scanner;

public class ListaCompleta extends Lista {

    public static void main(String[] args) {
        Lista ListaCompleta = new Lista();
        Scanner in = new Scanner(System.in);
        char op;
        Medico medico;
        String nome, crm, email, telefone, id;
        do {
            exibirMenu();
            op = in.next().charAt(0);
            in.nextLine();
            switch (op) {
                case '1':
                    System.out.print("Qual é o Crm do médico? ");
                    crm = in.nextLine();
                    medico = new Medico(crm);
                    ListaCompleta.inserirFinal(medico);
                    break;
                case '2':
                    ListaCompleta.alterarInfo();
                    break;
                case '3':
                    ListaCompleta.exibirLista();
                    break;
                case '4':
                    ListaCompleta.remover(crm);
                    break;
                case '0':
                    System.out.println("Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (op != '0');
    }

    public static void exibirMenu() {
        System.out.println("Opções");
        System.out.println("1 - Cadastrar um novo médico");
        System.out.println("2 - Alterar dados ");
        System.out.println("3 - Exibir médicos");
        System.out.println("4 - Deletar médico da lista");
        System.out.println("0 - Sair do programa");
        System.out.print("Informe a opção desejada: ");
    }
}