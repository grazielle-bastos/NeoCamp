package a.logica_programacao;

import java.util.Scanner;

public class Ex4TabMain {
    public static void main(String[] args) {
        //Tabuada:
        //Crie um programa que exiba a tabuada de 1 a 10 para um número dado.

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o número inteiro: ");
        int n = sc.nextInt();

        //Repetir 10 vezes, multiplicando n por i até 10
        for (int i = 1; i <= 10; i++) {
            int res = n * i;
            System.out.printf("%d  *  %d = %d\n", n, i, res);
        }

        sc.close();
    }
}
