package com.wxsl.hermia.creational.abstractfactory;

public interface DigitalFactory {

    /**
     * 抽象工厂方法
     */
    Phone createPhone();

    /**
     * 抽象工厂方法
     */
    Pad createPad();
}
