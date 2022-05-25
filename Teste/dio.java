package Teste;

import java.util.*;

public class dio {

    // Abaixo segue um exemplo de código que você pode ou não utilizar
    public static void main(String[] args) {
        // a classe Scanner auxilia na leitura dos dados de entrada
        Scanner input = new Scanner(System.in);

        int ano, seculo;

        // hasNext é um método da classe Java Scanner que retorna true se tiver outra
        // entrada
        while (input.hasNext()) {
            System.out.println("Digite o ano para saber o século: ");
            ano = input.nextInt();
            seculo = (ano / 100) + 1;
            System.out.println("Século:" + seculo);

        }
        input.close();
    }
}