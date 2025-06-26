package a.logica_programacao;

import java.util.Scanner;

public class Ex3FatMain {
    public static void main(String[] args) {
        //Fatorial de um Número:
        //Crie um programa que calcule o fatorial de um número dado.

        //Fatorial: Produto de todos os inteiros positivos menores ou iguais a n. Ex. Fatorial de 5 = 5 * 4 * 3 * 2 * 1 = 120
        //Cálculo do fatorial: (n!) = n*(n-1), n*(n-2), até resultar em 1...

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número inteiro: ");
        int n = sc.nextInt();

        int fatorial = 1; //O fatorial de 0 e 1 é 1, logo inicializa em 1 (elemento neutro da multiplicação).

        for(int i = 2; i <= n; i++) { //Loop de 2 a 'n', pois se 'n' for 0 ou 1, o loop não executa/multiplica, e o 'fatorial' permanece 1.
            fatorial *= i; //Multiplica 'fatorial' por cada número de 2 até 'n', acumulando o produto.
        }

        System.out.printf("O fatorial de %d é %d\n", n, fatorial); //A impressão ocorre após o loop, com o resultado do fatorial de 'n'.

        sc.close();
    }
}
