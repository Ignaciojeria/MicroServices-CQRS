package com.example.query.configuration;

import com.example.query.stream.AccountStream;
import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableBinding(AccountStream.class)
public class AccountStreamConfiguration {
}
