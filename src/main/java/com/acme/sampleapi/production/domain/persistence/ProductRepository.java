package com.acme.sampleapi.production.domain.persistence;

import com.acme.sampleapi.production.domain.model.Product;

public interface ProductRepository {
    Iterable<Product> findAll();
}
