package com.example.bankapp.dto;

import lombok.*;

@Data

public class AccountDto {

    private Long id;
    private double balance;
    private String accountHolderName;

}
