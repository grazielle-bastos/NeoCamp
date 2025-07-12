package d.exceptions.ex3;

//Crie um try-catch-finally (CENÁRIO SEM EXCEPTION)
//No TRY, coloque um print, depois uma instrução que NÃO lança exception, e depois um outro print
//No CATCH e no FINNALY, coloque um print em cada
//Verifique que o TRY e o FINNALY serão executados completamente

public class TestaEletronicos {

    private boolean ligado = true;

    public void ligar() {
        ligado = true;
    }

    public boolean isLigado() {
        return ligado;
    }

    public static void main(String[] args) {

        TestaEletronicos e = new TestaEletronicos();

        try {
            if (e.isLigado()) {
                System.out.println("Luz verde acesa");
            }
            e.ligar();
        } catch (Exception ex) {
            System.out.println("Luz vermelha acesa");
        } finally {
            System.out.println("Mantém acesa a luz azul");
        }

    }
}
