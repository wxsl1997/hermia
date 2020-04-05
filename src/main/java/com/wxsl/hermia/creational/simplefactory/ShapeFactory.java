package com.wxsl.hermia.creational.simplefactory;

import static com.wxsl.hermia.creational.simplefactory.ShapeType.CIRCLE;
import static com.wxsl.hermia.creational.simplefactory.ShapeType.RECTANGLE;

public class ShapeFactory {

    /**
     * 创建 Shape 对象
     */
    static Shape createShape(ShapeType type) {

        if (CIRCLE.equals(type)) {
            return new Circle();
        }

        if (RECTANGLE.equals(type)) {
            return new Rectangle();
        }

        throw new UnsupportedOperationException();
    }

    /**
     * 创建Circle对象
     */
    public static Shape createCircle() {
        return new Circle();
    }
}
