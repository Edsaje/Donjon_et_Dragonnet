package fr.campus.donjon_et_dragonnet.Character;

public class Wizard {
    //Attributs
    private String name;
    private int attackLevel = 8;
    private int health = 6;

    public Wizard() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttackLevel() {
        return attackLevel;
    }

    public void setAttackLevel(int attackLevel) {
        this.attackLevel = attackLevel;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
