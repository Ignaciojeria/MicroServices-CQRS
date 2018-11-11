package com.example.command.configuration;

import com.example.command.stream.AccountStream;
import org.springframework.cloud.stream.annotation.EnableBinding;



@EnableBinding(AccountStream.class)
public class AccountConfiguration {
}
