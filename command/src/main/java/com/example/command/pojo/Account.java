package com.example.command.pojo;

import java.util.UUID;

public class Account {

    private String accountId;
    private String firstName;
    private String lastName;

    public Account(){
        this.accountId= UUID.randomUUID().toString();
    }

    public String getAccountId() {
        return accountId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
