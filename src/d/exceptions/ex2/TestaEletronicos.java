package d.exceptions.ex2;

public class TestaEletronicos {

    //Em algum metodo X, lance essa exception com "throw new SuaException()".

    public static void testarLigarEletronico() throws EletronicosException {
        // Simula uma situação de erro ao ligar um eletrônico, lançando a exceção
        throw new EletronicosException("Erro ao ligar eletrônico");
    }

    //Verifique que o compilador NÃO te obrigará a tratar essa exceção, por ser uma exceção não-checada (RunTimeException).

    //Verifique que o compilador NÃO identifica a propagação das exceções não-checadas por ser RunTimeException.

    public static void main(String[] args) {

        // Chama o metodo que lança a exceção
        testarLigarEletronico();

        // Aqui não é necessário tratar a exceção, pois é uma exceção não-checada
        // O compilador não obriga a tratar exceções não-checadas
        //O código compila normalmente, ao rodar, a exceção será lançada em tempo de execução, encerrando o programa e mostrando a stack trace.
    }

}
