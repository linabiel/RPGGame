package item;

public class Item {
    private ItemType itemType;
    private int manaRegeneration;
    private int healthRegeneration;

    public Item(ItemType itemType, Integer manaRegeneration, Integer healthRegeneration) {
        this.itemType = itemType;
        this.manaRegeneration = manaRegeneration;
        this.healthRegeneration = healthRegeneration;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    public int getManaRegeneration() {
        return manaRegeneration;
    }

    public void setManaRegeneration(int manaRegeneration) {
        this.manaRegeneration = manaRegeneration;
    }

    public int getHealthRegeneration() {
        return healthRegeneration;
    }

    public void setHealthRegeneration(int healthRegeneration) {
        this.healthRegeneration = healthRegeneration;
    }
}
