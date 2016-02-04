package io.vertx.example;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import io.vertx.core.eventbus.EventBus;
import io.vertx.core.file.FileSystem;
import io.vertx.core.http.HttpServer;
import io.vertx.core.http.HttpServerRequest;
import io.vertx.core.shareddata.SharedData;
import io.vertxbeans.InstanceRunner;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

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
    public void start() throws InterruptedException, ExecutionException, TimeoutException {
        // Create two instances
        InstanceRunner.executeBlocking(2,
                (Handler<AsyncResult<HttpServer>> handler) ->
                    vertx.createHttpServer().requestHandler(someHandler).listen(8080, handler),
                    1, TimeUnit.MINUTES);
     }
}
