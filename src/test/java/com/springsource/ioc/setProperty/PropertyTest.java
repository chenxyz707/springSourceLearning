package com.springsource.ioc.setProperty;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * ioc依赖注入测试
 *
 * @author chenxyz
 * @version 1.0
 * @date 2017-10-09
 * @see org.springframework.beans.AbstractNestablePropertyAccessor#processKeyedProperty
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:ioc/setProperty/spring.xml")
public class PropertyTest implements ApplicationContextAware {

    private ApplicationContext context;

    @Test
    public void test() {
        System.out.println("injection successful!!!");
        PropertyModel propertyModel = (PropertyModel) context.getBean("propertyModel");
        String id = propertyModel.getId();
        System.out.println("the id of property model is :" + id);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }
}
