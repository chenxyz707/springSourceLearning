package com.springsource.ioc.proxy.CGLib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Description
 *
 * @author chenxyz
 * @version 1.0
 * @date 2017-09-28
 */
public class CGLibHelloProxy implements MethodInterceptor {

    public static CGLibHelloProxy instance = new CGLibHelloProxy();

    private CGLibHelloProxy() {}

    public static CGLibHelloProxy getInstance() {
        return instance;
    }

    public <T> T getProxy(Class<T> clazz) {
        return (T) Enhancer.create(clazz, this);
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        before();
        Object result =  methodProxy.invokeSuper(obj, args);
        after();
        return result;
    }


    public void before() {
        System.out.println("cglib,   before say hello");
    }

    public void after() {
        System.out.println("cglib,   after say hello");
    }
}
