package com.gabrlaur.springreactivedemo3.proxy;

import com.gabrlaur.springreactivedemo3.model.Product;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

@Component
@AllArgsConstructor
public class ProductProxy {

    private final WebClient webClient;

    public Flux<Product> getAllProducts() {
        return webClient.get().uri("/products")
                .exchangeToFlux(res -> res.bodyToFlux(Product.class));
    }
}
