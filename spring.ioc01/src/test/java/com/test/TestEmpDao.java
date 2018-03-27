package com.test;

import com.config.AppConfig;
import com.dao.EmpDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestEmpDao {

    @Test
    public void testSaveEmp(){

        ApplicationContext app = new AnnotationConfigApplicationContext(AppConfig.class);

        EmpDao empDao = app.getBean(EmpDao.class);

        empDao.saveEmp();

    }
}
