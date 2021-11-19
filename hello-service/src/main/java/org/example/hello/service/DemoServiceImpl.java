package org.example.hello.service;

import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.rpc.RpcContext;

@DubboService
@Slf4j
public class DemoServiceImpl implements DemoService {

    /**
     * 输出“Hello World.”字符串在前端页面
     */
    @Override
    public String sayHello() {
        log.info("call sayHello function");
        return "Hello World."
                + ", ip=" + RpcContext.getServerContext().getLocalHost()
                + ", providerUrl=" + RpcContext.getServerAttachment().getUrl();
    }

    /**
     * 根据传入的name参数，输出“Hello, ${name}”字符串在前端页面
     */
    @Override
    public String sayHelloToSomeone(String name) {
        log.info("call sayHelloToSomeone function, name={}", name);
        return "Hello, " + name
                + "， ip=" + RpcContext.getServerContext().getLocalHost()
                + ", providerUrl=" + RpcContext.getServerAttachment().getUrl();
    }

}
