package com.resttemplate.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

//Hata alınca RestTemplate 'i bu şekilde oluşturduk
@Configuration
public class RestTemplateConfiguration {
    @Bean
    public RestTemplate restTemplate(){

        return new RestTemplate();
    }
}
