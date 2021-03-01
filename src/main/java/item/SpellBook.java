package item;

import player.PlayerType;
import player.action.Spell;

import java.util.ArrayList;

public class SpellBook extends Item {
    private int levelRequired;
    private ArrayList<PlayerType> classRequired;
    private Spell spell;

    public SpellBook(ItemType itemType, int levelRequired, ArrayList<PlayerType> classRequired, Spell spell) {
        super(itemType, null, null);
        this.levelRequired = levelRequired;
        this.classRequired = classRequired;
        this.spell = spell;
    }
}