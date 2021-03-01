package player;

import item.Item;

public class CharacterEquipment {
    private Item weapon;
    private Item helmet;
    private Item shoulders;
    private Item chest;
    private Item legs;
    private Item boots;
    private Item gloves;
    private Item belt;

    public CharacterEquipment(Item weapon, Item helmet, Item shoulders, Item chest, Item legs, Item boots, Item gloves, Item belt) {
        this.weapon = weapon;
        this.helmet = helmet;
        this.shoulders = shoulders;
        this.chest = chest;
        this.legs = legs;
        this.boots = boots;
        this.gloves = gloves;
        this.belt = belt;
    }

    public Item getWeapon() {
        return weapon;
    }

    public void setWeapon(Item weapon) {
        this.weapon = weapon;
    }

    public Item getHelmet() {
        return helmet;
    }

    public void setHelmet(Item helmet) {
        this.helmet = helmet;
    }

    public Item getShoulders() {
        return shoulders;
    }

    public void setShoulders(Item shoulders) {
        this.shoulders = shoulders;
    }

    public Item getChest() {
        return chest;
    }

    public void setChest(Item chest) {
        this.chest = chest;
    }

    public Item getLegs() {
        return legs;
    }

    public void setLegs(Item legs) {
        this.legs = legs;
    }

    public Item getBoots() {
        return boots;
    }

    public void setBoots(Item boots) {
        this.boots = boots;
    }

    public Item getGloves() {
        return gloves;
    }

    public void setGloves(Item gloves) {
        this.gloves = gloves;
    }

    public Item getBelt() {
        return belt;
    }

    public void setBelt(Item belt) {
        this.belt = belt;
    }
}
