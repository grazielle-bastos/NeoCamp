package c.orientacao.ex1ClassesBasicas;

public class Main {
    public static void main(String[] args) {
        // Criar biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // Criar livros
        Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis", 1899);
        Livro livro2 = new Livro("1984", "George Orwell", 1949);

        // Adicionar livros à biblioteca
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        // Listar livros
        biblioteca.listarLivros();
    }
}
