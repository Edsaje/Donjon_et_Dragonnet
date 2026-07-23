package fr.campus.donjon_et_dragonnet.entity.player_class;

import fr.campus.donjon_et_dragonnet.equipment.DefensiveEquipment;
import fr.campus.donjon_et_dragonnet.equipment.OffensiveEquipment;
import fr.campus.donjon_et_dragonnet.entity.Character;

public class Warrior extends Character {

    // Le constructeur du Guerrier ne demande QUE le nom,
    // car on connait déjà ses stats de base !
    public Warrior(String name) {

        // super() appelle le constructeur de la classe mère (Character)
        // Il attend 3 choses : un nom, des PV, de l'attaque.
        super("Guerrier",name, 10, 5, new OffensiveEquipment("Weapon","Epée rouillée",0), new DefensiveEquipment("Shield","Bouclier usé",0));
    }
}