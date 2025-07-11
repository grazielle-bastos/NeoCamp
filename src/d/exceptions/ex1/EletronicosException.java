package d.exceptions.ex1;

//Crie uma exceção qualquer que extenda de Exception. Será uma exceção checada.

//Exceção checada = É personalizada, e estende Exception.
public class EletronicosException extends Exception {

    //Construtor padrão
    public EletronicosException(){
        super(); //Chama o construtor padrão da classe Exception
    }

    //Construtor com mensagem
    public EletronicosException (Boolean ligar) {
        super(String.valueOf(ligar)); // Chama o construtor da classe Exception que recebe uma mensagem
    }

}