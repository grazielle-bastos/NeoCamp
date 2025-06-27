package c.orientacao.ex2Encapsulamento;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;

    //Adição do Construtor (uso de setters para garantir aplicação das validações, mesmo na criação do objeto)
    public Livro(String titulo, String autor, int anoPublicacao) {
        setTitulo(titulo);
        setAutor(autor);
        setAnoPublicacao(anoPublicacao);
    }

    //Encapsulamento com métodos controlados - Getters (acesso aos atributos)
    // Getters e Setters com validação
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    //Encapsulamento com métodos controlados - Setters (validações para garantir integridade dos dados, evita duplicação de validações, quando necessário, para reuso de código)
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public void exibirDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano: " + anoPublicacao);
    }
}
