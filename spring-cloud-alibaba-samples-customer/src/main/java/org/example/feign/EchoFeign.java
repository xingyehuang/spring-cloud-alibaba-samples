package org.example.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "provider")
public interface EchoFeign {

    @GetMapping("/echo/test")
    String echo(@RequestParam("name") String name);
}
