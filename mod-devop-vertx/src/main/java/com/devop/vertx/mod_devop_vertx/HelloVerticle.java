package com.devop.vertx.mod_devop_vertx;
import org.vertx.java.core.logging.Logger;
import org.vertx.java.platform.Verticle;
public class HelloVerticle extends Verticle {
private Logger logger;
@Override
public void start() {
logger = container.logger();
logger.info("hello, world");   
}
}