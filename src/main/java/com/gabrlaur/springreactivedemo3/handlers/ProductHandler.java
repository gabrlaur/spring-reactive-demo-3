package com.gabrlaur.springreactivedemo3.handlers;

import com.gabrlaur.springreactivedemo3.model.Product;
import com.gabrlaur.springreactivedemo3.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import static org.springframework.web.reactive.function.server.ServerResponse.ok;

@Component
@AllArgsConstructor
public class ProductHandler {

    private final ProductService productService;

    public Mono<ServerResponse> getAllProducts(ServerRequest req) {
        return ok().contentType(MediaType.TEXT_EVENT_STREAM).body(productService.getAllProducts(), Product.class);
    }
}
