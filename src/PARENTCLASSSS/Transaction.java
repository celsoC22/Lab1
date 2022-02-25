package PARENTCLASSSS;

import java.time.LocalDateTime;

public class Transaction {
    protected int store_id;
    protected int transaction_id;
    protected LocalDateTime timestamp;
    protected int account_id;
    protected Double amount;

    //Creating Constructors

    public Transaction(int store_id, int transaction_id, int account_id, Double amount) {
        this.store_id = store_id;
        this.transaction_id = transaction_id;
        this.timestamp = LocalDateTime.now();
        this.account_id = account_id;
        this.amount = amount;


    //generating Getters for the Protected Variables
    }

    public int getStore_id() {
        return store_id;
    }

    public int getTransaction_id() {
        return transaction_id;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public int getAccount_id() {
        return account_id;
    }

    public Double getAmount() {
        return amount;
    }



    //Over-riding the toString() function as a class function
    @Override
    public String toString(){

        String output =
                "\n[TRANSACTION] " +
                        "\nTransaction ID: " + this.transaction_id +
                        "\nACCOUNT.Account ID: " + this.account_id +
                        "\nStore ID: " + this.store_id +
                        "\nAmount: " + this.amount +
                        "\nTimestamp: " + this.timestamp;

        return output;
    }

}
