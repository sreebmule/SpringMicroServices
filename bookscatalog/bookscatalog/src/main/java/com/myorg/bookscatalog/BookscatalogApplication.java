package com.myorg.bookscatalog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClient.Builder;

@SpringBootApplication
public class BookscatalogApplication {

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	
	@Bean
	public WebClient.Builder getWebClientBuilder()
	{
		return  WebClient.builder();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(BookscatalogApplication.class, args);
	}

}
