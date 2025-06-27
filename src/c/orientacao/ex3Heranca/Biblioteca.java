package c.orientacao.ex3Heranca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    // Lista de Livros (aceita subclasses como Revista)
    private List<Livro> livros = new ArrayList<>();

    // Adiciona qualquer tipo de Livro (incluindo Revista)
    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    // Lista todos os itens (chama exibirDetalhes() polimorficamente)
    public void listarLivros() {
        System.out.println("\n--- Itens na Biblioteca ---");
        for (Livro livro : livros) {
            livro.exibirDetalhes(); // Chama a versão correta (Livro ou Revista)
            System.out.println("---------------------------");
        }
    }
}