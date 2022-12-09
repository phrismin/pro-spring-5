package com.apress.prospring5.ch3.setterinjection;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

public class XmlConfigWithBeanFactory {

	public static void main(String... args) {
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader rdr = new XmlBeanDefinitionReader(factory);
		rdr.loadBeanDefinitions(new ClassPathResource("ch3/setterinjection.spring/spring.xml-bean-factory-config.xml"));
		Oracle oracle = (Oracle) factory.getBean("oracle");
		System.out.println(oracle.defineMeaningOfLife());
	}
}