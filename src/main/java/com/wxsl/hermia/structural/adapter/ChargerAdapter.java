package com.wxsl.hermia.structural.adapter;

import static com.wxsl.hermia.structural.adapter.Device.LAPTOP;
import static com.wxsl.hermia.structural.adapter.Device.PHONE;

/**
 * 适配器类
 */
public class ChargerAdapter implements Charge {


    @Override
    public void charge(Device device) {
        if (PHONE.equals(device)) {
            PhoneCharge.chargeForPhone();
        }

        if (LAPTOP.equals(device)) {
            LaptopCharge.chargeForLaptop();
        }
    }
}
