package org.example.service.impl;


import org.apache.dubbo.config.annotation.DubboService;
import org.example.EchoService;
import org.springframework.stereotype.Service;

@Service
@DubboService
public class EchoServiceImpl implements EchoService {

    @Override
    public String echo(String string) {
        return "hello:" + string;
    }
}
