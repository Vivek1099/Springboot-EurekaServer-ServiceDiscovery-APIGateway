package Springboot_API_Gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringbootApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApiGatewayApplication.class, args);
	}

//	@Bean
//	public RouteLocator routerBuilder(RouteLocatorBuilder routeLocatorBuilder){
//		return routeLocatorBuilder.routes()
//				.route("MicroService1",r->r.path("/serviceA/**")
//						.uri("http://localhost:8091/"))
//				.route("MicroService2",r->r.path("/serviceB/**")
//						.uri("http://localhost:8092/"))
//				.route("MicroService3",r->r.path("/serviceC/**")
//						.uri("http://localhost:8093/")).build();
//	}
}
