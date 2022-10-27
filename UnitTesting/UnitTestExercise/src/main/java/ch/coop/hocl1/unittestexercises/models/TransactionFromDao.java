package ch.coop.hocl1.unittestexercises.models;

public class TransactionFromDao {
    private String id;
    private int transactionType;
    private double transactionValue;

    public TransactionFromDao(String id, int transactionType, double transactionValue) {
        this.id = id;
        this.transactionType = transactionType;
        this.transactionValue = transactionValue;
    }

    public String getId() {
        return id;
    }

    public int getTransactionType() {
        return transactionType;
    }

    public double getTransactionValue() {
        return transactionValue;
    }
}
