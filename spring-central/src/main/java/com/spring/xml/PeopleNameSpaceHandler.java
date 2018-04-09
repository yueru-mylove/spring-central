package com.spring.xml;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class PeopleNameSpaceHandler extends NamespaceHandlerSupport {
    @Override
    public void init() {

        registerBeanDefinitionParser("people", new PeopleBeanDefinitionParser());
    }
}
