package org.example.hello.config;

import org.example.hello.service.DemoService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DubboConfigurations {

//    @DubboReference(providedBy = "hello-service", protocol = CommonConstants.TRIPLE)
    @DubboReference(filter = "consumerFilter")
    private DemoService demoService;

    @Bean
    public DemoService demoService() {
        return demoService;
    }

}
