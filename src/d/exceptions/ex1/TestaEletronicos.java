package d.exceptions.ex1;

public class TestaEletronicos {

    //Passo 1 - Em algum metodo X, lance essa exception com "throw new SuaException()".

    //a) Metodo X, que lança a exceção na assinatura

    //Throws indica que o metodo pode lançar uma exceção
    public static void testarLigarEletronico() throws EletronicosException {
        // Simula uma situação de erro ao ligar um eletrônico, lançando a exceção
        throw new EletronicosException(false);
    }

    //d) - E em um outro metodo Y, chame o metodo X.

    public static void testarReiniciarEletronico() throws EletronicosException {
        // Chama o metodo que lança a exceção
        testarLigarEletronico();
    }

    public static void main(String[] args) {

        //b) Verifique que o compilador te obrigará a tratar com try-catch ou lançar na assinatura do metodo.

        //testarLigarEletronico(); // ERRO! EletronicosException não tratada


        //c) - Lance na assinatura do metodo X,

        //Tenta chamar o metodo que lança a exceção, dentro do bloco try
        try {
            testarLigarEletronico();
            //Se a exceção for lançada, o catch captura e trata a exceção, neste caso, apenas exibindo a mensagem
        } catch (EletronicosException e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        }


        //e) Verifique que o compilador novamente te obrigará a tratar a exceção checada.

        //testarReiniciarEletronico(); // ERRO! EletronicosException não tratada

        //f) Verifique que o compilador identifica a propagação das exceções checadas até que seja tratada com try-catch.
        //Lembrete: No metodo main, a exceção é tratada com try-catch, então não é necessário lançar na assinatura do metodo para não atribuir a responsabilidade de tratamento para o servidor de aplicação ou para o metodo chamador.

        //Chama o metodo Y, que consome o metodo X
        try {
            testarReiniciarEletronico();
        } catch (EletronicosException e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        }
    }

}
