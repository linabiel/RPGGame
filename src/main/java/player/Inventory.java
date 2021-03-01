package player;

import item.Item;

import java.util.ArrayList;

public class Inventory {
    private ArrayList<Item> items;

    public Inventory(ArrayList<Item> items) {
        this.items = items;
    }

    public boolean addItem(Item item) {
        return items.add(item);
    }

    public boolean removeItem(Item item) {
        return items.remove(item);
    }

    public boolean containsItem(Item item) {
        return items.contains(item);
    }
}
