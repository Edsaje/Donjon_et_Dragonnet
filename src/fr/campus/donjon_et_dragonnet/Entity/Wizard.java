package fr.campus.donjon_et_dragonnet.Entity;

import fr.campus.donjon_et_dragonnet.Item.DefensiveEquipment;
import fr.campus.donjon_et_dragonnet.Item.OffensiveEquipment;

public class Wizard extends Character {

    public Wizard(String name) {

        super("Mage",name, 7, 7, new OffensiveEquipment("Spell","Sort pour se gratter le dos",0), new DefensiveEquipment("Potion","Shampoing", 0));
    }

}