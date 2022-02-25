package TRANSACTION.SUBCLASS;

import PARENTCLASSSS.Transaction;

public class Bill extends Transaction {

    private String company_name;
    private Double Bills_charge;

    //super keyword for calling the parent Parameters, and adding company_name and Bills_charge Parameters

    public Bill(int store_id, int transaction_id, int account_id, Double amount, String company_name, Double Bills_charge) {
        super(store_id, transaction_id, account_id, amount);
        this.company_name = company_name;
        this.Bills_charge = Bills_charge;
    }
    //generating getters for the Private Variable
    public String getCompany_name() {
        return company_name;
    }

    public Double getBills_charge() {
        return Bills_charge;
    }



    //Over-riding the toString() function as a class function

    @Override
    public String toString() {

        String output =
                "\n[BILL] " +
                        "\nTransaction ID: " + this.transaction_id +
                        "\nACCOUNT.Account ID: " + this.account_id +
                        "\nStore ID: " + this.store_id +
                        "\nCompany Name: " + this.company_name +
                        "\nAmount: " + this.amount +
                        "\nBill: " + this.Bills_charge +
                        "\nTimestamp: " + this.timestamp;

        return output;
    }


    //Create a function to identify unique and duplicate bills,Creates and returns a copy of this object.

    @Override
    public boolean equals(Object object) {
        Bill obj = (Bill) object;
        if (obj == this) {
            return true;
        }

        if (
                        Integer.compare(this.store_id, obj.store_id) == 0 &&
                        Integer.compare(this.transaction_id, obj.transaction_id) == 0 &&
                        Integer.compare(this.account_id, obj.account_id) == 0 &&
                        Double.compare(this.amount, obj.amount) == 0 &&
                        Double.compare(this.Bills_charge, obj.Bills_charge) == 0 &&
                        this.company_name.equals(obj.company_name)

        ) {
            return true;
        }

        return false;
    }
}
