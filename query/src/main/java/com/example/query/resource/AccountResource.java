package com.example.query.resource;

import com.example.query.domain.Account;
import com.example.query.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AccountResource {

    @Autowired
    private AccountService accountService;

    @GetMapping("/findAllAccounts")
    public List<Account> accounts(){
        return accountService.findAll();
    }

}
