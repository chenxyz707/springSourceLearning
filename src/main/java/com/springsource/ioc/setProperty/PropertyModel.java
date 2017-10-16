package com.springsource.ioc.setProperty;

import com.springsource.xmlparser.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 属性注入的演示实体类
 * @author chenxyz
 * @version 1.0
 * @date 2017-10-10
 * @see org.springframework.beans.AbstractNestablePropertyAccessor#processKeyedProperty
 */
public class PropertyModel {

    private String id;//普通类型

    private List<String> names;//list类型

    //使用下标 依赖注入的时候 必须定义List或数组的大小，否则会报错
    private List<String> subjects = new ArrayList<String>(4);// list使用index方式注入

    private int[] score;//array类型

    private Map<String, Object> attributes;//map类型

    private Student student;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    public int[] getScore() {
        return score;
    }

    public void setScore(int[] score) {
        this.score = score;
    }

    public Map<String, Object> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<String, Object> attributes) {
        this.attributes = attributes;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }
}
