package org.example.open.controller;

import org.example.EchoService;
import org.example.service.impl.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("echo")
public class EchoController {

    @Autowired
    EchoService echoService;

    @GetMapping("/test")
    public String echo(@RequestParam("name") String name) {
        return echoService.echo(name);
    }

    @Autowired
    private TestService service;

    @GetMapping(value = "/hello/{name}")
    public String apiHello(@PathVariable String name) {
        return service.sayHello(name);
    }
}
