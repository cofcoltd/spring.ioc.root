package com.bean;

import com.config.AppConfig;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

public class ExampleBeanTest {

    ApplicationContext applicationContext = null;

    @Before
    public void init() {
        applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
    }


    @Test
    public void addAccountHandler() {

         ExampleBean exampleBean = applicationContext.getBean(ExampleBean.class);

         exampleBean.addAccountHandler();

    }
}