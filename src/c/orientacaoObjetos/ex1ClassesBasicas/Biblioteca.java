package c.orientacaoObjetos.ex1ClassesBasicas;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    // Lista para armazenar livros
    private List<Livro> livros = new ArrayList<>();

    //Metodo para adicionar livro à lista
    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    //Metodo para listar todos os livros
    public void listarLivros() {
        System.out.println("\n--- Livros na Biblioteca ---");
        for (Livro livro : livros) {
            livro.exibirDetalhes();
            System.out.println("---------------------------");
        }
    }
}
