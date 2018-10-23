package com.wmlce.factory;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        //获取Circle对象,并调用它的draw方法
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        //获取RECTANGLE的对象
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        //获取SQUARE对象
        Shape shape3 = shapeFactory.getShape("SQUARE");

        shape1.draw();
        shape2.draw();
        shape3.draw();
    }
}
