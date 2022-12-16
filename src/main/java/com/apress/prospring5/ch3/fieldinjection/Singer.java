package com.apress.prospring5.ch3.fieldinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Singer {
    @Autowired
    private Inspiration inspirationBean;

    public Singer(Inspiration inspirationBean) {
        this.inspirationBean = inspirationBean;
    }

    public void sing() {
        System.out.println("..." + inspirationBean.getLyric());
    }
}
