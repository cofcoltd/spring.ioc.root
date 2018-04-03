package spring.service;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Log {

    @Pointcut("execution(* spring.bank.*.*(..))")
    public void pointCut() {}


    @Before(value = "pointCut()")
    public static void log1() {
        System.out.println("账户发生了变化");
    }


    @After(value = "pointCut()")
    public static void log2() {
        System.out.println("操作执行完毕");
    }



}
