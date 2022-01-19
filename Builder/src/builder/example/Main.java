package builder.example;

import builder.example.houses.House;

public class Main {

    public static void main(String[] args) {
	    Builder builder = new Builder();
        House house = builder.CreateHouseType1();

        System.out.println(house.GetAllItems());
    }
}
