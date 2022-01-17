package abstractfactory.example.shapes;

import abstractfactory.example.AbstractFactory;

public class RoundedShapeFactory extends AbstractFactory {
    @Override
    protected Shape GetShape(String shapeName) {
        if (shapeName.equalsIgnoreCase("rectangle"))
            return new RoundedRectangle();
        else if (shapeName.equalsIgnoreCase("square"))
            return new RoundedSquare();

        throw new UnsupportedOperationException();
    }
}
