package com.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

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

    @PostConstruct
    public void a() {
        System.out.println("a");
    }

    @PreDestroy
    public void b() {
        System.out.println("b");
    }

    public void m() {
        System.out.println("m");
    }

    public void n() {
        System.out.println("n");
    }



}
