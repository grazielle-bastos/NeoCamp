package c.orientacaoObjetos.ex3Heranca;

public class Main {

    public static void main(String[] args) {
        // Criar biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // Criar livro e revista (polimorfismo)
        Livro livro = new Livro("Dom Casmurro", "Machado de Assis", 1899);
        Revista revista = new Revista("National Geographic", "Vários Autores", 2023, 150);

        // Adicionar à biblioteca
        biblioteca.adicionarLivro(livro);
        biblioteca.adicionarLivro(revista); // Revista é tratada como Livro (herança)

        // Listando itens (exibe detalhes específicos de cada um)
        biblioteca.listarLivros();
    }
}

