package com.example.command.event;


import com.example.command.pojo.Account;

public class AccountEvent {

    private String eventMessage;

    private Account account;

    public AccountEvent(){ }

    public AccountEvent(String eventMessage, Account account) {
        this.eventMessage = eventMessage;
        this.account = account;
    }

    public String getEventMessage() {
        return eventMessage;
    }

    public void setEventMessage(String eventMessage) {
        this.eventMessage = eventMessage;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
