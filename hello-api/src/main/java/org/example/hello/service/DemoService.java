package org.example.hello.service;

/**
 * @author liyingxiao
 * @date 2021/10/25
 */
public interface DemoService {

    /**
     * 输出“Hello World.”字符串在前端页面
     */
    public String sayHello();

    /**
     * 根据传入的name参数，输出“Hello, ${name}”字符串在前端页面
     */
    public String sayHelloToSomeone(String name);
}
