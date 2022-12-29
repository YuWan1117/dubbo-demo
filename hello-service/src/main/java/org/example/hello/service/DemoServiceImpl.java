package org.example.hello.service;

import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;
import org.apache.dubbo.rpc.RpcContext;

@Service
@Slf4j
public class DemoServiceImpl implements DemoService {

    /**
     * 输出“Hello World.”字符串在前端页面
     */
    @Override
    public String sayHello() {
        log.info("call sayHello function, TestKey={} testkey={}",
                RpcContext.getServiceContext().getAttachment("TestKey"),
                RpcContext.getServiceContext().getAttachment("testkey"));

        String result = "Hello World."
                + ", ip=" + RpcContext.getServiceContext().getLocalHost()
                + ", providerUrl=" + RpcContext.getServiceContext().getUrl()
                + ", TestKey=" + RpcContext.getServiceContext().getAttachment("TestKey");

        RpcContext.getServerContext().setAttachment("TestKey", "ServerTestValue");
        return result;
    }

    /**
     * 根据传入的name参数，输出“Hello, ${name}”字符串在前端页面
     */
    @Override
    public String sayHelloToSomeone(String name) {
        log.info("call sayHelloToSomeone function, name={} TestKey={} testkey={}", name,
                RpcContext.getServerAttachment().getAttachment("TestKey"),
                RpcContext.getServerAttachment().getAttachment("testkey"));
        return "Hello, " + name
                + "， ip=" + RpcContext.getServerContext().getLocalHost()
                + ", providerUrl=" + RpcContext.getServerContext().getUrl()
                + ", TestKey=" + RpcContext.getServerContext().getAttachment("TestKey");
    }

}
