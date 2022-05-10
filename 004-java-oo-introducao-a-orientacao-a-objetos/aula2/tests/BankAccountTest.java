import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    BankAccount bankAccount, destinationAccount;

    @BeforeEach
    void setUp() {
        this.bankAccount = new BankAccount();
        this.destinationAccount = new BankAccount();
    }

    @AfterEach
    void tearDown() {
        this.bankAccount = null;
        this.destinationAccount = null;
    }

    @Test
    void it_has_an_active_account() {
        assertTrue(this.bankAccount.active);
    }

    @Test
    void it_can_deposit_values() {
        this.bankAccount.deposit(200);
        this.bankAccount.deposit(200);

        assertEquals(400, this.bankAccount.balance);
    }

    @Test
    void it_can_withdraw_values() {
        this.bankAccount.deposit(100);

        assertTrue(this.bankAccount.withdraw(50));
        assertEquals(50, this.bankAccount.balance);
    }

    @Test
    void it_can_withdraw_an_zero_an_account() {
        this.bankAccount.deposit(100);

        assertTrue(this.bankAccount.withdraw(100));
        assertEquals(0, this.bankAccount.balance);
    }

    @Test
    void it_cannot_withdraw_values() {
        assertFalse(this.bankAccount.withdraw(100));
        assertEquals(0, this.bankAccount.balance);
    }

    @Test
    void it_can_transfer_values() {
        this.bankAccount.deposit(500);
        boolean successfulTransfer = this.bankAccount.transfer(250, this.destinationAccount);

        assertTrue(successfulTransfer);
        assertEquals(250, this.bankAccount.balance);
        assertEquals(250, this.destinationAccount.balance);
    }

    @Test
    void it_cannot_transfer_values() {
        boolean invalidTransfer = this.bankAccount.transfer(100, this.destinationAccount);

        assertFalse(invalidTransfer);
        assertEquals(0, this.bankAccount.balance);
        assertEquals(0, this.destinationAccount.balance);
    }

}