package builder.example;

import builder.example.houses.House;
import builder.example.houses.doors.Framed;
import builder.example.houses.garages.Colonial;
import builder.example.houses.roofs.DutchGable;
import builder.example.houses.walls.Cavity;
import builder.example.houses.windows.Awning;

public class Builder {
    public House CreateHouseType1()
    {
        House house = new House();
        house.AddItem(new Framed());
        house.AddItem(new Colonial());
        house.AddItem(new DutchGable());
        house.AddItem(new Cavity());
        house.AddItem(new Awning());
        return house;
    }
}
