package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("gateway")
public class GatewayController {

    @GetMapping("/test")
    public String test(@RequestParam("name") String name) {
        return "gatewaytest:" + name;
    }

    @GetMapping("/test2")
    public String test2(@RequestParam("name") String name) {
        return "gatewaytest2:" + name;
    }


}
