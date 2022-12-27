package org.example.hello.filter;

import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.common.constants.CommonConstants;
import org.apache.dubbo.common.extension.Activate;
import org.apache.dubbo.rpc.*;


/**
 * @author liyingxiao
 * @date 2021/11/4
 */
@Slf4j
@Activate(group = CommonConstants.CONSUMER)
public class ConsumerFilter implements Filter {

    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        RpcContext.getClientAttachment().setAttachment("TestKey", "TestValue");
        log.info("ConsumerFilter, TestKey=TestValue");
        return invoker.invoke(invocation);
    }
}
