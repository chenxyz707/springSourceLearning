package com.springsource.ioc.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Description
 *
 * @author chenxyz
 * @version 1.0
 * @date 2017-09-28
 */
public class DynamicHelloProxy implements InvocationHandler {

    private Object target;

    public DynamicHelloProxy(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        //此处一定要使用target作为参数，因为target是被代理的目标对象
        Object result = method.invoke(target, args);
        after();
        return result;
    }

    public void before() {
        System.out.println("dynamic,   before say hello");
    }

    public void after() {
        System.out.println("dynamic,   after say hello");
    }

    public <T> T getProxy() {
        return (T) Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), this);
    }
}
