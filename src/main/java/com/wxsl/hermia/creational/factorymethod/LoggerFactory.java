package com.wxsl.hermia.creational.factorymethod;

public interface LoggerFactory {

    /**
     * 抽象工厂方法
     */
    Logger logger();

    /**
     * 工厂方法隐藏
     */
    default void writeLog() {
        logger().writeLog();
    }
}
