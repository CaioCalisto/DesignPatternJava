package builder.example.houses.windows;

import builder.example.houses.Item;

public class Awning extends Item {
    @Override
    public String GetName() {
        return "Awning window";
    }

    @Override
    public double GetPrice() {
        return 0;
    }
}
