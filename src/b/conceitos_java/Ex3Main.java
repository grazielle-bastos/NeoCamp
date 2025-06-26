package b.conceitos_java;

import java.util.*;

public class Ex3Main {
    public static void main(String[] args) {
        //Crie um programa que armazene uma lista de pessoas (nome e idade) usando um Map.
        //1. Armazene as informações em um Map<String, Integer>, como um dicionário, onde a chave é o nome e o valor é a idade.
        //2. Use um Set (coleção que não permite duplicadas) para armazenar os nomes das pessoas com mais de 30 anos.
        //3. Exiba os nomes das pessoas que possuem mais de 30 anos, ordenados em ordem alfabética.

        //Estrutura do Map
        Map<String, Integer> pessoas = new HashMap<>(); //Criação de Map, adição de pessoas (Dicionário de pessoas), para o percorrer e verificar cada idade
        pessoas.put("Mariana", 14); //pessoas.put(...) adiciona entradas ao dicionário
        pessoas.put("Arthur", 32);
        pessoas.put("Ana", 31);
        pessoas.put("Rafael", 33);
        pessoas.put("Ronaldo", 34);

        Set<String> nomesAcima30 = new HashSet<>(); //Criar um Set para nomes com + 30 anos de idade

        //Loop pelo Map
        for (Map.Entry<String, Integer> entrada : pessoas.entrySet()) { //Percorre o Map (cada entrada - par chave-valor) e filtra idades
            String nome = entrada.getKey(); //Obtém o nome
            int idade = entrada.getValue(); //Obtém a idade

            if (idade > 30) {
                nomesAcima30.add(nome); //Adiciona nome ao Set (coleção que não permite duplicadas)
            }
        }

        //Ordena e exibe
        List<String> nomesOrdenados = new ArrayList<>(nomesAcima30); //Converte o Set em List para ordenar
        Collections.sort(nomesOrdenados); //Ordena a lista alfabeticamente

        System.out.println("Nomes com mais de 30 anos (ordenados): " + nomesOrdenados);

    }
}