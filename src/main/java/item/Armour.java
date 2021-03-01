package item;

public class Armour extends Item {
    private int physicalDefence;
    private int magicalDefence;

    public Armour(ItemType itemType, int manaRegeneration, int healthRegeneration, int physicalDefence, int magicalDefence) {
        super(itemType, manaRegeneration, healthRegeneration);
        this.physicalDefence = physicalDefence;
        this.magicalDefence = magicalDefence;
    }

    public int getPhysicalDefence() {
        return physicalDefence;
    }

    public void setPhysicalDefence(int physicalDefence) {
        this.physicalDefence = physicalDefence;
    }

    public int getMagicalDefence() {
        return magicalDefence;
    }

    public void setMagicalDefence(int magicalDefence) {
        this.magicalDefence = magicalDefence;
    }
}
