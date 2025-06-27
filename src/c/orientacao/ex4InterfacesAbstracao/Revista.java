package c.orientacao.ex4InterfacesAbstracao;

public class Revista extends Item {
    private int edicao;

    public Revista(String titulo, String autor, int anoPublicacao, int edicao) {
        super(titulo, autor, anoPublicacao); //Chama o construtor da classe pai (Livro), para inicializar os atributos herdados
        this.edicao = edicao;
    }

    // Implementação do metodo abstrato
    @Override
    public String getTipo() {
        return "Revista";
    }

    // Implementação do metodo da interface
    @Override
    public void exibirDetalhes() {
        System.out.println("Tipo: " + getTipo());
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano: " + anoPublicacao);
        System.out.println("Edição: " + edicao);
    }

}