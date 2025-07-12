package d.exceptions.ex4;

//No TRY, coloque um print, depois uma instrução que lança exception,
// e depois um outro print no CATCH e no FINNALY, coloque um print em cada
//Verifique que o TRY será executado apenas até a exception, e o CATCH e o FINNALY serão executados completamente

public class TestaEletronicos {

    public static void main(String[] args) {

        try {
            System.out.println("A luz verde deve estar acesa");
            throw new Exception("Erro ao ligar o eletrônico!"); // lança exceção
        } catch (Exception ex) {
            System.out.println("Luz vermelha acesa: " + ex.getMessage());
        } finally {
            System.out.println("Verifique se a luz azul está acesa");
        }


    }

}
