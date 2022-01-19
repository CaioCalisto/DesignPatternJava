package builder.example.houses.garages;

import builder.example.houses.Item;

public class Colonial extends Item {
    @Override
    public String GetName() {
        return "Colonial garage";
    }

    @Override
    public double GetPrice() {
        return 0;
    }
}