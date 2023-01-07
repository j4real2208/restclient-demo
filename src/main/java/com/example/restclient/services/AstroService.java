package com.example.restclient.services;

import com.example.restclient.json.AstroResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import java.time.Duration;

@Service
public class AstroService {
    private final WebClient client ;
    private final RestTemplate template;

    @Autowired
    public AstroService(WebClient.Builder builder, RestTemplateBuilder templateBuilder) {
        this.client = builder.baseUrl("http://api.open-notify.org").build();
        this.template = templateBuilder.build();
    }

    public AstroResponse getAstroResponse(){
        return client.get()
                .uri("/astros.json")
                .retrieve()
                .bodyToMono(AstroResponse.class)
                .block(Duration.ofSeconds(2));
    }

    public AstroResponse getAstroResponseWithRestTemplate(){
        return template.getForObject("http://api.open-notify.org/astros.json", AstroResponse.class);
    }
}
