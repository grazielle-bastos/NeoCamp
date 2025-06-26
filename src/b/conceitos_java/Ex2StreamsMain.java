package b.conceitos_java;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex2StreamsMain {
    public static void main(String[] args) {
        //Crie um programa que receba uma lista de números inteiros do usuário e use streams para:
        //1. Filtrar os números ímpares.
        //2. Dobrar os valores dos números ímpares.
        //3. Ordenar os números resultados em ordem crescente.
        //4. Exibir a lista final.

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite números inteiros separados por espaços (ex: 1 2 3 4 5):");
        String numS = sc.nextLine();

        //Converte a entrada do usuário em uma lista de inteiros
        List<Integer> numeros = Arrays.stream(numS.split(" ")) //numS.split(" ") para separar os números em um array de strings
                .map(Integer::parseInt) //Converte cada string para inteiro
                .collect(Collectors.toList()); //Coleta tudo em uma lista

        List<Integer> resultado = numeros.stream() //Processamento com Streams
                .filter(n -> n % 2 != 0) //1. Operação para filtrar ímpares na lista
                .map(n -> n * 2) //2. Operação para dobrar os valores, multiplicando cada número ímpar por 2
                .sorted() //3. Operação para ordenar os números resultantes em ordem crescente ('Integer' já implementa comparação natural).
                .collect(Collectors.toList()); //4. Operação para coleta em uma lista, transforma o stream processado de volta em uma lista.

        System.out.println("Resultado final: " + resultado);

        sc.close();
    }
}