package TRANSACTION.SUBCLASS;

import PARENTCLASSSS.Transaction;

public class BuyLoad extends Transaction {

    private Long msisdn;

    //super keyword for calling the parent Parameters, and adding msisdn Parameters

    public BuyLoad(int store_id, int transaction_id, int account_id, Double amount, Long msisdn) {
        super(store_id, transaction_id, account_id, amount);
        this.msisdn = msisdn;
    }

    //generating Getters for the private Variable
    public Long getMsisdn() {
        return msisdn;
    }


    //Over-riding the toString() function as a class function

    @Override
    public String toString() {

        String output =
                "\n[BUY LOAD] " +
                        "\nTransaction ID: " + this.transaction_id +
                        "\nACCOUNT.Account ID: " + this.account_id +
                        "\nStore ID: " + this.store_id +
                        "\nMSISDN: " + this.msisdn +
                        "\nAmount: " + this.amount +
                        "\nTimestamp: " + this.timestamp;

        return output;
    }
}
