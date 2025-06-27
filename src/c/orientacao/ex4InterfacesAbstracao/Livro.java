package c.orientacao.ex4InterfacesAbstracao;

public class Livro extends Item {
    public Livro(String titulo, String autor, int anoPublicacao) {
        super(titulo, autor, anoPublicacao); // Chama o construtor da classe abstrata
    }

    //Implementação do metodo abstrato getTipo()
    @Override
    public String getTipo() {
        return "Livro";
    }

    // Implementação do metodo da interface
    @Override
    public void exibirDetalhes() {
        System.out.println("Tipo: " + getTipo());
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano: " + anoPublicacao);
    }
}
