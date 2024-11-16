package Springboot_ServiceDiscovery_Client3.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/serviceC")
public class MyController
{
    @GetMapping("/test")
    public String test()
    {
        return "Microservice 3 controller executed";
    }
}
