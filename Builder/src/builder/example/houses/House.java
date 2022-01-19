package builder.example.houses;

import java.util.ArrayList;
import java.util.List;

public class House {
    List<Item> items;

    public House(){
        items = new ArrayList<Item>();
    }

    public void AddItem(Item item){
        items.add(item);
    }

    public String GetAllItems(){
        String allItems = "";
        for (int i = 0; i < items.size(); i++){
            allItems = allItems.concat(" " + items.get(i).GetName());
        }
        return allItems;
    }
}
