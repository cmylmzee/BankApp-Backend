package com.example.bankapp.controller;


import com.example.bankapp.dto.AccountDto;
import com.example.bankapp.service.AccountService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {

    private AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    // REST APİ


    // ADD ACCOUNT
    @PostMapping
    public ResponseEntity<AccountDto> addAccount(@RequestBody AccountDto accountDto) {
        return new ResponseEntity<>(accountService.createAccount(accountDto), HttpStatus.CREATED);
    }

    // GET ACCOUNT
    @GetMapping("/{id}")
    public  ResponseEntity<AccountDto> getAccountById(@PathVariable Long id) {  // path variable dışarıdan alacağımızı belirtiyor -> api/accounts/getAccountById/1 gibi bir get isteği karşılar

        AccountDto accountDto = accountService.getAccountById(id);
        return ResponseEntity.ok(accountDto);
    }

    // DEPOSİT
    @PutMapping("/{id}/deposit")
    public ResponseEntity<AccountDto> deposit(@PathVariable Long id, @RequestBody Map<String, Double> request)  {
        Double amount = request.get("amount");
        AccountDto accountDto = accountService.deposit(id, amount);


        return ResponseEntity.ok(accountDto);
    }

    // WITHDRAW

    @PutMapping("/{id}/withdraw")
    public ResponseEntity<AccountDto> withdraw(@PathVariable Long id, @RequestBody Map<String, Double> request)  {
        Double amount = request.get("amount");

        AccountDto accountDto = accountService.withdraw(id, amount);
        return ResponseEntity.ok(accountDto);
    }

    // LIST ALL ACCOUNTS
    @GetMapping()
    public  ResponseEntity<List<AccountDto>> getAllAccounts() {
        List<AccountDto> accounts = (List<AccountDto>) accountService.listAllAccounts();
        return ResponseEntity.ok(accounts);
    }
}
