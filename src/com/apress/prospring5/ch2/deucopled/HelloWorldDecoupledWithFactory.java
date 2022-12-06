package com.apress.prospring5.ch2.deucopled;

public class HelloWorldDecoupledWithFactory {

    public static void main(String[] args) {
        MessageProvider provider = MessageSupportFactory.getInstance().getProvider();
        MessageRenderer renderer = MessageSupportFactory.getInstance().getRenderer();

        renderer.setMessageProvider(provider);
        renderer.render();
    }
}
