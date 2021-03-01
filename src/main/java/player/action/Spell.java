package player.action;

import spell.SpellType;

public class Spell {
    private int power;

    private SpellType spellType;

    public Spell(int power, SpellType spellType) {
        this.power = power;
        this.spellType = spellType;
    }

    public int getPower(){
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public SpellType getSpellType() {
        return spellType;
    }
}
