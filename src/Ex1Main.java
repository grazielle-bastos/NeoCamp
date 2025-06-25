import java.util.Scanner;

public class Ex1Main {
    public static void main(String[] args) {
        //● Crie um programa que preencha uma matriz 3x3 com números inteiros fornecidos pelo usuário. Em
        //seguida, calcule e exiba a soma de todos os elementos da matriz e a soma de cada linha.

        Scanner sc = new Scanner(System.in);

        //Primeira linha
        String linha1 = "Primeira linha";
        System.out.println(linha1);

        System.out.print("Digite o número de posição 0: ");
        int n0_1 = sc.nextInt();

        System.out.print("Digite o número de posição 1: ");
        int n1_1 = sc.nextInt();

        System.out.print("Digite o número de posição 2: ");
        int n2_1 = sc.nextInt();

        //Segunda linha
        String linha2 = "Segunda linha";
        System.out.println(linha2);

        System.out.print("Digite o número de posição 0: ");
        int n0_2 = sc.nextInt();

        System.out.print("Digite o número de posição 1: ");
        int n1_2 = sc.nextInt();

        System.out.print("Digite o número de posição 2: ");
        int n2_2 = sc.nextInt();

        //Terceira linha
        String linha3 = "Terceira linha";
        System.out.println(linha3);

        System.out.print("Digite o número de posição 0: ");
        int n0_3 = sc.nextInt();

        System.out.print("Digite o número de posição 1: ");
        int n1_3 = sc.nextInt();

        System.out.print("Digite o número de posição 2: ");
        int n2_3 = sc.nextInt();

        int somaElementos = n0_1 + n1_1 + n2_1 + n0_2 + n1_2 + n2_2 + n0_3 + n1_3 + n2_3;

        System.out.printf("A soma de todos os elementos é: %d\n", somaElementos);
        System.out.print("A soma de cada linha é 3");

    }
}
