package org.example.open.controller;

import org.example.EchoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("echo")
public class EchoController {

    @Autowired
    EchoService echoService;

    @GetMapping("/test")
    public String echo(@RequestParam("name") String name) {
        return echoService.echo(name);
    }
}
