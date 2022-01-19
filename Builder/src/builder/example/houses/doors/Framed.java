package builder.example.houses.doors;

import builder.example.houses.Item;

public class Framed extends Item {
    @Override
    public String GetName() {
        return "Framed Door";
    }

    @Override
    public double GetPrice() {
        return 0;
    }
}
