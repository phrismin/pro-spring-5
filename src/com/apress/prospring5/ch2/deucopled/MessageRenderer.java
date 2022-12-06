package com.apress.prospring5.ch2.deucopled;

public interface MessageRenderer {

    void render();

    void setMessageProvider(MessageProvider messageProvider);

    MessageProvider getMessageProvider();

}
