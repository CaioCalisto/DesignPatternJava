package abstractfactory.example;

import abstractfactory.example.shapes.Shape;

public abstract class AbstractFactory {
    protected abstract Shape GetShape(String shapeName);
}
