package com.acme.sampleapi.production.persistence;

import com.acme.sampleapi.production.domain.model.Product;
import com.acme.sampleapi.production.domain.persistence.ProductRepository;

import java.util.List;

public class ProductRepositoryImpl implements ProductRepository {
    @Override
    public Iterable<Product> findAll() {
        return List.of(new Product[] {
           new Product(1, "Sample Name 1", "Sample Description 1"),
           new Product(2, "Sample Name 2", "Sample Description 2")
        });
    }
}
