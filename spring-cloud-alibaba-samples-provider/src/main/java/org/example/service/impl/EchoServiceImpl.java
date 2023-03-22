package org.example.service.impl;


import org.example.EchoService;

public class EchoServiceImpl implements EchoService {

    @Override
    public String echo(String string) {
        return "hello" + string;
    }
}
