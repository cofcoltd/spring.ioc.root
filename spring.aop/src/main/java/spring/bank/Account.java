package spring.bank;

import org.springframework.stereotype.Component;

@Component
public class Account {

    public void deposit() {
        System.out.println("存钱......");
    }
}
