package abstractfactory.example.shapes;

import abstractfactory.example.AbstractFactory;

public class ShapeFactory extends AbstractFactory {
    @Override
    protected Shape GetShape(String shapeName) {
        if (shapeName.equalsIgnoreCase("rectangle"))
            return new Rectangle();

        throw new UnsupportedOperationException();
    }
}
