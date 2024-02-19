package BankApp;

public class Account {
    private  String name;
    private int balance;
    private String pin;
    private int number;

    public Account(String name, int balance, String pin, int number){
        this.name = name;
        this.balance = balance;
        this.pin = pin;
        this.number = number;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance(){
        return balance;
    }
    
    public void deposit(int amount){
        if (amount < 0) throw new InvalidAmountException("Invalid input, input positive amount");
        balance += amount;
    }
    
    public void withdrawal(int amount, String pin){
        ValidatePin(pin);
        if (balance < amount)
            throw new InsufficientFundsException("Sorry you can not withdraw as your balance is not up to the amount you want to withdraw");
        if (amount < 0) throw new InvalidAmountException("Invalid input, input positive number");
        balance -= amount;

    }

    public void balanceChecker(int amount){
        if (balance > amount){
            balance += amount;
        }
    }



    private void ValidatePin(String pin) {
        if (!(this.pin.equals(pin))) throw new InvalidPinException("Your pin is incorrect, enter the correct pin for this account");
    }


    public void setBalance(int balance) {
        this.balance = balance;
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }



}
