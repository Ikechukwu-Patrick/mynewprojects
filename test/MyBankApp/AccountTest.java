package MyBankApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
    Account myAccount;

    @BeforeEach
    void testThisMethodFirst() {
        myAccount = new Account("Omiewa", "pin", "310000");
    }
@Test
void testAccountNumber(){
        assertEquals("310000",myAccount.getAccountNumber());
}
    @Test
    public void test_that_if_i_deposit_1k_balance_is_1k_with_correct_pin() {
        myAccount.deposit(1000);
        assertEquals(1000, myAccount.checkBalance("pin"));

    }

    @Test
    public void test_that_if_i_deposit_2k_balance_is_2k_with_correct_pin() {
        myAccount.deposit(1000);
        myAccount.deposit(1000);
        myAccount.deposit(10000);
        assertEquals(12000, myAccount.checkBalance("pin"));

    }

    @Test
    public void test_that_if_i_deposit_2000k_with_wrong_pin_it_should_throw_invalid_pin_exception() {
        myAccount.deposit(2000);
        assertThrows(InvalidPinException.class, () -> myAccount.checkBalance("1234"));
        assertEquals(2000, myAccount.checkBalance("pin"));
    }
    @Test
    public void test_that_account_can_get_number(){
        myAccount.getAccountNumber();
        assertEquals("310000", myAccount.getAccountNumber());
    }
    @Test
    public void test_that_if_i_deposit_negative_amount_throws_invalid_amount_exception(){
        assertThrows(InvalidAmountException.class,()-> myAccount.deposit(-2000));
    }
    @Test
    public void test_that_if_i_withdraw_negative_amount_throw_invalid_amount_exception(){
        assertThrows(InvalidAmountException.class,()->myAccount.withdraw(-2000,"pin"));
    }
    @Test
    public void test_that_If_i_deposit_2000k_and_withdraw_greater_than_amount_throw_insufficient_funds_exception(){
        myAccount.deposit(2000);
        assertThrows(InsufficientFundsException.class,()->myAccount.withdraw(3000,"pin"));
    }
    @Test
    public void test_that_if_i_deposit_2000k_account_must_be_left_with_500(){
        myAccount.deposit(2000);
        assertThrows(InsufficientFundsException.class,()-> myAccount.withdraw(2000,"pin"));

    }



}


