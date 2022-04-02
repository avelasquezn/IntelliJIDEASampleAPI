package com.acme.sampleapi.production.service;

import com.acme.sampleapi.production.domain.model.Product;
import com.acme.sampleapi.production.domain.persistence.ProductRepository;
import com.acme.sampleapi.production.domain.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository repository;

    public ProductServiceImpl(ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Product> getAllProducts() {
        return (List<Product>) repository.findAll();
    }
}
