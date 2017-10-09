package com.springsource.ioc.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * 监听2
 *
 * @author chenxyz
 * @version 1.0
 * @date 2017-10-09
 */
public class MyListener2 implements ApplicationListener {

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        if (event instanceof MyEvent) {
            MyEvent myEvent = (MyEvent)event;

            System.out.println(this.getClass().getName() + " [param1] " + myEvent.getParam1());
            System.out.println(this.getClass().getName() + " [param2] " + myEvent.getParam2());
            System.out.println(this.getClass().getName() + " [source] " + myEvent.getSource());
        }
    }
}
