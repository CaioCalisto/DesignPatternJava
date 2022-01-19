package builder.example.houses.walls;

import builder.example.houses.Item;

public class Cavity extends Item {
    @Override
    public String GetName() {
        return "Cavity wall";
    }

    @Override
    public double GetPrice() {
        return 0;
    }
}
