package com.apress.prospring5.ch2.deucopled;

import java.io.*;
import java.util.Properties;

public class MessageSupportFactory {
    private static MessageSupportFactory instance;

    private Properties props;
    private MessageRenderer renderer;
    private MessageProvider provider;

    private MessageSupportFactory() {
        props = new Properties();

        try (InputStream input = MessageSupportFactory.class.getClassLoader().getResourceAsStream("msf.properties")) {
//            props.setProperty("renderer.class", "com.apress.prospring5.ch2.decoupled.StandardOutMessageRenderer");
//            props.setProperty("provider.class", "com.apress.prospring5.ch2.decoupled.HelloWorldMessageProvider");

            if (input == null) {
                System.out.println("Sorry, unable to find msf.properties");
                return;
            }

            props.load(input);

            System.out.println(props);

//            Class<? extends MessageSupportFactory> clazz = this.getClass();
//            FileReader fileReader = new FileReader("\\msf.properties");
//            props.load(fileReader);
//            InputStream stream = clazz.getResourceAsStream("com/apress/prospring5/ch2/deucopled/msf.properties");
//            props.load(stream);

            String rendererClass = props.getProperty("renderer.class");
            String providerClass = props.getProperty("provider.class");

            renderer = (MessageRenderer) Class.forName(rendererClass).getDeclaredConstructor().newInstance();
            provider = (MessageProvider) Class.forName(providerClass).getDeclaredConstructor().newInstance();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static {
        instance = new MessageSupportFactory();
    }

    public static MessageSupportFactory getInstance() {
        return instance;
    }

    public MessageRenderer getRenderer() {
        return renderer;
    }

    public MessageProvider getProvider() {
        return provider;
    }
}
