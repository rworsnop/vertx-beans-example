package io.vertx.example;

import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import io.vertx.core.eventbus.EventBus;
import io.vertx.core.file.FileSystem;
import io.vertx.core.http.HttpServerRequest;
import io.vertx.core.shareddata.SharedData;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

/**
 * Created by Rob Worsnop on 9/5/15.
 */
@Component
public class Server {
    @Resource
    private Vertx vertx;

    @Resource
    private EventBus eventBus;

    @Resource
    private FileSystem fileSystem;

    @Resource
    private SharedData sharedData;

    @Resource(name="someHandler")
    private Handler<HttpServerRequest> someHandler;

    @PostConstruct
    public void start(){
        vertx.createHttpServer().requestHandler(someHandler).listen(8080);
    }
}
