package com.codecool.gotchiarena.receiver.controller;

import com.codecool.gotchiarena.receiver.model.Message;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *    Listens for incoming messages
 *    Returns message status to sender
 */
@RestController
public class RestRequestHandler {

    @RequestMapping(value = "/template/messages", method = RequestMethod.POST)
    public ResponseEntity<Message> onMessageReceived(@RequestBody Message message) {
        System.out.println("Received message " + message.getPayload());
        return new ResponseEntity<>(message, HttpStatus.ACCEPTED);
    }
}
