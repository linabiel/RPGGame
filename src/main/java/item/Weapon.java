package item;

public class Weapon extends Item {
    private WeaponType weaponType;
    private int attackPower;

    public Weapon(ItemType itemType, int manaRegeneration, int healthRegeneration, WeaponType weaponType, int attackPower) {
        super(itemType, manaRegeneration, healthRegeneration);
        this.weaponType = weaponType;
        this.attackPower = attackPower;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }
}