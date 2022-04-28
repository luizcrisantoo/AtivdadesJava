import java.util.Scanner;

public class VerificarCod {
    public static int verificarCod(String codigo) {
        boolean deucerto = false;
        String baseNum = "0,1,2,3,4,5,6,7,8,9";
        String baseAlfabetica = "a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z";
        String[] codigoA = new String[9];
        codigoA = codigo.split("");
        if (codigo.length() != 9) {
            return 2;
        }
        System.out.println(codigoA);
        for (int i = 1; i < 4; i++) {
            if (codigoA[0] == "A" || codigoA[0] == "a") {
                if (baseAlfabetica.contains(codigoA[i]) == false) {
                    return 3;
                }
            }
        }
        for (int i = 5; i < 9; i++) {
            if (baseNum.contains(codigoA[i]) == false) {
                return 3;
            }
            deucerto = true;
        }
        if (deucerto == false) {
            return 1;
        }
        return 1;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println(" Informe o seu código (no formato correto): ");
        String codigo = s.next();
        int num = verificarCod(codigo);
        if (num == 1) {
            System.out.println("O código " + codigo + " é válido.");
        } else if (num == 2) {
            System.out.println("O código " + codigo + " não é válido: quantidade inválida de caracteres.");
        } else if (num == 3) {
            System.out.println("O código " + codigo + " não é válido: formato incorreto.");
        }

    }
}