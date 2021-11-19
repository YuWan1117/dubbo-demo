package org.example.hello.controller;

import org.example.hello.service.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
public class HelloController {

    @Resource
    private DemoService demoService;

    /**
     * 接收请求调用sayHello接口
     */
    @GetMapping(value = "/")
    public String hello() {
        log.info("recv a hello request");
        return demoService.sayHello();
    }

    /**
     * 根据输入参数name值，调用sayHelloToSomeone接口
     *
     * @param name 姓名
     */
    @GetMapping(value = "/hello")
    public String hello(@RequestParam String name) {
        log.info("recv a hello request, name={}", name);
        return demoService.sayHelloToSomeone(name);
    }

    @GetMapping(value = "/health")
    public String health() {
        log.debug("recv a health request");
        return "health";
    }
}
