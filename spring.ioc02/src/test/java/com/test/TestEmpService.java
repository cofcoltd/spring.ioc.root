package com.test;

import com.config.AppConfig;
import com.service.EmpService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestEmpService {

    private ApplicationContext app;

    @Before
    public void init() {
        app = new AnnotationConfigApplicationContext(AppConfig.class);
    }

    @Test
    public void testEmpServiceSave() {

        EmpService service = app.getBean(EmpService.class);
        service.saveEmp();

    }


}
