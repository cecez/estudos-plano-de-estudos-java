import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    BankAccount bankAccount;

    @BeforeEach
    void setUp() {
        this.bankAccount = new BankAccount();
    }

    @AfterEach
    void tearDown() {
        this.bankAccount = null;
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

}