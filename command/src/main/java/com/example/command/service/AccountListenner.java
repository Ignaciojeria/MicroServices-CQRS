package com.example.command.service;
import com.example.command.stream.AccountStream;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component
public class AccountListenner {

    /*
    @StreamListener(AccountStream.INPUT)
    public void handleGreetings(Message<String> message)
    {
      System.out.println(message.getPayload());
    }*/

}
