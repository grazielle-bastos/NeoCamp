package c.orientacaoObjetos.ex3Heranca;

public class Livro {
    // Atributos protegidos (para permitir acesso nas subclasses)
    protected String titulo;
    protected String autor;
    protected int anoPublicacao;

    //Construtor
    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    // Metodo para exibir detalhes (será sobrescrito na subclasse)
    public void exibirDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de Publicação: " + anoPublicacao);
    }
}
