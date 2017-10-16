package com.springsource.mvc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * mvc源码学习
 *
 * @author chenxyz
 * @version 1.0
 * @date 2017-10-16
 * @see org.springframework.web.servlet.handler.AbstractHandlerMethodMapping#afterPropertiesSet
 *
 * bean初始化完成之后发现并注册handler method
 * {@link org.springframework.web.servlet.handler.AbstractHandlerMethodMapping.MappingRegistration}
 * 中mappingLookup在注册完成后会变成一个只读map
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:mvc/spring.xml")
public class MVCTest {

    @Test
    public void test() {
        //空方法 断点调试
    }
}
