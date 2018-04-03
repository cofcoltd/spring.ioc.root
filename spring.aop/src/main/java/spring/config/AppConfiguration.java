package spring.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(value = "spring")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AppConfiguration {
}
