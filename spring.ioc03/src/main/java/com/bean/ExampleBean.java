package com.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
//@DependsOn(value = {"accountDao" , "manager"})
public class ExampleBean {

    @Autowired
    private AccountDao accountDao;

    @Autowired
    private Manager manager;


    public ExampleBean() {
        System.out.println("exampleBean ~~~~ ");
    }

    public void addAccountHandler() {

        manager.checkManager();

        accountDao.addAccount();

    }



}
