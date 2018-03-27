package com.bean2;

import com.bean.ExampleBean;
import com.config.AppConfig;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class TestEmpHandler {

    AbstractApplicationContext applicationContext = null;

    @Before
    public void init() {
        applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
    }


    @Test
    public void addAccountHandler() {

        EmpHandler empHandler = applicationContext.getBean(EmpHandler.class);

        empHandler.saveEmp();

        applicationContext.registerShutdownHook();

    }

}
