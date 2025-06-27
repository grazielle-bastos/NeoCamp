package c.orientacaoObjetos.ex4InterfacesAbstracao;

public class Main {
    public static void main(String[] args) {
        // Cria biblioteca (agora com suporte a Itens)
        Biblioteca biblioteca = new Biblioteca();

        // Cria itens (polimorfismo: Item pode ser Livro ou Revista)
        Item livro = new Livro("Dom Casmurro", "Machado de Assis", 1899);
        Item revista = new Revista("Veja", "Editora Abril", 2023, 1500);

        // Adicionar itens à biblioteca
        biblioteca.adicionarItem(livro);
        biblioteca.adicionarItem(revista);

        // Listar todos os itens
        biblioteca.listarItens();
    }
}
