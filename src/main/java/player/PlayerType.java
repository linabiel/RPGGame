package player;

public enum PlayerType {
    BLADE_KNIGHT  (40, 10, 30),
    DRAGON_KNIGHT (30, 10, 40),
    WIZARD(20, 40, 10),
    SHAMAN (25,30, 20),
    PALADIN (35, 25, 35),
    TEMPLAR (50, 20, 40),
    ;

    public int health;
    public int mana;
    public int stamina;

    PlayerType (int health, int mana, int stamina) {
        this.health = health;
        this.mana = mana;
        this.stamina = stamina;
    }
}
