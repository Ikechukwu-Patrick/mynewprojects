package MyBankApp;

public class InvalidAmountException extends RuntimeException{
    public InvalidAmountException(String response){
        super("Message");
    }
}
