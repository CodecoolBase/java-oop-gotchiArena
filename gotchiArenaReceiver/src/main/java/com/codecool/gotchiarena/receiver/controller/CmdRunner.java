package com.codecool.gotchiarena.receiver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * The entry point into the application
 */

@Component
public class CmdRunner implements CommandLineRunner {

    @Autowired
    RestRequestHandler restRequestHandler;

    @Override
    public void run(String... strings) throws Exception {
        //TODO app starts here
    }

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
