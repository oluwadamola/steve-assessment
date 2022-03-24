package com.steve.accountms.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
   private int userId;
   private String email;
   private String password;
   private String userName;
   private int accountId;
   private String token;
}
