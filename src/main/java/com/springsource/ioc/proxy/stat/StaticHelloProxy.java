package com.springsource.ioc.proxy.stat;

import com.springsource.ioc.proxy.Hello;
import com.springsource.ioc.proxy.HelloImpl;

/**
 * @author chenxyz
 * @version 1.0
 * @date 2017-09-28
 */
public class StaticHelloProxy implements Hello {

    private HelloImpl helloImpl;

    public StaticHelloProxy() {
        helloImpl = new HelloImpl();
    }

    @Override
    public void sayHello(String name) {
        before();
        helloImpl.sayHello(name);
        after();
    }

    public void before() {
        System.out.println("static,   before say hello");
    }

    public void after() {
        System.out.println("static,   after say hello");
    }
}
