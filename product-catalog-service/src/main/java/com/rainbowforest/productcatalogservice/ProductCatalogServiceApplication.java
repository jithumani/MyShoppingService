package com.rainbowforest.productcatalogservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableEurekaClient
@EnableJpaRepositories
@EnableAutoConfiguration
public class ProductCatalogServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductCatalogServiceApplication.class, args);
    }
}
