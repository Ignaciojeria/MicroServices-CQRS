package com.example.query.service;

import com.example.query.domain.Account;
import com.example.query.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public Account save(Account account){
        return accountRepository.save(account);
    }

    public List<Account> findAll(){
        return accountRepository.findAll();
    }

}
