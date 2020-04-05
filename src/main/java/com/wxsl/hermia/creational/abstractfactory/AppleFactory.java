package com.wxsl.hermia.creational.abstractfactory;

public class AppleFactory implements DigitalFactory {

    @Override
    public Phone createPhone() {
        return new ApplePhone();
    }

    @Override
    public Pad createPad() {
        return new ApplePad();
    }
}
