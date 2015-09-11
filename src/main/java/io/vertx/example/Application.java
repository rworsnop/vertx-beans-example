package io.vertx.example;

import io.vertxbeans.VertxBeans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

/**
 * Created by Rob Worsnop on 9/5/15.
 */

@SpringBootApplication
@Import(VertxBeans.class)
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
