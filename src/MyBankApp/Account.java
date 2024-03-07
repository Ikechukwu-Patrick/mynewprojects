package MyBankApp;

public class Account {
    private  String name;
    private int balance;
    private String pin;
    private String accountNumber;

    public Account(String name, String pin, String number){
        this.name = name;
        this.pin = pin;
        this.accountNumber = number;

    }

    public int checkBalance(String pin){
        validatePin(pin);
        return balance;
    }

    public void deposit(int amount){
        if (amount < 0) throw new InvalidAmountException("Invalid amount");
        balance += amount;
    }

    public void withdraw(int amount, String pin){
        validatePin(pin);
        int balanceAfterDeposit = balance - 500;
        boolean amountIsBiggerThanBalance = amount > balanceAfterDeposit;
        if (amountIsBiggerThanBalance)
            throw new InsufficientFundsException("Insufficient fund");
        if (amount < 0)
            throw new InvalidAmountException("Invalid input, input positive number");
        balance -= amount;

    }
    private void validatePin(String pin) {
        if (!(this.pin.equals(pin))) throw new InvalidPinException("Your pin is incorrect");
    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }
}
