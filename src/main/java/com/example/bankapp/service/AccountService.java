package com.example.bankapp.service;

import com.example.bankapp.dto.AccountDto;
import org.springframework.stereotype.Service;

@Service
public interface AccountService {

    AccountDto createAccount(AccountDto accountDto);

}


