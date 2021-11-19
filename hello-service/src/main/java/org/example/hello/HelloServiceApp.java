package org.example.hello;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@Slf4j
@SpringBootApplication
@Configuration
public class HelloServiceApp {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(HelloServiceApp.class);
        springApplication.run(args);
        log.info("HelloServiceApp success");
    }
}
