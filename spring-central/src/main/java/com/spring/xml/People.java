package com.spring.xml;

import org.springframework.beans.factory.InitializingBean;

public class People implements InitializingBean {

    private String id;
    private String name;
    private String age;
    private String location;

    public People(String id, String name, String age, String location) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public People() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "People{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    @Override
    public void afterPropertiesSet() throws Exception {

        this.name = "zhangsanfeng";
        this.age = "18";
        this.location = "china_northeast";
    }
}
