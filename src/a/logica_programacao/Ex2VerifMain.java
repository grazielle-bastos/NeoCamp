package a.logica_programacao;

import java.util.Scanner;

public class Ex2VerifMain {
    public static void main(String[] args) {
        //Verificação de Número Par ou Ímpar:
        //Crie um programa que verifique se um número é par ou ímpar.

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("Este número é par");
        } else {
            System.out.println("Este número é ímpar");
        }

    }
}
