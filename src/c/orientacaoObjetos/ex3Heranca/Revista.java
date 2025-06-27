package c.orientacaoObjetos.ex3Heranca;

public class Revista extends Livro { //Revista herda atributos e métodos da classe pai Livro, permitindo com a herança, reutilizar o código e criar relações "é um"
    private int edicao;

    //Construtor (chama o construtor da superclasse)
    public Revista(String titulo, String autor, int anoPublicacao, int edicao) {
        super(titulo, autor, anoPublicacao);
        this.edicao = edicao;
    }

    // Sobrescreve o metodo exibirDetalhes() (polimorfismo)
    @Override //Indica que o metodo foi sobrescrito para incluir a edição, personalizando o comportamento de metodos herdados
    public void exibirDetalhes() {
        super.exibirDetalhes(); // Reaproveita o metodo da superclasse Livro, sendo chamado conforme o tipo real do objeto Livro ou Revista.
        System.out.println("Edição: " + edicao);
    }
}