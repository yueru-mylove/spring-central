package com.spring.xml;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.w3c.dom.Element;

public class PeopleBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {

    @Override
    protected Class<?> getBeanClass(Element element) {
        return People.class;
    }

    @Override
    protected void doParse(Element element, BeanDefinitionBuilder builder) {

        String id = element.getAttribute("id");
        String name = element.getAttribute("name");
        String age = element.getAttribute("age");
        System.out.println(element.getNodeName());

        builder.addPropertyValue("id", id).addPropertyValue("name", name).addPropertyValue("age", age);
    }
}
