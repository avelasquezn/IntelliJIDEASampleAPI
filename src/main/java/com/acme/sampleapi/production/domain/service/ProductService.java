package com.acme.sampleapi.production.domain.service;

import com.acme.sampleapi.production.domain.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();
}
