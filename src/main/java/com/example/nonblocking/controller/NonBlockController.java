package com.example.nonblocking.controller;

import com.example.nonblocking.model.Description;
import com.example.nonblocking.model.DescriptionWrapper;
import com.example.nonblocking.service.NonBlockService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api")
@Log4j2
public class NonBlockController {
    private final NonBlockService service;

    @Autowired
    public NonBlockController(NonBlockService service) {
        this.service = service;
    }

    @GetMapping("/{title}")
    public Mono<?> getAnyDescription(@PathVariable String title) {
        return service.getEntries(title);
    }
}
