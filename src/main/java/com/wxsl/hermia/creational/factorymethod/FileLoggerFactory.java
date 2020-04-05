package com.wxsl.hermia.creational.factorymethod;

public class FileLoggerFactory implements LoggerFactory {

    @Override
    public Logger logger() {
        return new FileLogger();
    }
}
