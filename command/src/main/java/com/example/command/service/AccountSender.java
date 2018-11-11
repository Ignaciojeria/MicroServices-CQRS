package com.example.command.service;

import com.example.command.event.AccountEvent;
import com.example.command.pojo.Account;
import com.example.command.stream.AccountStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.util.MimeTypeUtils;


@Service
@EnableAutoConfiguration
public class AccountSender {


    @Autowired
    private AccountStream accountStream;

    public void createPremiumAccount(AccountEvent accountEvent) {

        MessageChannel messageChannel = accountStream.premiumAccountsOut();

        messageChannel.send(
                MessageBuilder.withPayload(accountEvent)
                        .setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON)
                        .build());

    }

}


