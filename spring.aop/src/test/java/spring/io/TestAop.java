package spring.io;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.bank.Account;
import spring.config.AppConfiguration;

public class TestAop {

    @Test
    public void testBank() {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfiguration.class);

        Account account = applicationContext.getBean(Account.class);

        account.deposit();

    }
}
