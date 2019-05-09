package com.lanny.spi;

/**
 * @author Lanny Yao
 * @date 5/7/2019 3:06 PM
 */
public class FirstServiceImpl implements DemoService {

    @Override
    public void sayHello() {
        System.out.println("FirstService");
    }
}
