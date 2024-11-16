package Springboot_ServiceDiscovery_Client3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class SpringbootServiceDiscoveryClient3Application {

	@RequestMapping("/servicethree")
	public String test()
	{
		return "Service Three";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootServiceDiscoveryClient3Application.class, args);
	}

}
