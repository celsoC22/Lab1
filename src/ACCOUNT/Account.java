package ACCOUNT;

import java.util.Date;

public class Account {

    private int id;
    private String first_name,last_name;
    private Date date_created;
    private boolean is_active;

    //Creating Constructor for Account
    public Account(int id , String first_name, String last_name) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.date_created = new Date();
        this.is_active = false;

    //Generating Getters for the private Global Variables to accessible
    }

    public int getId() {
        return id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public Date getDate_created() {
        return date_created;
    }

    public boolean isIs_active() {
        return is_active;
    }

    public void setIs_active(boolean is_active) {
        this.is_active = is_active;
    }
}


