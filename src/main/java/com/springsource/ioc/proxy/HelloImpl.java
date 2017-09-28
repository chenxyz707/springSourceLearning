package com.springsource.ioc.proxy;

/**
 * @author chenxyz
 * @version 1.0
 * @date 2017-09-28
 */
public class HelloImpl implements Hello {

    @Override
    public void sayHello(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public void sayGoodBye(String name) {
        System.out.println("say goodbye, " + name + "!");
    }
}
