package Springboot_ServiceDiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.RequestMapping;


@SpringBootApplication
@EnableEurekaServer
public class SpringbootServiceDiscoveryApplication {


	public static void main(String[] args) {
		SpringApplication.run(SpringbootServiceDiscoveryApplication.class, args);
	}

}
