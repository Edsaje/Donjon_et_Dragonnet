package fr.campus.donjon_et_dragonnet.entity.player_class;

import fr.campus.donjon_et_dragonnet.equipment.DefensiveEquipment;
import fr.campus.donjon_et_dragonnet.equipment.OffensiveEquipment;
import fr.campus.donjon_et_dragonnet.entity.Character;

public class Wizard extends Character {

    public Wizard(String name) {

        super("Mage",name, 7, 7, new OffensiveEquipment("Spell","Sort pour se gratter le dos",0), new DefensiveEquipment("Potion","Shampoing", 0));
    }

}