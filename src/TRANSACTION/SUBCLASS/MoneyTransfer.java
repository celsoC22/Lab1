package TRANSACTION.SUBCLASS;

import PARENTCLASSSS.Transaction;

public class MoneyTransfer extends Transaction {

    private String recipient;

    //super keyword for calling the parent Parameters, and adding recipient Arguments/Parameters
    public MoneyTransfer(int store_id, int transaction_id, int account_id, Double amount, String recipient) {

        super(store_id, transaction_id, account_id, amount);
        this.recipient = recipient;
    }

    //Generating Getters for the Private Variable
    public String getRecipient() {
        return recipient;
    }


    //Over-riding the toString() function as a class function

    @Override
    public String toString() {

        String output =
                "\n[MONEY TRANSFER] " +
                        "\nTransaction ID: " + this.transaction_id +
                        "\nACCOUNT.Account ID: " + this.account_id +
                        "\nStore ID: " + this.store_id +
                        "\nRecipient: " + this.recipient +
                        "\nAmount: " + this.amount +
                        "\nTimestamp: " + this.timestamp;

        return output;
    }


}
