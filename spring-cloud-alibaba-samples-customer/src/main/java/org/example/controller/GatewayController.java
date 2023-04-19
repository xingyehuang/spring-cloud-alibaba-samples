package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("gateway")
public class GatewayController {

    @GetMapping("/predicate")
    public String predicate(@RequestParam("name") String name) {
        return "gatewaytest:" + name;
    }



}
