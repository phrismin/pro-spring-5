package com.apress.prospring5.ch3.fieldinjection;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Created by iuliana.cosmina on 2/15/17.
 */
public class FieldInjection {

	public static void main(String... args) {

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("ch3/spring/app-context.xml");
		ctx.refresh();

		Singer singerBean = ctx.getBean(Singer.class);
		singerBean.sing();

		ctx.close();
	}
}
