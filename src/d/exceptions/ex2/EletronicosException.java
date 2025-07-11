package d.exceptions.ex2;

//Crie uma exceção qualquer que extenda de RuntimeException. Será uma exceção não-checada.

public class EletronicosException extends RuntimeException {

    public EletronicosException(String message) {
        super(message);
    }

}
