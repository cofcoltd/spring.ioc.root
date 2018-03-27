package com.bean;

import org.springframework.stereotype.Component;

@Component
public class AccountDao {

    public AccountDao() {

        System.out.println("accountDao ~~~~~");
    }

    public void addAccount() {
        System.out.println("添加帐号....");
    }



}
