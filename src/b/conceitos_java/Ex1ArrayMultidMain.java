package b.conceitos_java;

import java.util.Scanner;

public class Ex1ArrayMultidMain {
    public static void main(String[] args) {
        //Crie um programa que preencha uma matriz 3x3 com números inteiros fornecidos pelo usuário.
        //Em seguida, calcule e exiba a soma de todos os elementos da matriz e a soma de cada linha.

        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3]; // Array bidimensional - Cria a matriz 3x3 (3 linhas e 3 colunas)
        int somaTotal = 0; //Guarda a soma de todos os números

        //Preenchimento da Matriz
        //Dois loops for para evitar repetição de código - Repete 3 vezes (0, 1, 2) cada linha, e mais 3 vezes (0, 1, 2) cada coluna.
        for (int linha =0; linha < 3; linha++) { //Loop que percorre a posição de linha
            System.out.println("Linha  " + (linha + 1) + ":");
            for (int coluna = 0; coluna <3; coluna++) {//Loop que percorre a posição de coluna
                System.out.println("Digite o número da posição [" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = sc.nextInt(); //Armazena o número na matriz
                somaTotal += matriz[linha][coluna]; //somaTotal acumula a soma de todos os elementos
            }
        }

        System.out.println("A soma de todos os elementos é: " + somaTotal);

        //Calcula e exibe a soma de cada linha
        for (int linha = 0; linha < 3; linha++) {//Loop para somar os elementos da respectiva linha
            int somaLinha = 0; //Zera a soma a cada nova linha, para recomeçar o cálculo para cada nova linha
            for (int coluna = 0; coluna < 3; coluna++) {
                somaLinha += matriz[linha][coluna]; //Soma os elementos da linha atual
            }
            System.out.println("Soma da linha "+ (linha + 1) + ": " + somaLinha);
        }

        sc.close();
    }
}
