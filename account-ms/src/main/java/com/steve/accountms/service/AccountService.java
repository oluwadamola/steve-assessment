package com.steve.accountms.service;

import com.steve.accountms.common.TransactionRequest;
import com.steve.accountms.common.TransactionResponse;
import com.steve.accountms.common.User;
import com.steve.accountms.entity.Account;
import com.steve.accountms.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class AccountService {

    @Autowired
    private AccountRepository repository;

    @Autowired
    private RestTemplate template;

    public Account deposit(TransactionRequest request){
        User user = request.getUser();
        Account account = request.getAccount();
        account.setUserId(user.getUserId());
        account.setAccountBalance(account.getAccountBalance() +  request.getAmount());
        repository.save(account);
        return account;
    }

    public TransactionResponse checkBalance(TransactionRequest request){
        String response = "";
         User user = request.getUser();
        //rest call
        User userResponse = template.postForObject("http://SECURITY-MS/user/validateUser",user,User.class);
        response = userResponse.getToken().equals(request.getUser().getToken())? "Token is valid" : "There is a failure in api, token not valid";
        Account account =  repository.findAll()
                .stream()
                .filter(a -> a.getUserId() == request.getUser().getUserId())
                .findFirst()
                .get();
       return new TransactionResponse(user, account.getAccountBalance(), userResponse.getAccountId(), response);
    }


}
