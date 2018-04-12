package com.spring.xml;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class PeopleBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {

    @Override
    protected Class<?> getBeanClass(Element element) {
        return People.class;
    }

    @Override
    protected void doParse(Element element, BeanDefinitionBuilder builder) {

        String id = element.getAttribute("id");
        NodeList childNodes = element.getChildNodes();
        // 本次新增解析模式，写的比较简陋 。。。 。。。大家将就这看一下
        NodeList elements = element.getElementsByTagName("entity:property");

        NamedNodeMap attributes = elements.item(0).getAttributes();
        String name = attributes.item(0).getNodeValue();
        String nameValue = attributes.item(1).getNodeValue();

        NamedNodeMap attributes1 = elements.item(1).getAttributes();
        String age = attributes.item(0).getNodeValue();
        String ageValue = attributes.item(1).getNodeValue();

        NamedNodeMap attributes2 = elements.item(2).getAttributes();
        String location = attributes.item(0).getNodeValue();
        String locationValue = attributes.item(1).getNodeValue();

        builder.addPropertyValue("id", id)
                .addPropertyValue(name, nameValue)
                .addPropertyValue(age, ageValue)
                .addPropertyValue(location, locationValue);

    }
}
