package builder.example.houses.roofs;

import builder.example.houses.Item;

public class DutchGable extends Item {
    @Override
    public String GetName() {
        return "Dutch gable roof";
    }

    @Override
    public double GetPrice() {
        return 0;
    }
}
