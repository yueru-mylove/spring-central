package com.spring.xml;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class PeopleTest {


    @Test
    public void test() {

        ApplicationContext ioc = new ClassPathXmlApplicationContext("application.xml");
        People people = (People) ioc.getBean("people");

        String[] beanDefinitionNames = ioc.getBeanDefinitionNames();
        System.out.println(Arrays.asList(beanDefinitionNames));
        System.out.println(people);
    }
}
