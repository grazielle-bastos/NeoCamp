package c.orientacao.ex2Encapsulamento;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    // Lista privada (encapsulamento)
    private List<Livro> livros = new ArrayList<>();

    // Adiciona livro com validação implícita (via setters)
    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    // Lista todos os livros
    public void listarLivros() {
        System.out.println("\n--- Livros na Biblioteca ---");
        for (Livro livro : livros) {
            livro.exibirDetalhes();
            System.out.println("---------------------------");
        }
    }

    // Busca livro por título (case-insensitive)
    public Livro buscarLivroPorTitulo(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }
        return null; // Retorna null se não encontrar
    }
}
