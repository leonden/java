package ch.coop.hocl1.unittestexercises;

import ch.coop.hocl1.unittestexercises.models.Transaction;
import ch.coop.hocl1.unittestexercises.models.TransactionFromDao;
import ch.coop.hocl1.unittestexercises.services.ExampleService;

public class Application {

    public static void main(String[] args) {
        ExampleService exampleService = new ExampleService();

        TransactionFromDao transactionFromDao = new TransactionFromDao("123", 10, 10.00);

        Transaction someTransaction = exampleService.transformTransaction(transactionFromDao);

        System.out.println(someTransaction.getTransactionType());
    }

}
