package c.orientacao.ex4InterfacesAbstracao;

public abstract class Item implements ItemBiblioteca { //Classe abstrata permite definir comportamentos comuns e métodos abstratos (sem implementação)
    protected String titulo;
    protected String autor;
    protected int anoPublicacao;

    //Construtor da classe abstrata, para atributos comuns
    public Item(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    //Metodo abstrato para retornar o tipo do item
    public abstract String getTipo();
}
