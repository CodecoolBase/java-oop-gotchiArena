package com.codecool.gotchiarena.receiver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication is an annotation that sets up a Spring boot application. It does lots of
 * things like adds all Beans to the context, sets up the routing internally etc.
 * Reaches into resources/application.properties
 * <p>
 * This is the only thing this class should do. It will then launch the run method of a CommandLineRunner
 * here: CmdRunner
 */
@SpringBootApplication
public class ReceiverApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReceiverApplication.class, args);
    }
}
