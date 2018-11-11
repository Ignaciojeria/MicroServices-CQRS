package com.example.command.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface AccountStream {


    String INPUT = "accounts-in";

    String PREMIUM_OUTPUT = "premium-accounts-out";

    String FREE_OUTPUT = "free-accounts-out";

    @Input(INPUT)
    SubscribableChannel accountsIn();

    @Output(PREMIUM_OUTPUT)
    MessageChannel premiumAccountsOut();

    @Output(FREE_OUTPUT)
    MessageChannel freeAccountsOut();

}
