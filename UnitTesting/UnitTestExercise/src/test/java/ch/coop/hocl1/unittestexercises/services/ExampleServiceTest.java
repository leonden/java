package ch.coop.hocl1.unittestexercises.services;

import ch.coop.hocl1.unittestexercises.models.Transaction;
import ch.coop.hocl1.unittestexercises.models.TransactionFromDao;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ExampleServiceTest {

    private ExampleService testee = new ExampleService();

    @Test
    void positiveTest_transformTransaction_cardType10() {
        TransactionFromDao transactionFromDao = new TransactionFromDao("123", 10, 21.00);

        Transaction result = testee.transformTransaction(transactionFromDao);

        Assertions.assertEquals("123", result.getId());
        Assertions.assertEquals("Kartenaufladung mit Cash", result.getTransactionType());
        Assertions.assertEquals(21.00, result.getTransactionValue());
    }

}
