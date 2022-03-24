package com.steve.accountms.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionResponse {
     private User user;
     private double accountBalance;
     private int accountId;
     private String message;
}
