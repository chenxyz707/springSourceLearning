package com.springsource.ioc.proxy;

import com.springsource.ioc.proxy.CGLib.CGLibHelloProxy;
import com.springsource.ioc.proxy.dynamic.DynamicHelloProxy;
import com.springsource.ioc.proxy.stat.StaticHelloProxy;
import org.junit.Test;

import java.lang.reflect.Proxy;

/**
 * Description
 *
 * @author chenxyz
 * @version 1.0
 * @date 2017-09-28
 */

public class ProxyTest {


    @Test
    public void testProxy() {
        System.out.println("original method");
        HelloImpl hello1 = new HelloImpl();
        hello1.sayHello("chenxyz");

        System.out.println("\nstatic proxy");
        StaticHelloProxy hello2 = new StaticHelloProxy();
        hello2.sayHello("chenxyz");

        System.out.println("\ndynamic proxy");
        Hello hello = new HelloImpl();
        DynamicHelloProxy hello3 = new DynamicHelloProxy(hello);
        //第一个参数是被代理对象的ClassLoader,第二个参数是该实现类的所有接口,第三个是动态代理对象
        Hello hello4= (Hello)Proxy.newProxyInstance(hello.getClass().getClassLoader(), hello.getClass().getInterfaces(), hello3);
        hello4.sayHello("chenxyz");

        System.out.println("generic method get instance");
        Hello hello5 = hello3.getProxy();
        hello5.sayHello("chenxyz");


        System.out.println("\ncglib proxy");
        CGLibHelloProxy cgLibProxy = CGLibHelloProxy.getInstance();
        HelloImpl hello6 = cgLibProxy.getProxy(HelloImpl.class);
        hello6.sayHello("chenxyz");
        //cglib的方法拦截器会拦截到所有方法
        hello6.sayGoodBye("Tom");
    }
}
