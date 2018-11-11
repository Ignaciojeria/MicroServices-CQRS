package com.example.query.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface AccountStream {

    String INPUT = "accounts-in";

    @Input(INPUT)
    SubscribableChannel accountsIn();

}
