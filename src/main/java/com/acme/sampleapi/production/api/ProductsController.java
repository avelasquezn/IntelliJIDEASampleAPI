package com.acme.sampleapi.production.api;

import com.acme.sampleapi.production.domain.model.Product;
import com.acme.sampleapi.production.domain.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductsController {

    private ProductService service;

    public ProductsController(ProductService service) {
        this.service = service;
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return service.getAllProducts();
    }
}
