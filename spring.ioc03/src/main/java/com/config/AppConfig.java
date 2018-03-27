package com.config;

import com.bean2.EmpHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = "com")
public class AppConfig {


    @Bean(initMethod = "init_a" , destroyMethod = "cleanUp_a")
    public EmpHandler empHandler() {
        return new EmpHandler();
    }


}
