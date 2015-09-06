package io.vertx.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Rob Worsnop on 9/5/15.
 */

@EnableAutoConfiguration
@ComponentScan({"io.vertx.spring", "io.vertx.example"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
