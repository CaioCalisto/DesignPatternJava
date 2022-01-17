package abstractfactory.example;

import abstractfactory.example.shapes.RoundedShapeFactory;
import abstractfactory.example.shapes.ShapeFactory;

public class FactoryProducer {
    public static AbstractFactory GetFactory(boolean rounded){
        if (rounded)
            return new RoundedShapeFactory();
        else
            return new ShapeFactory();
    }
}
