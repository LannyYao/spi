package com.lanny.spi;

/**
 * @author Lanny Yao
 * @date 5/7/2019 3:07 PM
 */
public class SecondServiceImpl implements DemoService {

    @Override
    public void sayHello() {
        System.out.println("SecondService");
    }
}
