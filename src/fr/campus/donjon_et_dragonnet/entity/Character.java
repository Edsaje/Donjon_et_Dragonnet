package fr.campus.donjon_et_dragonnet.entity;

import fr.campus.donjon_et_dragonnet.equipment.DefensiveEquipment;
import fr.campus.donjon_et_dragonnet.equipment.OffensiveEquipment;

public class Character {
    // 1. Les attributs (en 'protected' pour que les enfants puissent les voir)
    protected String type;
    protected String name;
    protected int healthLevel;
    protected int attackStrength;
    protected OffensiveEquipment offensiveEquipment = new OffensiveEquipment("Baton", "Baton", 1);
    protected DefensiveEquipment defensiveEquipment = new DefensiveEquipment("Potion","Potion de vie",4);

    // 2. Le Constructeur


    public Character(String type, String name, int healthLevel, int attackStrength){
        this.type = type;
        this.name = name;
        this.healthLevel = healthLevel;
        this.attackStrength = attackStrength;

    }

    public Character(String type, String name, int healthLevel, int attackStrength, OffensiveEquipment offensiveEquipment, DefensiveEquipment defensiveEquipment){
        this.type = type;
        this.name = name;
        this.healthLevel = healthLevel;
        this.attackStrength = attackStrength;
        this.offensiveEquipment = offensiveEquipment;
        this.defensiveEquipment = defensiveEquipment;

    }

    //méthodes (fonction/actions et getters/setters)

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public DefensiveEquipment getDefensiveEquipment() {
        return defensiveEquipment;
    }

    public void setDefensiveEquipment(DefensiveEquipment defensiveEquipment) {
        this.defensiveEquipment = defensiveEquipment;
    }

    public OffensiveEquipment getOffensiveEquipment() {
        return offensiveEquipment;
    }

    public void setOffensiveEquipment(OffensiveEquipment offensiveEquipment) {
        this.offensiveEquipment = offensiveEquipment;
    }

    public int getAttackStrength() {
        return attackStrength;
    }

    public void setAttackStrength(int attackStrength) {
        this.attackStrength = attackStrength;
    }

    public int getHealthLevel() {
        return healthLevel;
    }

    public void setHealthLevel(int healthLevel) {
        this.healthLevel = healthLevel;
    }

    //toString
    @Override
    public String toString() {
        return name + " est un(e) "
                + type + " avec "
                + healthLevel + " point(s) de vie. Sa force de base s'élève à "
                + attackStrength + " point(s). Il possède un(e) "
                + offensiveEquipment.getName() + " et un(e) "
                + defensiveEquipment.getName() + ".";

    }
}