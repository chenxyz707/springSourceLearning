package com.springsource.ioc.listener;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * spring中的事件广播机制
 *
 * @author chenxyz
 * @version 1.0
 * @date 2017-10-09
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:ioc/listener/spring.xml")
public class ListenerTest implements ApplicationContextAware {

    private ApplicationContext context;

    @Test
    public void test() {
        MyEvent myEvent = new MyEvent("source", "param1", "param2");
        context.publishEvent(myEvent);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }
}
