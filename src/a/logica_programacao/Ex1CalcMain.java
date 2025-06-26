package a.logica_programacao;

import java.util.Scanner;

public class Ex1CalcMain {
    public static void main(String[] args) {
        //Calculadora Simples:
        //Crie um programa que solicite dois números e uma operação (+, -, *, /) e exiba o resultado.

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int n1 = sc.nextInt();

        System.out.println("Digite a operação desejada: ");
        char op = sc.next().charAt(0);

        System.out.println("Digite o segundo número: ");
        int n2 = sc.nextInt();

        switch (op) { //Estrutura condicional para cada tipo de operação desejada
            case '+':
                System.out.println("Resultado: " + (n1 + n2));
                break;
            case '-':
                System.out.println("Resultado: " + (n1 - n2));
                break;
            case '*':
                System.out.println("Resultado: " + (n1 * n2));
                break;
            case '/':
                System.out.println("Resultado: " + (n1 / n2));
                break;
        }

        sc.close();
    }
}
