package com.example.query.service.listenner;

import alexh.weak.Dynamic;
import com.example.query.domain.Account;
import com.example.query.service.AccountService;
import com.example.query.stream.AccountStream;
import com.fasterxml.jackson.databind.ObjectMapper;
import net.bytebuddy.utility.JavaConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Map;

@Component
public class AccountListenner {

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private AccountService accountService;

    @StreamListener(AccountStream.INPUT)
    public void handleGreetings(Message<String> message) throws IOException {

        Map event =objectMapper.readValue(message.getPayload(),Map.class);

        Map<String,Object> map=Dynamic.from(event).get("account").asMap();

        String accountNumber=map.get("accountId").toString();

        Account account=new Account();
        account.setAccountNumber(accountNumber);

        accountService.save(account);

        System.out.println(message.getPayload());
    }

}
