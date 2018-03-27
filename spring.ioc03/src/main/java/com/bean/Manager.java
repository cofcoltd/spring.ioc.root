package com.bean;

import org.springframework.stereotype.Component;

@Component
public class Manager {

    public Manager() {

        System.out.println("manager ~~~~ ");

    }


    public void checkManager() {
        System.out.println("检查权限...   ");
    }

}
