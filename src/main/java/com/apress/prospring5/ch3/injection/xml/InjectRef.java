package com.apress.prospring5.ch3.injection.xml;

import com.apress.prospring5.ch3.setterinjection.Oracle;
import org.springframework.context.support.GenericXmlApplicationContext;

public class InjectRef {
    private Oracle oracle;

    public void setOracle(Oracle oracle) { 
        this.oracle = oracle;
    }

    public static void main(String... args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("ch3/injection/app-context-xml.xml");
        ctx.refresh();

        InjectRef injectRef = (InjectRef) ctx.getBean("injectRef");
        System.out.println(injectRef);

        ctx.close();
    }

    public String toString() {
        return oracle.defineMeaningOfLife();
    }
}
