package com.steve.accountms.controller;

import com.steve.accountms.common.TransactionRequest;
import com.steve.accountms.common.TransactionResponse;
import com.steve.accountms.entity.Account;
import com.steve.accountms.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService service;

    @PostMapping("/deposit")
    public Account depositAmount(@RequestBody TransactionRequest request){
         return service.deposit(request);
    }

    @GetMapping("/accountBalance")
    public TransactionResponse getAccountBalance(@RequestBody TransactionRequest request){
           return service.checkBalance(request);
    }
}
