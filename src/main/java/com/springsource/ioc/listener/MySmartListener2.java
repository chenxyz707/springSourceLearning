package com.springsource.ioc.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.SmartApplicationListener;

/**
 * 有序监听器
 *
 * @author chenxyz
 * @version 1.0
 * @date 2017-10-09
 */
public class MySmartListener2 implements SmartApplicationListener {


    @Override
    public boolean supportsEventType(Class<? extends ApplicationEvent> eventType) {
        return eventType == MyEvent.class;
    }

    @Override
    public boolean supportsSourceType(Class<?> sourceType) {
        return sourceType == String.class;
    }

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        MyEvent myEvent = (MyEvent)event;
        System.out.println(this.getClass().getName() + " [param1] " + myEvent.getParam1());
        System.out.println(this.getClass().getName() + " [param2] " + myEvent.getParam2());
        System.out.println(this.getClass().getName() + " [source] " + myEvent.getSource());
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
