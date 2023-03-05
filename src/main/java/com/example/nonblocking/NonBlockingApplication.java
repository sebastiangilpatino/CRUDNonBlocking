package com.example.nonblocking;

import com.example.nonblocking.model.DescriptionWrapper;
import io.netty.resolver.DefaultAddressResolverGroup;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import reactor.netty.http.client.HttpClient;

@SpringBootApplication
public class NonBlockingApplication {

    public static void main(String[] args) {
        SpringApplication.run(NonBlockingApplication.class, args);
    }
}
