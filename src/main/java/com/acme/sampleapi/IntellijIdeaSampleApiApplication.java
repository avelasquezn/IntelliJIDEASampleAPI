package com.acme.sampleapi;

import com.acme.sampleapi.production.domain.persistence.ProductRepository;
import com.acme.sampleapi.production.persistence.ProductRepositoryImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class IntellijIdeaSampleApiApplication
{

    public static void main(String[] args) {
        SpringApplication.run(IntellijIdeaSampleApiApplication.class, args);
    }

    @Bean
    public ProductRepository getProductRepository() {
        return new ProductRepositoryImpl();
    }

}
