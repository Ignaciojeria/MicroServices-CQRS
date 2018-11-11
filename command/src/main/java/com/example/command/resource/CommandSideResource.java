package com.example.command.resource;

import com.example.command.event.AccountEvent;
import com.example.command.pojo.Account;
import com.example.command.service.AccountSender;
import com.example.command.stream.AccountStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommandSideResource {


    @Autowired
    private AccountSender accountSender;

    @GetMapping("/createPremiumAccount")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public AccountEvent send()
    {
        Account account=new Account();
        account.setFirstName("Ignacio");
        AccountEvent accountEvent= new AccountEvent();
        accountEvent.setAccount(account);
        accountEvent.setEventMessage("Nueva cuenta a ser creada");
        accountSender.createPremiumAccount(accountEvent);
        return accountEvent;
    }



}


