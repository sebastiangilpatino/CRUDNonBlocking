package com.example.nonblocking.service;

import com.example.nonblocking.model.DescriptionWrapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class NonBlockService {
    @Value("${example.url}")
    private String url;

    public Mono<DescriptionWrapper> getEntries(String entry) {
        return WebClient.create(url)
                .get()
                .uri(builder -> builder.path("/entries").queryParam("title", entry).build())
                .retrieve()
                .bodyToMono(DescriptionWrapper.class);
    }
}
