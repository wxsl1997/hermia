package com.wxsl.hermia.creational.factorymethod;

public class ConsoleLoggerFactory implements LoggerFactory {

    @Override
    public Logger logger() {
        return new ConsoleLogger();
    }
}
