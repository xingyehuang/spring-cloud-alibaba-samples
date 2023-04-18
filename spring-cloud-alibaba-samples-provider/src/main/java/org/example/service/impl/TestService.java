package org.example.service.impl;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.stereotype.Service;

@Service
public class TestService {

//    @SentinelResource(value = "sayHello", blockHandler = "blockHandlerSayHello", fallback = "fallbackSayHello")
    public String sayHello(String name) {
        return "Hello, " + name;
    }

    public String blockHandlerSayHello(String name, BlockException e) {
        return "blockHandlerSayHello:" + name;
    }

    public String fallbackSayHello(String name,Exception e) {
        return "fallbackSayHello:" + name+"e";
    }

}
