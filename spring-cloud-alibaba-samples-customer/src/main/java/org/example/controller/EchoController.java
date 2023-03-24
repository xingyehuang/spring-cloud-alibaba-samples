package org.example.controller;

import org.apache.dubbo.config.annotation.DubboReference;
import org.example.EchoService;
import org.example.feign.EchoFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("echo")
public class EchoController {

    @Autowired
    EchoFeign echoFeign;
    @DubboReference
    EchoService echoService;

    @GetMapping("/test")
    public String echo(@RequestParam("name") String name) {
        return echoFeign.echo(name);
    }
    @GetMapping("/dubbo/test")
    public String dubboEcho(@RequestParam("name") String name) {
        return echoService.echo(name);
    }
}
