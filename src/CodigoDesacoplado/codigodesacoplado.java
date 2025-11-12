package CodigoDesacoplado;

import java.util.Scanner;

public class codigodesacoplado {
    public static void main (String[] args) {

        System.out.println("Digite um numero:");
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();

        System.out.println("Digite um nome:");
        String nome = scanner.next();

        crescente(x);
        decrescente(x);

        if (nome.length()>6) {
            exibenome(x,nome);
        } else {
            System.out.println(nome);
        }
    }

    public static void exibenome(int x, String nome){
        for (int i = x; i>0; i--) {
            System.out.println(nome);
        }
    }

    public static void crescente(int x) {
        for (int n1 = 0; n1<x; n1++) {
            System.out.println(n1);
        }
    }

    public static void decrescente(int x) {
        for (int n2=x; n2>=0; n2--) {
            System.out.println(n2);
        }
    }

}
