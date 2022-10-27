package unittest.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AccountTest {

    private Account account = null;

    @BeforeEach
    void setUp() throws Exception {
        account = new Account(100);
    }

    @Test
    void testAccount() {
        assertTrue(account.getBalance() == 100);
    }

    @Test
    void testGetBalance() {
        assertEquals(100, account.getBalance(), 0.001);
    }

    @Test
    void testWithdraw() {
        assertTrue(account.withdraw(69) == true);
    }

    @Test
    void testDeposit() {
        account.deposit(69);
        assertEquals(169, account.getBalance(), 0.001);
    }
}
