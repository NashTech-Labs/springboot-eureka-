package com.knoldus.demoservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/demo")
public class DemoController {
    private final MockWebClient webClientController;
    
    DemoController(MockWebClient webClientController) {
        this.webClientController = webClientController;
    }
    
    @GetMapping("/greet")
    public Mono<String> greetDemo() {
        return webClientController.getUserFromWebClient("admin");
    }
}
