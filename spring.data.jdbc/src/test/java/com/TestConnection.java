package com;

import com.config.AppConfig;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestConnection {

    ApplicationContext applicationContext = null;

    @Before
    public void init(){
        applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
    }


    @Test
    public void testGetConnection() throws SQLException {
        DataSource dataSource = applicationContext.getBean(DataSource.class);

        Connection connection = dataSource.getConnection();

        ResultSet resultSet = connection.createStatement().executeQuery("select sysdate()");

        if(resultSet.next()) System.out.println("Time : " + resultSet.getObject(1));

    }

}
