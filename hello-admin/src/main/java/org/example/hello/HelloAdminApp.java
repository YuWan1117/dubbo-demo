package org.example.hello;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class HelloAdminApp {

    public static void main(String[] args) {
        try {
            SpringApplication springApplication = new SpringApplication(HelloAdminApp.class);
            springApplication.run(args);
            log.info("HelloAdminApp success");
        } catch (Exception e) {
            log.info("got Exception,", e);
        }
    }
}
