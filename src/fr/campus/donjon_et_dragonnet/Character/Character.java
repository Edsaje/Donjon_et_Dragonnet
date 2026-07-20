package fr.campus.donjon_et_dragonnet.Character;

public class Character {
    // 1. Les attributs (en 'protected' pour que les enfants puissent les voir)
    protected String name;
    protected int healthLevel;
    protected int attackStrength;

    // 2. Le Constructeur

    public Character(String name, int healthLevel, int attackStrength){
        this.name = name;
        this.healthLevel = healthLevel;
        this.attackStrength = attackStrength;

    }
}

    // 3. Les Getters et Setters (on les imagine déjà codés pour gagner du temps)