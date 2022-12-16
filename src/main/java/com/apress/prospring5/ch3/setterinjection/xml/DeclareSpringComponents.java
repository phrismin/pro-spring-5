package com.apress.prospring5.ch3.setterinjection.xml;

import com.apress.prospring5.ch2.decoupled.MessageProvider;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class DeclareSpringComponents {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("ch3/spring/app-context-annotation.xml");
        ctx.refresh();
        MessageProvider provider = ctx.getBean("provider", MessageProvider.class);
        System.out.println(provider.getMessage());
    }
}
