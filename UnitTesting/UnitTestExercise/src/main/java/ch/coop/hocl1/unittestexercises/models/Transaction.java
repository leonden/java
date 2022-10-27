package ch.coop.hocl1.unittestexercises.models;

public class Transaction {
    private String id;
    private String transactionType;
    private double transactionValue;

    public Transaction(String id, String transactionType, double transactionValue) {
        this.id = id;
        this.transactionType = transactionType;
        this.transactionValue = transactionValue;
    }

    public String getId() {
        return id;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public double getTransactionValue() {
        return transactionValue;
    }
}
