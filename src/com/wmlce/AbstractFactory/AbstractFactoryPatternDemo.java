package com.wmlce.AbstractFactory;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        //获取形状工厂
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        //获取形状为Circle的对象
        Shape shape1 = shapeFactory.getShape("CIRCLE");

        //调用Circle的draw方法
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("RECTANGLE");

        shape2.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        Color color1 = colorFactory.getColor("RED");
        color1.fill();
    }
}
