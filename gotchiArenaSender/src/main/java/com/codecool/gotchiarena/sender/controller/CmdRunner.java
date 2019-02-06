package com.codecool.gotchiarena.sender.controller;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import com.codecool.gotchiarena.sender.model.Message;

@Component
public class CmdRunner implements CommandLineRunner {


    /**
     * App entry.
     * Creates new message, sends it and receives and prints response.
     */
    @Override
    public void run(String... strings) {
        Message message = new Message();
        message.setPayload("Hello message!");

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Message> response = restTemplate.
                postForEntity("http://localhost:8095/template/messages", message, Message.class);

        HttpStatus status = response.getStatusCode();
        System.out.println("done! " + status.toString());
    }

}
