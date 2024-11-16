package com.Springboot_ServceDiscoveryClient.Springboot_ServceDiscoveryClient.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/serviceA")
public class MyController {

    @GetMapping("/test")
    public String test()
    {
        return "Microservice 1 controller executed";
    }
}
