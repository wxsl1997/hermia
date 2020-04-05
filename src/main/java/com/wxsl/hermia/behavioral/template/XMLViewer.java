package com.wxsl.hermia.behavioral.template;

public class XMLViewer extends DataViewer {

    @Override
    protected void display(String data) {
        System.out.println("xml:" + data);
    }
}
