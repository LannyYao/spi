package com.lanny.spi;

import java.util.ServiceLoader;

public class SpiApplication {

    public static void main(String[] args) {

        ServiceLoader<DemoService> spiLoader = ServiceLoader.load(DemoService.class);
        for (DemoService demoService : spiLoader) {
            demoService.sayHello();
        }
    }

}
