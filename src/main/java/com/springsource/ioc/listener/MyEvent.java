package com.springsource.ioc.listener;

import org.springframework.context.ApplicationEvent;

/**
 * Description
 *
 * @author chenxyz
 * @version 1.0
 * @date 2017-10-09
 */
public class MyEvent extends ApplicationEvent {

    private String param1;

    private String param2;

    /**
     * Create a new ApplicationEvent.
     * 必须实现构造方法，并且必须调用父类的构造方法
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public MyEvent(Object source, String param1, String param2) {
        super(source);
        this.param1 = param1;
        this.param2 = param2;
    }

    public Object getSource() {
        return super.getSource();
    }

    public String getParam1() {
        return param1;
    }

    public void setParam1(String param1) {
        this.param1 = param1;
    }

    public String getParam2() {
        return param2;
    }

    public void setParam2(String param2) {
        this.param2 = param2;
    }
}
