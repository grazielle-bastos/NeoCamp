package c.orientacaoObjetos.ex2Encapsulamento;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        // Criando livros válidos
        Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis", 1899);
        Livro livro2 = new Livro("1984", "George Orwell", 1949);

        // Adicionando à biblioteca
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        // Listando livros
        biblioteca.listarLivros();

        // Testando busca
        Livro livroEncontrado = biblioteca.buscarLivroPorTitulo("dom casmurro");
        if (livroEncontrado != null) {
            System.out.println("\nLivro encontrado:");
            livroEncontrado.exibirDetalhes();
        } else {
            System.out.println("\nLivro não encontrado!");
        }

        // Testando validação (descomente para ver o erro)
        // Livro livroInvalido = new Livro("", "Autor Desconhecido", -2023);
    }
}
