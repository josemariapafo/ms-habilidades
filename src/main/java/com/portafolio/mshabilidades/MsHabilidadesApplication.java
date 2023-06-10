package com.portafolio.mshabilidades;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MsHabilidadesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsHabilidadesApplication.class, args);
	}

}
