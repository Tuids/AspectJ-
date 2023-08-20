package com.example;




import com.example.service.MyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 */

@SpringBootApplication
public class App {
    private static final Logger log = LoggerFactory.getLogger(App.class);
    public static void main(String[] args) {
//        ConfigurableApplicationContext context = SpringApplication.run(App.class,args);
//        MyService myService = context.getBean(MyService.class);
//        log.info("MyService class:{}",myService.getClass());
//        myService.foo();
//        context.close();
//        MyService myService = new MyService();
//        log.info("MyService class:{}",myService.getClass());
//        myService.foo();
        MyService.foo();
    }
}
