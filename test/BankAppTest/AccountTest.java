package BankAppTest;
import BankApp.Account;
import BankApp.InvalidAmountException;
import BankApp.InvalidPinException;
import BankApp.InvalidPinException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class AccountTest {
    @Test
    public void testThatBankAccountIsZero(){
        Account myAccount = new Account("Omiewa", 0, "5544",24005);
        assertEquals(0, myAccount.getBalance());

    }

    @Test
    public void testThatPositiveNumberCanBeDepositedInToAccount(){
        Account myAccount = new Account("Omiewa", 0,"456", 90009 );
        myAccount.deposit(2000);
        assertEquals(2000, myAccount.getBalance());
    }

    @Test
    public void testThatPositiveValueCanBeDepositedTwiceToAccount(){
        Account myAccount = new Account("Omiewa",0,"900",98744);
        myAccount.deposit(2000);
        myAccount.deposit(50000);
        assertEquals(52000, myAccount.getBalance());


    }

    @Test
    public void testThatAccountThrowsExceptionWhenGivenNegativeNumber(){
        Account myAccount = new Account("Omiewa",0,"9987",7808);
        assertThrows(InvalidAmountException.class, ()-> myAccount.deposit(-5000));
        assertEquals(0, myAccount.getBalance());

    }

    @Test
    public void testThatPositiveNumberCanBeWithdrawn(){
        Account myAccount = new Account("Omiewa", 0,"9900",22000);
        myAccount.deposit(5000);
        assertThrows(InvalidPinException.class, ()-> myAccount.withdrawal(70,"7788"));
        assertEquals(5000, myAccount.getBalance());



    }

    @Test
    public void testThatPositiveNumberCanBeWithdrawnTwice(){
        Account myAccount = new Account("Omiewa", 0,"009",55009);
        myAccount.deposit(400);
        myAccount.deposit(50);
        myAccount.withdrawal(40, "009");
        myAccount.withdrawal(50,"009");
        assertEquals(360, myAccount.getBalance());


    }

    @Test
    public void testThatAccountThrowsExceptionWhenTryToWithdrawNegativeNumber(){
        Account myAccount = new Account("Omiewa", 0, "9900", 909);
        assertThrows(InvalidAmountException.class, ()-> myAccount.withdrawal(-600,"9900"));
        assertEquals(0,myAccount.getBalance());

    }
    @Test
    public void testThatCheckAccountBalanceWhenMoneyIsDepositedInToAccount(){
        Account myAccount = new Account("Omiewa",0,"7700",5677);
        myAccount.deposit(2000);
        myAccount.balanceChecker(2000);
        assertEquals(2000,myAccount.getBalance());

    }
    @Test
    public void testThatToCheckForBalanceWhenMoneyIsWithdrawn(){
        Account myAccount = new Account("Omiewa",0,"0099",7766);
        myAccount.deposit(10000);
        myAccount.withdrawal(5000,"0099");
        myAccount.balanceChecker(5000);
        assertEquals(5000,myAccount.getBalance());
    }

}
