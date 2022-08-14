package com.gabrlaur.springreactivedemo3.service;

import com.gabrlaur.springreactivedemo3.model.Product;
import com.gabrlaur.springreactivedemo3.proxy.ProductProxy;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
@AllArgsConstructor
public class ProductService {

    private final ProductProxy proxy;

    public Flux<Product> getAllProducts() {
        return proxy.getAllProducts();
    }
}
