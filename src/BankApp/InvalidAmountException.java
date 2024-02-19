package BankApp;

public class InvalidAmountException extends RuntimeException{
    public InvalidAmountException(String response){
        super("Message");
    }
}
