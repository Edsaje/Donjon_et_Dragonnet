package fr.campus.donjon_et_dragonnet.Character;

public class Character {
    //Attributs
    private String type;
    private String name;
    private int health;
    private int attackLevel;
    private String offensiveEquipment;

    //Constructeur
    public Character(String type, String name, int health, int attackLevel, String offensiveEquipment) {
        this.type = type;
        this.name = name;
        this.health = health;
        this.attackLevel = attackLevel;
        this.offensiveEquipment = offensiveEquipment;
    }

    //Getter
    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getAttackLevel() {
        return attackLevel;
    }

    public String getOffensiveEquipment() {
        return offensiveEquipment;
    }

    //Setter

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setAttackLevel(int attackLevel) {
        this.attackLevel = attackLevel;
    }

    public void setOffensiveEquipment(String offensiveEquipment) {
        this.offensiveEquipment = offensiveEquipment;
    }

    //toString
    @Override
    public String toString(){
        return "Le nom du personnage est " + name + " et est de classe " + type + ".\n" +
                " Il possède " + health + " points de vie, une force d'attaque de " + attackLevel +
                " points avec comme équipement un(e) " + getOffensiveEquipment() + ".";
    }
}
