package Springboot_ServiceDiscovery_Client2.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/serviceB")
public class MyController {

    @GetMapping("/test")
    public String test()
    {
        return "Microservice 2 controller executed";
    }
}
