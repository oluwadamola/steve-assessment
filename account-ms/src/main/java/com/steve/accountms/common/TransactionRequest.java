package com.steve.accountms.common;

import com.steve.accountms.entity.Account;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransactionRequest {
    private User user;
    private Account account;
    private double amount;
}
