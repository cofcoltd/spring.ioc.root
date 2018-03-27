package com.bean2;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class EmpHandler {


    //JSR-250
    @PostConstruct
    public void  init_b() {
        System.out.println("init_b");
    }


    public void init_a() {
        System.out.println("init_a");
    }


    public void cleanUp_a() {
        System.out.println("cleanUp_a");
    }

    @PreDestroy
    public void cleanUp_b() {
        System.out.println("cleanUp_b");
    }


    public void saveEmp() {
        System.out.println("保存员工 . . . . . . ");
    }


}
