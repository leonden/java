package ch.coop.hocl1.unittestexercises.services;

import ch.coop.hocl1.unittestexercises.models.Transaction;
import ch.coop.hocl1.unittestexercises.models.TransactionFromDao;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ExampleService {


    private static Map<Integer, String> transactionMapping;

    static {
        Map<Integer, String> map = new HashMap<>();
        map.put(10, "Kartenaufladung mit Cash");
        map.put(11, "Kartenaufladung mit Superpunkten");
        map.put(20, "Bezahlung");

        transactionMapping = Collections.unmodifiableMap(map);
    }

    public Transaction transformTransaction(TransactionFromDao transactionFromDao) {
        String translatedTransaction = transactionMapping.get(transactionFromDao.getTransactionType());

        return new Transaction(transactionFromDao.getId(), translatedTransaction, transactionFromDao.getTransactionValue());
    }

}
