#Vert.x Beans example

This demonstrates how to use the [Vert.x Beans](https://github.com/rworsnop/vertx-beans) library.

We're using Spring Boot here, but that isn't a requirement.

## Building ##

    mvn clean package

## Running ##

    java -jar target/vertx-beans-example-1.0.0.jar 
    
## Running with a properties file ##
                                                   
    java -jar target/vertx-beans-example-1.0.0.jar --spring.config.location=etc/application.properties
    
## Running with command-line properties ##
                                                                                                      
    java -Dvertx.event-loop-pool-size=16 -jar target/vertx-beans-example-1.0.0.jar 
    
## Testing ##
    
    curl localhost:8080
