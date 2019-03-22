package com.codecool.gotchiarena.receiver.model;

import java.io.Serializable;

/**
 * Generic message class
 * Has to be a BEAN
 * TODO Google Java Bean
 */
public class Message implements Serializable {
    private String payload;

    public Message() {
    }

    public String getPayload() {
        return this.payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

}