package c.orientacao.ex1ClassesBasicas;

    public class Livro {
        //Encapsulamento - Atributos privados garantem que o estado do objeto só seja modificado através de métodos controlados.
        private String titulo;
        private String autor;
        private int anoPublicacao;

        // Construtor para inicializar os atributos
        public Livro(String titulo, String autor, int anoPublicacao) {
            this.titulo = titulo;
            this.autor = autor;
            this.anoPublicacao = anoPublicacao;
        }

        // Metodo para exibir detalhes do livro
        public void exibirDetalhes() {
            System.out.println("Título: " + titulo);
            System.out.println("Autor: " + autor);
            System.out.println("Ano: " + anoPublicacao);
        }
}
