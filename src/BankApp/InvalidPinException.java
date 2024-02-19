package BankApp;

public class InvalidPinException extends RuntimeException{
    public InvalidPinException(String messsage){
        super(messsage);
    }
}
