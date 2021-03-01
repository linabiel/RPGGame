package player;

import item.Item;
import player.action.Spell;

import java.util.ArrayList;

public class Player {
    private String name;
    private PlayerType playerClass;
    private int health;
    private int mana;
    private int stamina;
    private int level;
    private int experience;
    private CharacterEquipment characterEquipment;
    private Inventory inventory;
    private ArrayList<Spell> spells;

    public Player(String name, PlayerType playerClass, int health, int mana, int stamina, int level, int experience) {
        this.name = name;
        this.playerClass = playerClass;
        this.health = health;
        this.mana = mana;
        this.stamina = stamina;
        this.level = level;
        this.experience = experience;
    }

    public void constructCharacterEquipment(
            Item weapon, Item helmet, Item shoulders, Item chest, Item legs, Item boots, Item gloves, Item belt) {
        characterEquipment = new CharacterEquipment(
                weapon, helmet, shoulders, chest, legs, boots, gloves, belt);
    }

    public void constructInventory(ArrayList<Item> items) {
        inventory = new Inventory(items);
    }

    public void constructSpells(ArrayList<Spell> spells) {
        spells = new Spell(spells);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PlayerType getPlayerClass() {
        return playerClass;
    }

    public void setPlayerClass(PlayerType playerClass) {
        this.playerClass = playerClass;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
